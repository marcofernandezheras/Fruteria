package vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;

public class AltaClienteUI extends JPanel {
	protected BuscarArticuloUI panelBuscarArticulo;
	protected JTextField txtNumeroPedido;
	protected JPanel panelTabla;
	protected JTable table;
	protected JPanel panelCantidad;
	protected JLabel lblCantidad;
	protected JTextField textField;
	protected JButton button;
	protected JPanel panelNumeroPedido;
	protected GridBagConstraints gbc_panelNumeroPedido;
	protected JPanel panelTotal;
	protected JLabel lblTotal;
	protected JTextField txtTotal;
	protected JPanel panelBuscarCliente;
	protected JLabel label;
	protected JLabel label_1;
	protected JLabel label_2;
	protected JTextField textField_1;
	protected JLabel label_3;
	protected JTextField textField_2;
	protected JButton button_1;
	protected JLabel label_4;
	protected JTextField textField_3;
	protected JLabel label_5;
	protected JTextField textField_4;
	protected JLabel label_6;
	protected JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public AltaClienteUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{31, 25, 99, 265, 0, 116, 36, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		panelNumeroPedido = new JPanel();
		GridBagConstraints gbc_panelCantidad;
		gbc_panelNumeroPedido = new GridBagConstraints();
		gbc_panelNumeroPedido.insets = new Insets(0, 0, 5, 5);
		gbc_panelNumeroPedido.fill = GridBagConstraints.BOTH;
		gbc_panelNumeroPedido.gridx = 1;
		gbc_panelNumeroPedido.gridy = 1;
		add(panelNumeroPedido, gbc_panelNumeroPedido);
		GridBagLayout gbl_panelNumeroPedido = new GridBagLayout();
		gbl_panelNumeroPedido.columnWidths = new int[]{66, 107, 122, 97, 0};
		gbl_panelNumeroPedido.rowHeights = new int[]{0, 0};
		gbl_panelNumeroPedido.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelNumeroPedido.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelNumeroPedido.setLayout(gbl_panelNumeroPedido);
		
		JLabel lblNumeroPedido = new JLabel("N\u00BA Pedido");
		GridBagConstraints gbc_lblNumeroPedido = new GridBagConstraints();
		gbc_lblNumeroPedido.insets = new Insets(0, 0, 0, 5);
		gbc_lblNumeroPedido.gridx = 1;
		gbc_lblNumeroPedido.gridy = 0;
		panelNumeroPedido.add(lblNumeroPedido, gbc_lblNumeroPedido);
		
		txtNumeroPedido = new JTextField();
		GridBagConstraints gbc_txtNumeroPedido = new GridBagConstraints();
		gbc_txtNumeroPedido.gridwidth = 2;
		gbc_txtNumeroPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNumeroPedido.gridx = 2;
		gbc_txtNumeroPedido.gridy = 0;
		panelNumeroPedido.add(txtNumeroPedido, gbc_txtNumeroPedido);
		txtNumeroPedido.setColumns(10);
		
		panelBuscarCliente = new JPanel();
		GridBagConstraints gbc_panelBuscarCliente = new GridBagConstraints();
		gbc_panelBuscarCliente.insets = new Insets(0, 0, 5, 5);
		gbc_panelBuscarCliente.fill = GridBagConstraints.BOTH;
		gbc_panelBuscarCliente.gridx = 1;
		gbc_panelBuscarCliente.gridy = 2;
		add(panelBuscarCliente, gbc_panelBuscarCliente);
		GridBagLayout gbl_panelBuscarCliente = new GridBagLayout();
		gbl_panelBuscarCliente.columnWidths = new int[]{0, 0, 60, 45, 108, 0, 59, 0, 0};
		gbl_panelBuscarCliente.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelBuscarCliente.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelBuscarCliente.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelBuscarCliente.setLayout(gbl_panelBuscarCliente);
		
		label = new JLabel("Buscar Cliente");
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 4;
		gbc_label.gridy = 0;
		panelBuscarCliente.add(label, gbc_label);
		
		label_1 = new JLabel("Buscar");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 1;
		panelBuscarCliente.add(label_1, gbc_label_1);
		
		label_2 = new JLabel("Nombre");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 3;
		gbc_label_2.gridy = 1;
		panelBuscarCliente.add(label_2, gbc_label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 4;
		gbc_textField_1.gridy = 1;
		panelBuscarCliente.add(textField_1, gbc_textField_1);
		
		label_3 = new JLabel("Apellidos");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 5;
		gbc_label_3.gridy = 1;
		panelBuscarCliente.add(label_3, gbc_label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 6;
		gbc_textField_2.gridy = 1;
		panelBuscarCliente.add(textField_2, gbc_textField_2);
		
		button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(AltaClienteUI.class.getResource("/iconos/magnifier-left.png")));
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 0);
		gbc_button_1.gridx = 7;
		gbc_button_1.gridy = 1;
		panelBuscarCliente.add(button_1, gbc_button_1);
		
		label_4 = new JLabel("DNI");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 0, 5);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 2;
		panelBuscarCliente.add(label_4, gbc_label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 0, 5);
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 2;
		panelBuscarCliente.add(textField_3, gbc_textField_3);
		
		label_5 = new JLabel("Nombre");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 0, 0, 5);
		gbc_label_5.gridx = 3;
		gbc_label_5.gridy = 2;
		panelBuscarCliente.add(label_5, gbc_label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 0, 5);
		gbc_textField_4.gridx = 4;
		gbc_textField_4.gridy = 2;
		panelBuscarCliente.add(textField_4, gbc_textField_4);
		
		label_6 = new JLabel("Apellidos");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.EAST;
		gbc_label_6.insets = new Insets(0, 0, 0, 5);
		gbc_label_6.gridx = 5;
		gbc_label_6.gridy = 2;
		panelBuscarCliente.add(label_6, gbc_label_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.insets = new Insets(0, 0, 0, 5);
		gbc_textField_5.gridx = 6;
		gbc_textField_5.gridy = 2;
		panelBuscarCliente.add(textField_5, gbc_textField_5);
		
		panelBuscarArticulo = new BuscarArticuloUI();
		GridBagConstraints gbc_panelTabla = new GridBagConstraints();
		gbc_panelTabla.insets = new Insets(0, 0, 5, 5);
		gbc_panelTabla.fill = GridBagConstraints.BOTH;
		gbc_panelTabla.gridx = 1;
		gbc_panelTabla.gridy = 3;
		add(panelBuscarArticulo, gbc_panelTabla);
		
		panelCantidad = new JPanel();
		GridBagConstraints gbc_panelCantidad11 = new GridBagConstraints();
		gbc_panelCantidad11.insets = new Insets(0, 0, 5, 5);
		gbc_panelCantidad11.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelCantidad11.gridx = 1;
		gbc_panelCantidad11.gridy = 4;
		add(panelCantidad, gbc_panelCantidad11);
		GridBagLayout gbl_panelCantidad = new GridBagLayout();
		gbl_panelCantidad.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 83, 0, 90, 476, 0, 0, 0, 0};
		gbl_panelCantidad.rowHeights = new int[]{0, 0};
		gbl_panelCantidad.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelCantidad.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelCantidad.setLayout(gbl_panelCantidad);
		
		lblCantidad = new JLabel("Cantidad");
		GridBagConstraints gbc_lblCantidad = new GridBagConstraints();
		gbc_lblCantidad.insets = new Insets(0, 0, 0, 5);
		gbc_lblCantidad.gridx = 2;
		gbc_lblCantidad.gridy = 0;
		panelCantidad.add(lblCantidad, gbc_lblCantidad);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 9;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 0;
		panelCantidad.add(textField, gbc_textField);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(AltaClienteUI.class.getResource("/iconos/plus.png")));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 12;
		gbc_button.gridy = 0;
		panelCantidad.add(button, gbc_button);
		
		panelTabla = new JPanel();
		GridBagConstraints gbc_panelTabla1 = new GridBagConstraints();
		gbc_panelTabla1.insets = new Insets(0, 0, 5, 5);
		gbc_panelTabla1.fill = GridBagConstraints.BOTH;
		gbc_panelTabla1.gridx = 1;
		gbc_panelTabla1.gridy = 5;
		add(panelTabla, gbc_panelTabla1);
		GridBagLayout gbl_panelTabla = new GridBagLayout();
		gbl_panelTabla.columnWidths = new int[]{0, 0};
		gbl_panelTabla.rowHeights = new int[]{0, 0};
		gbl_panelTabla.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelTabla.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelTabla.setLayout(gbl_panelTabla);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 0;
		panelTabla.add(table, gbc_table);
		
		panelTotal = new JPanel();
		GridBagConstraints gbc_panelTotal = new GridBagConstraints();
		gbc_panelTotal.insets = new Insets(0, 0, 5, 5);
		gbc_panelTotal.fill = GridBagConstraints.BOTH;
		gbc_panelTotal.gridx = 1;
		gbc_panelTotal.gridy = 6;
		add(panelTotal, gbc_panelTotal);
		GridBagLayout gbl_panelTotal = new GridBagLayout();
		gbl_panelTotal.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 46, 0, 0, 0, 84, 0};
		gbl_panelTotal.rowHeights = new int[]{0, 0};
		gbl_panelTotal.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelTotal.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelTotal.setLayout(gbl_panelTotal);
		
		lblTotal = new JLabel("TOTAL");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.insets = new Insets(0, 0, 0, 5);
		gbc_lblTotal.gridx = 8;
		gbc_lblTotal.gridy = 0;
		panelTotal.add(lblTotal, gbc_lblTotal);
		
		txtTotal = new JTextField();
		GridBagConstraints gbc_txtTotal = new GridBagConstraints();
		gbc_txtTotal.gridwidth = 3;
		gbc_txtTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTotal.gridx = 10;
		gbc_txtTotal.gridy = 0;
		panelTotal.add(txtTotal, gbc_txtTotal);
		txtTotal.setColumns(10);

	}

}
