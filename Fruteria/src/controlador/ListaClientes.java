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

	@Override
	public Cliente buscarCliente(String nombre, String apellidos) {

		for (int i = 0; i < clientes.size(); i++) {

			if (nombre == clientes.get(i).getNombre() && apellidos == clientes.get(i).getApellidos()) {
				return clientes.get(i);
			}

		}

		return null;
	}

	@Override
	public boolean altaCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

}
