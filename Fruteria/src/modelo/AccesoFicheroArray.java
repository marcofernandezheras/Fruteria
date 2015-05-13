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
import java.util.ArrayList;
import java.util.List;

public class AccesoFicheroArray implements IAccesoDatos {

	List<Object> listaObjectos = new ArrayList<Object>();
	private File archivo = null;
	private int index = 0;
	
	public AccesoFicheroArray(File archivo) throws IOException, ClassNotFoundException {
		if(!archivo.exists())
			throw new FileNotFoundException();
		this.archivo = archivo;	
		ObjectInputStream stream = getInStream();
		try{
			while (true) {
				listaObjectos.add(stream.readObject());			
			}
		}
		catch (EOFException e){/* Capturo el final del archivo como fin del bucle*/}
	}
	
	private ObjectOutputStream getOutStream() throws IOException{
		BufferedOutputStream buffer = new BufferedOutputStream(new FileOutputStream(archivo));
		return new ObjectOutputStream(buffer);
	}
	
	private ObjectInputStream getInStream() throws FileNotFoundException, IOException{
		return new ObjectInputStream(new BufferedInputStream(new FileInputStream(archivo)));
	}
	
	@Override
	public void close() throws Exception {
	}

	@Override
	public Object leerObjeto() {
		if(index >= listaObjectos.size())
			return null;
		Object object = listaObjectos.get(index);
		index++;
		return object;
	}

	@Override
	public boolean escribirObjeto(Object objeto) {
		listaObjectos.add(objeto);		
		try(ObjectOutputStream outStream = getOutStream();)
		{
			outStream.writeObject(objeto);
			return true;
		} catch (IOException e) {
			return false;
		}		
	}

	@Override
	public boolean modificarObjeto(Modificable objeto, Object identificador) {
		// TODO Auto-generated method stub
		return false;
	}

}
