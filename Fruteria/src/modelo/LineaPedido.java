package modelo;

public class LineaPedido {

	/************************************
	 * /* Atributos *
	 ************************************/

	private int cantidad;
	private Articulo articulo;

	/************************************
	 * /* Constructor/es *
	 ************************************/
	/**
	 * @Descripción: Crea una linea de pedido con un articulo, la cantidad del
	 *               mismo y calculando la cantidad total de la linea
	 * @param articulo
	 * @param cantidad
	 */
	public LineaPedido(Articulo articulo, int cantidad) {
		super();
		this.articulo = articulo;
		this.cantidad = cantidad;
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

	// Tiempo en realizarlo 15 min
}
