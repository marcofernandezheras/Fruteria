package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import modelo.AccesoFichero;
import modelo.Pedido;

public class ListaPedidos implements IListaPedidos {
	File archivo = new File("ListaPedidos.txt");
	AccesoFichero accesoFichero;
	Pedido pedido;
 
	@Override
	public Pedido buscarPedido(int numero) {
		try {
			accesoFichero = new AccesoFichero(archivo);
			pedido = (Pedido) accesoFichero.leerObjeto();
			while (pedido != null) {
				if (pedido.getNumeroPedido() == numero)
					return pedido;
				else{
					pedido=(Pedido) accesoFichero.leerObjeto();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean altaPedido(Pedido pedido) {

		if (buscarPedido(pedido.getNumeroPedido()) == null) {
			accesoFichero.escribirObjeto(pedido);
			return true;
		} else
			return false;
	}

}
