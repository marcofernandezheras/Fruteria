package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Vector;

import modelo.AccesoFichero;
import modelo.Articulo;

public class ListaArticulos implements IListaArticulos {
	

	Vector<Articulo> articulos = new Vector();
	File archivo=new File("articulo.txt");
	AccesoFichero accesoFichero;
	Object articulo=new Object();
	
	/**
	 * constructor
	 * 
	 * Crea una nueva instancia de AccesoFichero y rellena el vector
	 * de objetos al leerlos del archivo.
	 */
	
	public ListaArticulos() {
		try {
			accesoFichero=new AccesoFichero(archivo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		articulo=accesoFichero.leerObjeto();
		
		while (articulo!=null) {
			
			articulos.add((Articulo) articulo);
			articulo=accesoFichero.leerObjeto();
			
		}
		
	}

	@Override
	public Articulo buscarArticulo(String nombre) {
		
		for (int i = 0; i < articulos.size(); i++) {
			if (nombre == articulos.get(i).getNombre()) {
				return articulos.get(i);
			}
		}

		return null;
	}

	@Override
	public boolean insertarArticulo(Articulo articulo) {
		
		if(buscarArticulo(articulo.getNombre())==null){
			
			articulos.add(articulo);
			accesoFichero.escribirObjeto(articulo);
			
			return true;
		}
		
		return false;
	}

}
