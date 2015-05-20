package controlador;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.PrincipalUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ParaPrincipalUI extends PrincipalUI {

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaPrincipalUI frame = new ParaPrincipalUI();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private IListaArticulos listaArticulos;
	private IListaCliente listaCliente;

	/**
	 * Create the frame.
	 */
	public ParaPrincipalUI() {
		listaArticulos = new ListaArticulos();
		listaCliente = new ListaClientes();
		eventos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);		
	}

	private void eventos() {
		mntmAltaPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaPedido();
			}
		});
		mntmBuscarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarPedido();
			}
		});
		mntmModificarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarCliente();
			}
		});
		mntmAltaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaCliente();
			}
		});
		mntmBuscarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarCliente();
			}
		});
		mntmAltaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaArticulo();
			}
		});
		mntmBuscarArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarArticulo();
			}
		});
	}

	protected void buscarArticulo() {
		cambiarPanel(new ParaBuscarArticulo(listaArticulos));
	}

	protected void altaArticulo() {
		cambiarPanel(new ParaAltaArticulo(listaArticulos));			
	}

	protected void buscarCliente() {
		cambiarPanel(new ParaBuscarCliente(listaCliente));	
	}

	protected void altaCliente() {
		cambiarPanel(new ParaAltaCliente(listaCliente));			
	}

	protected void modificarCliente() {
		cambiarPanel(new ParaModCliente(listaCliente));	
	}

	protected void buscarPedido() {
		// TODO ParaPrincipalUI::buscarPedido()		
	}

	protected void altaPedido() {
		// TODO ParaPrincipalUI::altaPedido()
		
	}
	
	private void cambiarPanel(JPanel nuevoPanel)
	{
		contentPane = null;
		contentPane = nuevoPanel;	
		this.setContentPane(contentPane);
		this.validate();
	}
}
