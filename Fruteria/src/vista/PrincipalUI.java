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

	protected JPanel contentPane;
	protected JMenuBar menuBar;
	protected JMenu mnArticulo;
	protected JMenuItem mntmBuscar;
	protected JSeparator separator;
	protected JMenuItem mntmAlta;
	protected JSeparator separator_4;
	protected JMenu mnCliente;
	protected JMenuItem mntmBuscar_1;
	protected JSeparator separator_1;
	protected JMenuItem mntmAlta_1;
	protected JSeparator separator_2;
	protected JMenuItem mntmNewMenuItem;
	protected JSeparator separator_3;
	protected JMenu mnPedido;
	protected JMenuItem mntmBuscar_2;
	protected JSeparator separator_5;
	protected JMenuItem mntmAlta_2;
	protected JMenuItem mntmBuscarArticulo;
	protected JMenuItem mntmAltaArticulo;
	protected JMenuItem mntmBuscarCliente;
	protected JMenuItem mntmAltaCliente;
	protected JMenuItem mntmModificarCliente;
	protected JMenuItem mntmBuscarPedido;
	protected JMenuItem mntmAltaPedido;

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
		setTitle("Frutería");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArticulo = new JMenu("Artículo");
		menuBar.add(mnArticulo);

		mntmBuscarArticulo = new JMenuItem("Buscar");
		mnArticulo.add(mntmBuscarArticulo);

		JSeparator separator = new JSeparator();
		mnArticulo.add(separator);

		mntmAltaArticulo = new JMenuItem("Alta");
		mnArticulo.add(mntmAltaArticulo);

		JMenu mnCliente = new JMenu("Cliente");
		mnCliente.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnCliente);

		mntmBuscarCliente = new JMenuItem("Buscar");
		mnCliente.add(mntmBuscarCliente);

		JSeparator separator_1 = new JSeparator();
		mnCliente.add(separator_1);

		mntmAltaCliente = new JMenuItem("Alta");
		mnCliente.add(mntmAltaCliente);

		JSeparator separator_2 = new JSeparator();
		mnCliente.add(separator_2);

		mntmModificarCliente = new JMenuItem("Modificar");
		mnCliente.add(mntmModificarCliente);

		JMenu mnPedido = new JMenu("Pedido");
		menuBar.add(mnPedido);

		mntmBuscarPedido = new JMenuItem("Buscar");
		mnPedido.add(mntmBuscarPedido);

		JSeparator separator_5 = new JSeparator();
		mnPedido.add(separator_5);

		mntmAltaPedido = new JMenuItem("Alta");
		mnPedido.add(mntmAltaPedido);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0 };
		gbl_contentPane.rowHeights = new int[] { 0 };
		gbl_contentPane.columnWeights = new double[] { Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);
	}

}