package modelo;

import java.io.Serializable;

public class LineaPedido implements Serializable {

	/************************************
	 * /* Atributos *
	 ************************************/

	private int cantidad;
	private Articulo articulo;

	/************************************
	 * /* Constructor/es *
	 ************************************/
	/**
	 * @Descripci�n: Crea una linea de pedido con un articulo, la cantidad del
	 *                 mismo y calculando la cantidad total de la linea
	 * @param articulo
	 * @param cantidad
	 */
	public LineaPedido(Articulo articulo, int cantidad) {

		if (articulo != null) {
			this.articulo = articulo;
			this.cantidad = cantidad;
		}
		else
			throw new NullPointerException("Articulo nulo");
	}

	/************************************
	 * /* Getters & Setters *
	 ************************************/

	public int getCantidad() {
		return cantidad;
	}

	public float getTotalLinea() {
		return this.articulo.getPVP() * cantidad;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	// Tiempo en realizarlo 15 min + 5 min para arreglar constructor
}