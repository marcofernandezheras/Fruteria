package vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;

public class BuscarPedidoUI extends JPanel {
	protected JTextField txtBuscar;
	protected JTextField txtDni;
	protected JTextField txtNombre;
	protected JTextField txtApellidos;
	protected JTextField txtTotal;
	protected JTable tablaLineas;
	protected JButton btnBuscar;

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("serial")
	public BuscarPedidoUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{20, 0, 20, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 32, 32, 76, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel label_2 = new JLabel("  ");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 0;
		add(label_2, gbc_label_2);
		
		JLabel lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblBuscarPedido = new JLabel("Buscar Pedido");
		lblBuscarPedido.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		GridBagConstraints gbc_lblBuscarPedido = new GridBagConstraints();
		gbc_lblBuscarPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscarPedido.gridx = 1;
		gbc_lblBuscarPedido.gridy = 2;
		add(lblBuscarPedido, gbc_lblBuscarPedido);
		
		JPanel panelNumeroPedido = new JPanel();
		panelNumeroPedido.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GridBagConstraints gbc_panelNumeroPedido = new GridBagConstraints();
		gbc_panelNumeroPedido.insets = new Insets(0, 0, 5, 5);
		gbc_panelNumeroPedido.fill = GridBagConstraints.BOTH;
		gbc_panelNumeroPedido.gridx = 1;
		gbc_panelNumeroPedido.gridy = 3;
		add(panelNumeroPedido, gbc_panelNumeroPedido);
		GridBagLayout gbl_panelNumeroPedido = new GridBagLayout();
		gbl_panelNumeroPedido.columnWidths = new int[]{20, 0, 122, 97, 0};
		gbl_panelNumeroPedido.rowHeights = new int[]{10, 0, 10, 0};
		gbl_panelNumeroPedido.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelNumeroPedido.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelNumeroPedido.setLayout(gbl_panelNumeroPedido);
		
		JLabel label = new JLabel("N\u00BA Pedido");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		panelNumeroPedido.add(label, gbc_label);
		
		txtBuscar = new JTextField();
		GridBagConstraints gbc_txtBuscar = new GridBagConstraints();
		gbc_txtBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_txtBuscar.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBuscar.gridx = 2;
		gbc_txtBuscar.gridy = 1;
		panelNumeroPedido.add(txtBuscar, gbc_txtBuscar);
		txtBuscar.setColumns(10);
		
		btnBuscar = new JButton("");
		btnBuscar.setIcon(new ImageIcon(BuscarPedidoUI.class.getResource("/iconos/magnifier-left.png")));
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 0);
		gbc_btnBuscar.anchor = GridBagConstraints.WEST;
		gbc_btnBuscar.gridx = 3;
		gbc_btnBuscar.gridy = 1;
		panelNumeroPedido.add(btnBuscar, gbc_btnBuscar);
		
		JPanel panelDatosCliente = new JPanel();
		panelDatosCliente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GridBagConstraints gbc_panelDatosCliente = new GridBagConstraints();
		gbc_panelDatosCliente.insets = new Insets(0, 0, 5, 5);
		gbc_panelDatosCliente.fill = GridBagConstraints.BOTH;
		gbc_panelDatosCliente.gridx = 1;
		gbc_panelDatosCliente.gridy = 4;
		add(panelDatosCliente, gbc_panelDatosCliente);
		GridBagLayout gbl_panelDatosCliente = new GridBagLayout();
		gbl_panelDatosCliente.columnWidths = new int[]{20, 0, 60, 45, 108, 0, 59, 20, 0};
		gbl_panelDatosCliente.rowHeights = new int[]{0, 0, 0};
		gbl_panelDatosCliente.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelDatosCliente.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelDatosCliente.setLayout(gbl_panelDatosCliente);
		
		JLabel lblDatosCliente = new JLabel("Datos Cliente");
		lblDatosCliente.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		GridBagConstraints gbc_lblDatosCliente = new GridBagConstraints();
		gbc_lblDatosCliente.gridwidth = 8;
		gbc_lblDatosCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosCliente.gridx = 0;
		gbc_lblDatosCliente.gridy = 0;
		panelDatosCliente.add(lblDatosCliente, gbc_lblDatosCliente);
		
		JLabel label_5 = new JLabel("DNI");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 0, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 1;
		panelDatosCliente.add(label_5, gbc_label_5);
		
		txtDni = new JTextField();
		txtDni.setEditable(false);
		txtDni.setColumns(10);
		GridBagConstraints gbc_txtDni = new GridBagConstraints();
		gbc_txtDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDni.insets = new Insets(0, 0, 0, 5);
		gbc_txtDni.gridx = 2;
		gbc_txtDni.gridy = 1;
		panelDatosCliente.add(txtDni, gbc_txtDni);
		
		JLabel label_6 = new JLabel("Nombre");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.EAST;
		gbc_label_6.insets = new Insets(0, 0, 0, 5);
		gbc_label_6.gridx = 3;
		gbc_label_6.gridy = 1;
		panelDatosCliente.add(label_6, gbc_label_6);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 0, 0, 5);
		gbc_txtNombre.gridx = 4;
		gbc_txtNombre.gridy = 1;
		panelDatosCliente.add(txtNombre, gbc_txtNombre);
		
		JLabel label_7 = new JLabel("Apellidos");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.EAST;
		gbc_label_7.insets = new Insets(0, 0, 0, 5);
		gbc_label_7.gridx = 5;
		gbc_label_7.gridy = 1;
		panelDatosCliente.add(label_7, gbc_label_7);
		
		txtApellidos = new JTextField();
		txtApellidos.setEditable(false);
		txtApellidos.setColumns(10);
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.insets = new Insets(0, 0, 0, 5);
		gbc_txtApellidos.gridx = 6;
		gbc_txtApellidos.gridy = 1;
		panelDatosCliente.add(txtApellidos, gbc_txtApellidos);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		add(scrollPane, gbc_scrollPane);
		
		tablaLineas = new JTable();
		tablaLineas.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Artículo", "Descripci\u00F3n", "Precio", "Cantidad", "Subtotal"
			}
		){
			@Override
		    public boolean isCellEditable(int row, int column) {
		       return false;
		    }
		});
		scrollPane.setViewportView(tablaLineas);
		
		JPanel panelTotal = new JPanel();
		GridBagConstraints gbc_panelTotal = new GridBagConstraints();
		gbc_panelTotal.anchor = GridBagConstraints.EAST;
		gbc_panelTotal.insets = new Insets(0, 0, 5, 0);
		gbc_panelTotal.fill = GridBagConstraints.VERTICAL;
		gbc_panelTotal.gridx = 1;
		gbc_panelTotal.gridy = 6;
		add(panelTotal, gbc_panelTotal);
		GridBagLayout gbl_panelTotal = new GridBagLayout();
		gbl_panelTotal.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 46, 0, 0, 0, 0, 84, 0, 0, 0, 0};
		gbl_panelTotal.rowHeights = new int[]{0, 0};
		gbl_panelTotal.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelTotal.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelTotal.setLayout(gbl_panelTotal);
		
		JLabel label_1 = new JLabel("TOTAL");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.gridwidth = 5;
		gbc_label_1.insets = new Insets(0, 0, 0, 5);
		gbc_label_1.gridx = 7;
		gbc_label_1.gridy = 0;
		panelTotal.add(label_1, gbc_label_1);
		
		txtTotal = new JTextField();
		GridBagConstraints gbc_txtTotal = new GridBagConstraints();
		gbc_txtTotal.insets = new Insets(0, 0, 0, 5);
		gbc_txtTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTotal.gridwidth = 4;
		gbc_txtTotal.gridx = 12;
		gbc_txtTotal.gridy = 0;
		panelTotal.add(txtTotal, gbc_txtTotal);
		txtTotal.setEditable(false);
		txtTotal.setColumns(10);

	}

}