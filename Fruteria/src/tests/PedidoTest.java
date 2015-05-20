package tests;

import static org.junit.Assert.*;
import modelo.Articulo;
import modelo.Pedido;

import org.junit.Test;

public class PedidoTest {

	Articulo articuloUno = new Articulo("oso", "blandito", 1f);
	Articulo articuloDos = new Articulo("mando", "muchos botones", 5.5f);
	Articulo articuloTres = new Articulo("tele", "grande", 35.7f);

	@Test
	public void test() {
		
//		Probando funcionamiento normal y 0
		Pedido pedido=new Pedido(5);
		pedido.anadirLinea(articuloUno, 1);
		pedido.anadirLinea(articuloDos, 0);
		pedido.anadirLinea(articuloTres, 1);
		
		assertEquals(44.407, pedido.getTotalPedido(), 0.0001);
		
//		Probando cantidades negativas
		
		Pedido pedidoUno=new Pedido(3);
		pedidoUno.anadirLinea(articuloUno, -1);
		
		assertEquals(0, pedidoUno.getTotalPedido(), 0);
		
//		Probando articulos nulos
		
		Pedido pedidoDos=new Pedido(4);
		pedidoDos.anadirLinea(null, 1);
		
		assertEquals(0, pedidoDos.getTotalPedido(), 0);
		
		
		
	}

}
