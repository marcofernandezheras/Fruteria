package modelo;

import java.io.Serializable;

public interface IAccesoDatos extends AutoCloseable{
	/**
	 * Leer un nuevo objeto desde su forma
	 * serializada
	 * @return Nuevo objeto o <code>null</code> si se llego al final del fichero.
	 */
	Object leerObjeto();
	
	/**
	 * Serializar un objeto.
	 * @param objeto a serializar.
	 * @return <code>true</code> en caso de �xito, <code>false</code> en caso contrario.
	 */
	boolean escribirObjeto(Serializable objeto);
	
	/**
	 * Modifica un objeto anteriormente serializado.
	 * @param objeto Objeto a modificar.
	 * @param identificador identificador del objeto.
	 * @return <code>true</code> en caso de �xito, <code>false</code> en caso contrario.
	 */
	boolean modificarObjeto(Modificable objeto, Object identificador);
}
