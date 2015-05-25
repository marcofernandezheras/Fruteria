package testsUnitarios;

import static org.junit.Assert.*;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import modelo.AccesoFichero;
import modelo.Cliente;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccesoFicheroTest {

	File archivo = null;
	Cliente clienteUno = new Cliente("1", "nombre1", "apellidos1", Color.black);
	Cliente clienteDos = new Cliente("2", "nombre2", "apellidos2", Color.white);
	Cliente clienteTres = null;

	void limpiarArchivos() {
		if (archivo.exists()) {
			archivo.delete();
		}
	}

	@Test
	public void testBLeerObjeto() {
		archivo = new File("src/testsUnitarios/testAcceso.txt");
		AccesoFichero instancia;
		try {
			instancia = new AccesoFichero(archivo);
			Object clienteAux = null;
			clienteAux = instancia.leerObjeto();
			assertTrue(clienteUno.equals(clienteAux));
			clienteAux = instancia.leerObjeto();
			assertTrue(clienteDos.equals(clienteAux));
			clienteAux = instancia.leerObjeto();
			assertTrue(clienteAux == null);

		} catch (FileNotFoundException e) {
			fail();
		}

	}

	@Test
	public void testAEscribirObjeto() {

		archivo = new File("src/testsUnitarios/testAcceso.txt");
		limpiarArchivos();
		AccesoFichero instancia;
		try {
			instancia = new AccesoFichero(archivo);
			assertTrue(instancia.escribirObjeto(clienteUno));
			assertTrue(instancia.escribirObjeto(clienteDos));
			// fallito
			assertFalse(instancia.escribirObjeto(clienteTres));
		} catch (FileNotFoundException e) {
			fail();
		}

	}

	@Test
	public void testCModificarObjeto() {
		archivo = new File("src/testsUnitarios/testAcceso.txt");
		AccesoFichero instancia;
		try {
			instancia = new AccesoFichero(archivo);
			Cliente obj = (Cliente) instancia.leerObjeto();
			Object identificador = obj.identificador();
			obj.setNombre("cambiado");
			obj.setApellidos("acambiado");
			obj.setDni("dnicambiado");
			obj.setColorPelo(Color.BLUE);
			assertTrue(instancia.modificarObjeto(obj, identificador));

			instancia.close();
		} catch (FileNotFoundException e) {
			fail();
		} catch (Exception e) {
			fail();
		}

		try {
			instancia = new AccesoFichero(archivo);
			Cliente obj = (Cliente) instancia.leerObjeto();
			assertEquals("cambiado", obj.getNombre());
			assertEquals("acambiado", obj.getApellidos());
			assertEquals("dnicambiado", obj.getDni());
			assertEquals(Color.BLUE, obj.getColorPelo());

		} catch (FileNotFoundException e) {
			fail();
		}

	}

}
