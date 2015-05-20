package tests;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import controlador.ListaArticulos;
import controlador.ParaBuscarArticulo;

public class ParaBuscarArticuloTest extends JFrame {

	private ParaBuscarArticulo contentPane;

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
					ParaBuscarArticuloTest frame = new ParaBuscarArticuloTest();
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
	public ParaBuscarArticuloTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ListaArticulos listaArticulos = new ListaArticulos();
		contentPane = new ParaBuscarArticulo(listaArticulos);
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
