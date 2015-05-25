package testsIntegracion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import controlador.ListaClientes;
import controlador.ParaBuscarCliente;

public class ParaBuscarClienteTest extends JFrame {

	private ParaBuscarCliente paraBuscarCliente;

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
					ParaBuscarClienteTest frame = new ParaBuscarClienteTest();
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
	public ParaBuscarClienteTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ListaClientes listaCliente=new ListaClientes();
		paraBuscarCliente=new ParaBuscarCliente(listaCliente);
		paraBuscarCliente.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(paraBuscarCliente);
	}

}
