package modelo;

import java.io.Serializable;

public class Articulo implements Serializable{
	/************************************
	 * /* Constantes *
	 ************************************/

	private static float IVA = 1.21f;

	/************************************
	 * /* Atributos *
	 ************************************/

	private String nombre;
	private String descripcion;
	private float precio;

	/************************************
	 * /* Constructor/es *
	 ************************************/

	/**
	 * @Descripci�n: Crea un articulo con un nombre, una descripcion y un precio
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 */
	
	public Articulo(String nombre, String descripcion, float precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	/************************************
	 * /* Getters & Setters *
	 ************************************/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/************************************
	 * /* Metodos *
	 ************************************/
	
	/**
	 * @Descripci�n: Metodo que te calculo el pvp 
	 * @return el valor del pvp:float
	 */
	
	public float getPVP(){
		return (getPrecio()*IVA );
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if(obj instanceof Articulo){
			Articulo other = (Articulo)obj;
			boolean valid = other.descripcion.equalsIgnoreCase(descripcion);
			valid &= other.nombre.equalsIgnoreCase(nombre);
			valid &= other.precio == precio;
			return valid;
		}
		return super.equals(obj);
	}
	// Tiempo en realizarlo 15 min con javadoc incluido
}