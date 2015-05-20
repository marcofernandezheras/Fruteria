package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Pedido implements Serializable{

	/************************************
	 * /* Atributos *
	 ************************************/

	private int numeroPedido;
	private ArrayList<LineaPedido> lineaPedido;
	private Cliente cliente;

	/************************************
	 * /* Constructor/es *
	 ************************************/

	/**
	 * @Descripci�n: Constructo de linea pedido
	 * @param numeroPedido
	 */
	public Pedido(int numeroPedido) {
		super();
		this.numeroPedido = numeroPedido;
		lineaPedido= new ArrayList<LineaPedido>();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/************************************
	 * /* Getters & Setters *
	 ************************************/
	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public ArrayList<LineaPedido> getLineasPedido() {
		return lineaPedido;
	}

	/************************************
	 * /* Metodos *
	 ************************************/

	public void anadirLinea(Articulo articulo, int cantidad) {
		lineaPedido.add(new LineaPedido(articulo, cantidad));
	}


	public float getTotalPedido() {
		float suma = 0;
		for (int i = 0; i < lineaPedido.size(); i++) {

			suma = suma + lineaPedido.get(i).getTotalLinea();
		}
		return suma;
	}
	
	// Tiempo en realizarlo 20 min
}
