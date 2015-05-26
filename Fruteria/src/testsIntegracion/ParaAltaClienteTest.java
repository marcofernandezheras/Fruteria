package testsIntegracion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import vista.AltaClienteUI;
import controlador.ListaClientes;
import controlador.ParaAltaCliente;

public class ParaAltaClienteTest extends JFrame {

	private ParaAltaCliente paraAltaCliente;

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
					ParaAltaClienteTest frame = new ParaAltaClienteTest();
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
	public ParaAltaClienteTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ListaClientes listaClientes=new ListaClientes();
		paraAltaCliente=new ParaAltaCliente(listaClientes);
		paraAltaCliente.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(paraAltaCliente);
	}

}
