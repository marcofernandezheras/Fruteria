package tests;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ListaArticulos;
import controlador.ListaClientes;
import controlador.ListaPedidos;
import controlador.ParaAltaPedido;
import vista.AltaPedidoUI;

public class ParaAltaPedidoTest extends JFrame {

	protected ParaAltaPedido paraAltaPedido;
	protected ListaPedidos listaPedidos;
	protected ListaArticulos listaArticulos;
	protected ListaClientes listaClientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaAltaPedidoTest frame = new ParaAltaPedidoTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ParaAltaPedidoTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 406);
		listaPedidos= new ListaPedidos();
		listaArticulos =new ListaArticulos();
		listaClientes = new ListaClientes();
		paraAltaPedido = new ParaAltaPedido(listaPedidos,listaArticulos,listaClientes);
		paraAltaPedido.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(paraAltaPedido);
	}

}
