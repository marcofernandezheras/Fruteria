package modelo;

import java.io.Serializable;

public interface Modificable extends Serializable{
	/**
	 * Identificador que no debe ser único para cada instancia
	 * y no debe cambiar nunca en la instancia 
	 * o en su representación en datos.
	 * Ejemplo: DNI de un cliente.
	 * @return identificador de esta instancia.
	 */
	Object identificador();
}
