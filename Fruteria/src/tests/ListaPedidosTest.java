package tests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import controlador.ListaPedidos;
import modelo.Articulo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ListaPedidosTest {

	void limpiarArchivos(){
		File file = new File("ListaPedidos.txt");
		if(file.exists() ){
			file.delete();
		}
	}
	
	ListaPedidos instancia = new ListaPedidos();
	Articulo articulo = new Articulo("nombre", "descripcion", 1.0f);
	
	@Test
	public void testBuscarPedido() {
		fail("Not yet implemented");
	}

	@Test
	public void testAltaPedido() {
		assertTrue(instancia.altaPedido());
	}

	@Test
	public void testAddLineaPedido() {
		assertTrue(instancia.addLineaPedido(articulo, 1));
		assertTrue(instancia.addLineaPedido(articulo, -1));
		assertFalse(instancia.addLineaPedido(articulo, 0));
	}

	@Test
	public void testInsertarCliente() {
		instancia.insertarCliente(cliente)
	}

	@Test
	public void testGuardarPedido() {
		fail("Not yet implemented");
	}

}
