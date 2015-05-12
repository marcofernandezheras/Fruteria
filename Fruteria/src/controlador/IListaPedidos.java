package controlador;

import modelo.Pedido;

public interface IListaPedidos {
	
	/**
	 * Busca un {@link Pedido} en la lista.
	 * @param numero Numero del {@link Pedido} a buscar.
	 * @return {@link Pedido} con numero <code>numero</code> o <code>null</code> si no existe.
	 */
	public Pedido buscarPedido(int numero);

	/**
	 * Inserta un {@link Pedido} en la lista.
	 * @param pedido {@link Pedido} a insertar.
	 * @return <code>true</code> en caso de éxito, <code>false</code> en caso contrario.
	 */
	public boolean altaPedido(Pedido pedido);
}
