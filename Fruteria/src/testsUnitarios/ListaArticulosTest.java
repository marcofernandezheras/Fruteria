package testsUnitarios;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import modelo.Articulo;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import controlador.ListaArticulos;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ListaArticulosTest {

	void limpiarArchivos(){
		File file = new File("articulo.txt");
		if(file.exists() ){
			file.delete();
		}
	}
	
	@Test
	public void testBuscarArticulo() {
		ListaArticulos instancia = new ListaArticulos();
		assertNotNull(instancia.buscarArticulo("uno"));
		assertNotNull(instancia.buscarArticulo("dos"));
		assertNull(instancia.buscarArticulo("tres"));
	}

	@Test
	public void testAInsertarArticulo() {
		limpiarArchivos();
		ListaArticulos instancia = new ListaArticulos();		
		assertTrue(instancia.insertarArticulo(new Articulo("uno", "desc", 1f)));
		assertFalse(instancia.insertarArticulo(new Articulo("uno", "desc", 1f)));
		
		ListaArticulos instanciaDos = new ListaArticulos();
		assertFalse(instanciaDos.insertarArticulo(new Articulo("uno", "desc", 1f)));
		assertTrue (instanciaDos.insertarArticulo(new Articulo("dos", "desc", 1f)));
		
		assertFalse(instancia.insertarArticulo(null));		
	}

}