package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JMenuItem;

public class PrincipalUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalUI frame = new PrincipalUI();
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
	public PrincipalUI() {
		setTitle("Fruteria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArticulo = new JMenu("Articulo");
		menuBar.add(mnArticulo);
		
		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mnArticulo.add(mntmBuscar);
		
		JSeparator separator = new JSeparator();
		mnArticulo.add(separator);
		
		JMenuItem mntmAlta = new JMenuItem("Alta");
		mnArticulo.add(mntmAlta);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(SystemColor.info);
		separator_4.setBackground(SystemColor.info);
		menuBar.add(separator_4);
		
		JMenu mnCliente = new JMenu("Cliente");
		mnCliente.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnCliente);
		
		JMenuItem mntmBuscar_1 = new JMenuItem("Buscar");
		mnCliente.add(mntmBuscar_1);
		
		JSeparator separator_1 = new JSeparator();
		mnCliente.add(separator_1);
		
		JMenuItem mntmAlta_1 = new JMenuItem("Alta");
		mnCliente.add(mntmAlta_1);
		
		JSeparator separator_2 = new JSeparator();
		mnCliente.add(separator_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Modificar");
		mnCliente.add(mntmNewMenuItem);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(SystemColor.info);
		separator_3.setBackground(SystemColor.info);
		menuBar.add(separator_3);
		
		JMenu mnPedido = new JMenu("Pedido");
		menuBar.add(mnPedido);
		
		JMenuItem mntmBuscar_2 = new JMenuItem("Buscar");
		mnPedido.add(mntmBuscar_2);
		
		JSeparator separator_5 = new JSeparator();
		mnPedido.add(separator_5);
		
		JMenuItem mntmAlta_2 = new JMenuItem("Alta");
		mnPedido.add(mntmAlta_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0};
		gbl_contentPane.rowHeights = new int[]{0};
		gbl_contentPane.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
	}

}

