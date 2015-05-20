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
import java.util.ArrayList;
import java.util.List;

public class AccesoFicheroArray implements IAccesoDatos {

	List<Object> listaObjectos = new ArrayList<Object>();
	private File archivo = null;
	private int index = 0;
	
	/**
	 * Crea un acesso a Fichero.
	 * @param archivo Archivo a leer.
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public AccesoFicheroArray(File archivo) throws IOException, ClassNotFoundException {
		if(!archivo.exists())
			throw new FileNotFoundException();
		this.archivo = archivo;	
		if(archivo.exists()){
			ObjectInputStream stream = getInStream();
			listaObjectos = (List<Object>)stream.readObject();
		}
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
		escribirLista();
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
	public boolean escribirObjeto(Serializable objeto) {
		listaObjectos.add(objeto);		
		return escribirLista();		
	}

	@Override
	public boolean modificarObjeto(Modificable objeto, Object identificador) {
		for (int i = 0; i < listaObjectos.size(); i++) 
		{
			Modificable m = (Modificable)listaObjectos.get(i);
			if(m.identificador().equals(identificador))
			{
				listaObjectos.set(i, objeto);
				return escribirLista();	
			}
		}
		return false;
	}

	private boolean escribirLista() {
		try(ObjectOutputStream outStream = getOutStream();)
		{
			outStream.writeObject(listaObjectos);
			return true;
		} catch (IOException e) {
			return false;
		}
	}

}