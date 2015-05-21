package tests;

import static org.junit.Assert.*;

import java.awt.Color;
import java.io.File;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import controlador.ListaPedidos;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ListaPedidosTest {

	void limpiarArchivos(){
		File file = new File("ListaPedidos.txt");
		if(file.exists() ){
			file.delete();
		}
	}
	
	static ListaPedidos instancia = new ListaPedidos();
	static Articulo articulo = new Articulo("nombre", "descripcion", 1.0f);
	static Cliente cliente = new Cliente("dni", "nombre", "apellidos", Color.black);
	
	@Test
	public void testBuscarPedido() {
		assertNull(instancia.buscarPedido(0));		
		Pedido pedido = instancia.buscarPedido(1);
		assertNotNull(pedido);
		assertTrue(pedido.getCliente().equals(cliente));
		assertEquals(2, pedido.getLineasPedido().size());
		
		assertEquals(articulo,pedido.getLineasPedido().get(0).getArticulo());
		assertEquals(1,pedido.getLineasPedido().get(0).getCantidad());
	}

	@Test
	public void testAAAltaPedido() {
		limpiarArchivos();
		assertTrue(instancia.altaPedido());
	}

	@Test
	public void testABAddLineaPedido() {
		assertFalse(instancia.addLineaPedido(null, 1));
		assertTrue(instancia.addLineaPedido(articulo, 1));
		assertTrue(instancia.addLineaPedido(articulo, -1));
		assertFalse(instancia.addLineaPedido(articulo, 0));
	}

	@Test
	public void testACCInsertarCliente() {
		assertFalse(instancia.insertarCliente(null));
		assertTrue(instancia.insertarCliente(cliente));
	}

	@Test
	public void testADGuardarPedido() {
		assertTrue(instancia.guardarPedido());
		
		assertTrue(instancia.altaPedido());
		assertFalse(instancia.guardarPedido());//Pedido vacio
		
		assertTrue(instancia.addLineaPedido(articulo, 1));
		assertFalse(instancia.guardarPedido());//Pedido sin cliente
		
		assertTrue(instancia.insertarCliente(cliente));
		assertTrue(instancia.guardarPedido());
		
		assertTrue(instancia.altaPedido());
		assertTrue(instancia.insertarCliente(cliente));
		assertFalse(instancia.guardarPedido());//Pedido sin lineas
	}

}
