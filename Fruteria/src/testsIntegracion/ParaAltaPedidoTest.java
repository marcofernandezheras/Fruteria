package testsIntegracion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ListaArticulos;
import controlador.ListaClientes;
import controlador.ListaPedidos;
import controlador.ParaAltaPedido;

public class ParaAltaPedidoTest extends JFrame {

	private ParaAltaPedido contentPane;

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
		setBounds(100, 100, 450, 300);
		ListaPedidos gestorPedidos=new ListaPedidos();
		ListaArticulos listaArticulos=new ListaArticulos();
		ListaClientes listaClientes=new ListaClientes();
		contentPane = new ParaAltaPedido(gestorPedidos, listaArticulos, listaClientes);
	//	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
