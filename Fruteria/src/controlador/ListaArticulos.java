package controlador;

import java.util.Vector;

import modelo.Articulo;

public class ListaArticulos implements IListaArticulos {

	Vector<Articulo> articulos = new Vector();
	Articulo articulo = new Articulo();

	@Override
	public Articulo buscarArticulo(String nombre) {
		
		for (int i = 0; i < articulos.size(); i++) {
			if (nombre = articulos.get(i).getNombre()) {
				return articulo;
			}
		}

		return null;
	}

	@Override
	public boolean insertarArticulo(Articulo articulo) {
		
		if(buscarArticulo(articulo.getNombre)!=null){
			articulos.add(articulo);
			return true;
		}
		
		return false;
	}

}
