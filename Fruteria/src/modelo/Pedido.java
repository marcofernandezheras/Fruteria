package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Pedido implements Serializable{

	/************************************
	 * /* Atributos *
	 ************************************/

	private int numeroPedido;
	private ArrayList<LineaPedido> lineaPedido;

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
		lineaPedido=null;
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

	public ArrayList<LineaPedido> getLineaPedido() {
		return lineaPedido;
	}

	public void setLineaPedido(ArrayList<LineaPedido> lineaPedido) {
		this.lineaPedido = lineaPedido;
	}

	/************************************
	 * /* Metodos *
	 ************************************/

	public void anadirLinea(LineaPedido linea) {
		lineaPedido.add(linea);
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
