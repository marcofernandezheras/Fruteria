package modelo;

public class Articulo {
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
	
	public float calcularPVP(){
		
		
		return (getPrecio()*IVA );
	}
	
}
