package testsUnitarios;

import static org.junit.Assert.*;
import modelo.Articulo;

import org.junit.Test;

public class ArticuloTest {
	Articulo articulo=new Articulo("IPad", "muy caro", 500);
	@Test
	public void test() {
		
		assertEquals(605, articulo.getPVP(), 0);
		
		articulo.setPrecio(0);
		assertEquals(0, articulo.getPVP(), 0);
		
//		Da decimales demás
		
		articulo.setPrecio(88.7f);
		assertEquals(107.327, articulo.getPVP(), 0.0001);
			
	}

}
