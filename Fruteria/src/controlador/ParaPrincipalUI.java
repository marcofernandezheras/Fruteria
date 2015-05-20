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

	/**
	 * Create the frame.
	 */
	public ParaPrincipalUI() {
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
		// TODO Auto-generated method stub
		
	}

	protected void altaArticulo() {
		// TODO Auto-generated method stub
		
	}

	protected void buscarCliente() {
		// TODO Auto-generated method stub
		
	}

	protected void altaCliente() {
		// TODO Auto-generated method stub
		
	}

	protected void modificarCliente() {
		// TODO Auto-generated method stub
		
	}

	protected void buscarPedido() {
		// TODO Auto-generated method stub
		
	}

	protected void altaPedido() {
		// TODO Auto-generated method stub
		
	}

}
