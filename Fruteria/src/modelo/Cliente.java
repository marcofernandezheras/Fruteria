package modelo;

import java.awt.Color;
import java.io.Serializable;

public class Cliente implements Modificable, Serializable {

	/************************************
	 * /* Atributos *
	 ************************************/

	private String dni;
	private String nombre;
	private String apellidos;
	private Color colorPelo;

	/************************************
	 * /* Constructor/es *
	 ************************************/

	/**
	 * @Descripci�n: Crea un cliente por su dni, nombre, apellidos y color de
	 *               pelo
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param colorPelo
	 */

	public Cliente(String dni, String nombre, String apellidos, Color colorPelo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.colorPelo = colorPelo;
	}

	/************************************
	 * /* Getters & Setters *
	 ************************************/

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Color getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(Color colorPelo) {
		this.colorPelo = colorPelo;
	}

	/************************************
	 * /* Metodos *
	 ************************************/

	/**
	 * @Descripci�n: Sirva para fijar una variable para luego modificar un
	 *               cliente
	 */

	@Override
	public Object identificador() {
		return dni;
	}

	// Tiempo en realizarlo 15 min
}
