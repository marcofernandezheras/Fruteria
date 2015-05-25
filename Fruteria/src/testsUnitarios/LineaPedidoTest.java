package testsUnitarios;

import static org.junit.Assert.*;
import modelo.Articulo;
import modelo.LineaPedido;

import org.junit.Test;

public class LineaPedidoTest {
	Articulo articulo=new Articulo("pan", "asequible", 12.5f);
	LineaPedido lineaPedido=new LineaPedido(articulo, 5);
	
	@Test
	public void test() {
		assertEquals(75.625, lineaPedido.getTotalLinea(), 0);
		
		articulo.setPrecio(0);
		assertEquals(0, lineaPedido.getTotalLinea(), 0);
		
		
		
	}

}
