package controlador;

import java.io.File;
import java.io.FileNotFoundException;

import modelo.AccesoFichero;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;

public class ListaPedidos implements IGestorPedidos {
	File archivo = new File("ListaPedidos.txt");
	AccesoFichero accesoFichero;
	Pedido pedido;

	public ListaPedidos() {
		try {
			accesoFichero = new AccesoFichero(archivo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Pedido buscarPedido(int numero) {
		try {
			accesoFichero = new AccesoFichero(archivo);
		} catch (FileNotFoundException e) {
			return null;
		}
		
		Pedido aux = (Pedido) accesoFichero.leerObjeto();
		while (aux != null) {
			if (aux.getNumeroPedido() == numero)
				return aux;
			else {
				aux = (Pedido) accesoFichero.leerObjeto();
			}
		}
		return null;
	}

private int siguienteNumeroPedido() {

	try {
		accesoFichero = new AccesoFichero(archivo);
	} catch (FileNotFoundException e) {
		return 1;
	}
	
	Pedido aux = (Pedido) accesoFichero.leerObjeto();
	boolean salir = aux == null;
	while (!salir) {
		Pedido p = (Pedido) accesoFichero.leerObjeto();
		if (p == null)
			salir = true;
		else
			aux = p;
	}
	if (aux == null)
		return 1;
	else
		return aux.getNumeroPedido() + 1;
}

	@Override
	public boolean altaPedido() {
		pedido = new Pedido(siguienteNumeroPedido());
		return true;
	}

	@Override
	public boolean addLineaPedido(Articulo articulo, int cantidad) {
		if (articulo != null && cantidad != 0) {
			pedido.anadirLinea(articulo, cantidad);
			return true;
		} else
			return false;
	}

	@Override
	public boolean insertarCliente(Cliente cliente) {
		if (cliente != null) {
			pedido.setCliente(cliente);
			return true;
		} else
			return false;
	}

	@Override
	public boolean guardarPedido() {
		return accesoFichero.escribirObjeto(pedido);
	}
	@Override
	public int numeroPedidoActual() {
		if(pedido != null)
			return pedido.getNumeroPedido();
		throw new IllegalStateException();
	}
	@Override
	public float totalPedidoActual() {
		if(pedido != null)
			return pedido.getTotalPedido();
		throw new IllegalStateException();
	}

}