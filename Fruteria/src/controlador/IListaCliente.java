package controlador;

import modelo.Cliente;

public interface IListaCliente {

	/**
	 * Busca un {@link Cliente} en la lista.
	 * @param nombre Nombre del {@link Cliente} a buscar.
	 * @param apellidos Apellidos del {@link Cliente} a buscar.
	 * @return {@link Cliente} o <code>null</code> si no existe.
	 */
	public Cliente buscarCliente(String nombre, String apellidos);

	/**
	 * Inserta un {@link Cliente} a la lista.
	 * @param cliente {@link Cliente} a insertar.
	 * @return <code>true</code> en caso de éxito, <code>false</code> en caso contrario.
	 */
	public boolean altaCliente(Cliente cliente);

	/**
	 * Modifica un {@link Cliente} de la lista.
	 * @param cliente {@link Cliente} a modificar.
	 * @return <code>true</code> en caso de éxito, <code>false</code> en caso contrario.
	 */
	public boolean modificarCliente(Cliente cliente);

}
