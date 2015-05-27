package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Vector;

import modelo.AccesoFichero;
import modelo.Articulo;
import modelo.Cliente;

public class ListaClientes implements IListaCliente {

	Vector<Cliente> clientes = new Vector();
	File archivo = new File("cliente.txt");
	AccesoFichero accesoFichero;
	Object cliente = new Object();

	/**
	 * constructor
	 * 
	 * instancia la clase accesoFichero y rellen el vector clientes el vector
	 * termina de completarse cuando leerObjeto devuelve null
	 */

	public ListaClientes() {
		try {

			accesoFichero = new AccesoFichero(archivo);

			cliente = accesoFichero.leerObjeto();

			while (cliente != null) {

				clientes.add((Cliente) cliente);
				cliente = accesoFichero.leerObjeto();

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * buscarCliente
	 * 
	 * Busca en el vector clientes uno que cumpla con el nombre y apellidos de
	 * entrada.
	 * 
	 * @param nombre
	 * @param apellidos
	 * @return objeto cliente si lo encuentra o null en el caso contrario.
	 */

	@Override
	public Cliente buscarCliente(String nombre, String apellidos) {

		for (int i = 0; i < clientes.size(); i++) {

			if (nombre.equalsIgnoreCase(clientes.get(i).getNombre()) && apellidos.equalsIgnoreCase(clientes.get(i).getApellidos())) {
				return clientes.get(i);
			}

		}

		return null;
	}

	/**
	 * 
	 * @param cliente
	 * @return true en caso de que el usuario haya sido dado de alta
	 */

	@Override
	public boolean altaCliente(Cliente cliente) {
		if (cliente != null) {
			if (buscarCliente(cliente.getNombre(), cliente.getApellidos()) == null) {

				if (accesoFichero.escribirObjeto(cliente)) {
					clientes.add(cliente);
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * modificarCliente
	 * 
	 * buscar en el vector la posicion del cliente a modificar para pasar el
	 * identificador de ese objeto.
	 * 
	 * @param cliente
	 * @return true en el caso de que el cliente haya podido ser modificado
	 */

	@Override
	public boolean modificarCliente(Cliente cliente, Object identificador) {

		int indentificador = 0;

		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).identificador().equals(identificador)) {

				if (accesoFichero.modificarObjeto(cliente, identificador)) {
					clientes.setElementAt(cliente, i);
					return true;

				}
			}
		}

		return false;

	}

}
