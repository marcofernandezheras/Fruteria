package tests;

import static org.junit.Assert.*;

import java.awt.Color;
import java.io.File;

import modelo.Cliente;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import controlador.ListaClientes;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ListaClientesTest {

	void limpiarArchivos(){
		File file = new File("cliente.txt");
		if(file.exists() ){
			file.delete();
		}
	}
	
	@Test
	public void testBuscarCliente() {
		ListaClientes instancia = new ListaClientes();
		assertNotNull(instancia.buscarCliente("nombre1", "apellidos1"));
		assertNull(instancia.buscarCliente("nombre1", "apellidos2"));
		assertNotNull(instancia.buscarCliente("nombre2", "apellidos2"));
		assertNull(instancia.buscarCliente("nombre2", "apellidos1"));
		assertNull(instancia.buscarCliente("nombre3", "apellidos3"));
	}

	@Test
	public void testAltaCliente() {
		limpiarArchivos();
		ListaClientes instancia = new ListaClientes();
		assertTrue(instancia.altaCliente(new Cliente("1", "nombre1", "apellidos1", Color.black)));
		assertFalse(instancia.altaCliente(new Cliente("1", "nombre1", "apellidos1", Color.black)));
		
		ListaClientes instanciaDos = new ListaClientes();
		assertFalse(instanciaDos.altaCliente(new Cliente("1", "nombre1", "apellidos1", Color.black)));
		assertTrue(instanciaDos.altaCliente(new Cliente("2", "nombre2", "apellidos2", Color.black)));
		
		assertFalse(instanciaDos.altaCliente(null));
	}

	@Test
	public void testModificarCliente() {
		ListaClientes instancia = new ListaClientes();
		Cliente clienteSI = new Cliente("1", "nombre1", "apellidos1", Color.black);
		Cliente clienteNO = new Cliente("3", "nombre1", "apellidos1", Color.black);
		assertTrue(instancia.modificarCliente(clienteSI, clienteSI.identificador()));
		assertFalse(instancia.modificarCliente(clienteNO, ""));
		assertFalse(instancia.modificarCliente(null,""));
	}

}