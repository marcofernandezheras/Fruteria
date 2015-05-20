package tests;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.AltaClienteUI;
import controlador.ListaClientes;
import controlador.ParaAltaCliente;

public class ParaAltaClienteUITest extends JFrame {

	private ParaAltaCliente paraAltaCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaAltaClienteUITest frame = new ParaAltaClienteUITest();
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
	public ParaAltaClienteUITest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ListaClientes listaClientes=new ListaClientes();
		paraAltaCliente=new ParaAltaCliente(listaClientes);
		setContentPane(paraAltaCliente);
	}

}
