package testsIntegracion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import modelo.Cliente;
import controlador.ListaClientes;
import controlador.ParaModCliente;

public class ParaModificarClienteTest extends JFrame {

	private ParaModCliente paraModCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e1)
		{}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaModificarClienteTest frame = new ParaModificarClienteTest();
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
	public ParaModificarClienteTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ListaClientes listaClientes=new ListaClientes();
		paraModCliente=new ParaModCliente(listaClientes);
		setContentPane(paraModCliente);
	}

}
