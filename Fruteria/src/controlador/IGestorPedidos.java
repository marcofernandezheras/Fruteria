package controlador;

import modelo.Articulo;
import modelo.Cliente;
import modelo.LineaPedido;
import modelo.Pedido;

public interface IGestorPedidos {
	
	/**
	 * Busca un {@link Pedido} en la lista.
	 * @param numero Numero del {@link Pedido} a buscar.
	 * @return {@link Pedido} con numero <code>numero</code> o <code>null</code> si no existe.
	 */
	public Pedido buscarPedido(int numero);

	/**
	 * Crea un nuevo {@link Pedido} y lo usa como actual.
	 * @return <code>true</code> en caso de éxito, <code>false</code> en caso contrario.
	 */
	public boolean altaPedido();
	
	/**
	 * Inserta una {@link LineaPedido} en el {@link Pedido} actual.
	 * @param articulo {@link Articulo} de la linea.
	 * @param cantidad numero de articulos.
	 * @return <code>true</code> en caso de éxito, <code>false</code> en caso contrario.
	 */
	public boolean addLineaPedido(Articulo articulo, int cantidad);
	
	/**
	 * Inserta el {@link Cliente} en el {@link Pedido} actual.
	 * @param cliente {@link Cliente} a insertar.
	 * @return <code>true</code> en caso de éxito, <code>false</code> en caso contrario.
	 */	
	public boolean insertarCliente(Cliente cliente);
	
	/**
	 * Guarda el {@link Pedido} actual.
	 * @return <code>true</code> en caso de éxito, <code>false</code> en caso contrario.
	 */
	public boolean guardarPedido();
}
