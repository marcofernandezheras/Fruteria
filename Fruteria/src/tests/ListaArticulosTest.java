package tests;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import modelo.Articulo;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import controlador.ListaArticulos;

public class ListaArticulosTest {

	boolean limpiarArchivos(){
		File file = new File("articulo.txt");
		if(file.exists() ){
			return file.delete();
		}
		return true;
	}
	
	@Test
	public void testInsertarArticulo() {
		boolean limpiarArchivos = limpiarArchivos();
		ListaArticulos instancia = new ListaArticulos();		
		assertTrue(instancia.insertarArticulo(new Articulo("uno", "desc", 1f)));
		assertFalse(instancia.insertarArticulo(new Articulo("uno", "desc", 1f)));
		
		ListaArticulos instanciaDos = new ListaArticulos();
		assertFalse(instanciaDos.insertarArticulo(new Articulo("uno", "desc", 1f)));
		assertTrue (instanciaDos.insertarArticulo(new Articulo("dos", "desc", 1f)));
		
		assertFalse(instancia.insertarArticulo(null));		
	}
	
	@Test
	public void testBuscarArticulo() {
		ListaArticulos instancia = new ListaArticulos();
		assertNotNull(instancia.buscarArticulo("uno"));
		assertNotNull(instancia.buscarArticulo("dos"));
		assertNull(instancia.buscarArticulo("tres"));
	}

}
