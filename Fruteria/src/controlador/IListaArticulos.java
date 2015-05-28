package controlador;

import java.util.ArrayList;
import java.util.List;

import modelo.Articulo;

public interface IListaArticulos {

	/**
	 * Busca un {@link Articulo} en la lista.
	 * @param nombre Nombre del articulo a buscar
	 * @return {@link Articulo} de nombre <code>nombre</code> o <code>null</code> si no existe.
	 */
	public Articulo buscarArticulo(String nombre);

	/**
	 * Inserta un nuevo articulo en la lista.
	 * @param articulo {@link Articulo} a insertar.
	 * @return <code>true</code> en caso de éxito, <code>false</code> en caso contrario.
	 */
	public boolean insertarArticulo(Articulo articulo);

	public List<Articulo> listarArticulo();
}
