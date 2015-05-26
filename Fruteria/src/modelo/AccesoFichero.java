package modelo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;


public class AccesoFichero implements IAccesoDatos {

	private File archivo = null;
	private ObjectInputStream inStream = null;
	private ObjectOutputStream outStream = null;
	private int leidos = 0;
	
	public AccesoFichero(File archivo) throws FileNotFoundException {
		this.archivo = archivo;		
	}
	
	private ObjectOutputStream getOutStream(boolean append) throws IOException{
		BufferedOutputStream buffer = new BufferedOutputStream(new FileOutputStream(archivo,append));
		return append ? new AppendObjectOutputStream(buffer) : new ObjectOutputStream(buffer);
	}
	
	private ObjectInputStream getInStream() throws FileNotFoundException, IOException{
		return new ObjectInputStream(new BufferedInputStream(new FileInputStream(archivo)));
	}
	
	@Override
	public Object leerObjeto() {
		try 
		{
			if(inStream == null)
			{
				if(outStream != null)
				{
					outStream.close();
					outStream = null;
				}
				inStream = getInStream();
				for (int i = 0; i < leidos; i++) {
					inStream.readObject();
				}
			}
			Object object = inStream.readObject();
			leidos++;
			return object;
		} catch (ClassNotFoundException | IOException e) {
			return null;
		}		
	}

	@Override
	public boolean escribirObjeto(Serializable objeto) {
		if(objeto == null)
			return false;
		try {
			if(outStream == null)
			{
				if(inStream != null)
				{
					inStream.close();
					inStream = null;
				}				
				outStream = getOutStream(archivo.exists());
			}
			outStream.writeObject(objeto);	
			outStream.flush();
			return true;
		} catch (IOException e) {
			return false;
		} 		
	}

	@Override
	public boolean modificarObjeto(Modificable objeto, Object identificador) {
		boolean modificado = false;
		try {
			this.close();
			List<Object> objectList = new ArrayList<Object>();
			inStream = getInStream();
			try {
				while(true)
				{
					Modificable old = (Modificable)inStream.readObject();
					if (old.identificador().equals(identificador)) 
					{
						objectList.add(objeto);
						modificado = true;
					}
					else
						objectList.add(old);
				}
			} catch (EOFException e) { /*Capturo el final del archivo */}
			
			//Cierro el input para poder abrir el output
			this.close();
			//Abro el stream para grabar el archivo entero
			//XXX Grabar en temporal y renombrar??
			outStream = getOutStream(false);
			for (Object obj : objectList) {
				outStream.writeObject(obj);
			}
			outStream.flush();
			return modificado;			
		} 
		catch (Exception e) 
		{
			try {
				this.close();
			} 
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
			return false;
		}		
	}

	@Override
	public void close() throws Exception {
		if(inStream != null)
		{
			inStream.close();
			inStream = null;
		}
		if(outStream != null)
		{
			outStream.close();
			outStream = null;
		}
	}

}