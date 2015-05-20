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
	protected JTextField textField;
	protected JTextField textField_3;
	protected JTextField textField_4;
	protected JTextField textField_5;
	protected JTextField textField_1;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public BuscarPedidoUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{32, 32, 76, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panelNumeroPedido = new JPanel();
		panelNumeroPedido.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GridBagConstraints gbc_panelNumeroPedido = new GridBagConstraints();
		gbc_panelNumeroPedido.insets = new Insets(0, 0, 5, 5);
		gbc_panelNumeroPedido.fill = GridBagConstraints.BOTH;
		gbc_panelNumeroPedido.gridx = 1;
		gbc_panelNumeroPedido.gridy = 1;
		add(panelNumeroPedido, gbc_panelNumeroPedido);
		GridBagLayout gbl_panelNumeroPedido = new GridBagLayout();
		gbl_panelNumeroPedido.columnWidths = new int[]{66, 84, 122, 97, 0};
		gbl_panelNumeroPedido.rowHeights = new int[]{0, 0};
		gbl_panelNumeroPedido.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelNumeroPedido.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelNumeroPedido.setLayout(gbl_panelNumeroPedido);
		
		JLabel label = new JLabel("N\u00BA Pedido");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		panelNumeroPedido.add(label, gbc_label);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		panelNumeroPedido.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(BuscarPedidoUI.class.getResource("/iconos/magnifier-left.png")));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.gridx = 3;
		gbc_button.gridy = 0;
		panelNumeroPedido.add(button, gbc_button);
		
		JPanel panelDatosCliente = new JPanel();
		panelDatosCliente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GridBagConstraints gbc_panelDatosCliente = new GridBagConstraints();
		gbc_panelDatosCliente.insets = new Insets(0, 0, 5, 5);
		gbc_panelDatosCliente.fill = GridBagConstraints.BOTH;
		gbc_panelDatosCliente.gridx = 1;
		gbc_panelDatosCliente.gridy = 2;
		add(panelDatosCliente, gbc_panelDatosCliente);
		GridBagLayout gbl_panelDatosCliente = new GridBagLayout();
		gbl_panelDatosCliente.columnWidths = new int[]{0, 0, 60, 45, 108, 0, 59, 0, 0};
		gbl_panelDatosCliente.rowHeights = new int[]{0, 0, 0};
		gbl_panelDatosCliente.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelDatosCliente.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelDatosCliente.setLayout(gbl_panelDatosCliente);
		
		JLabel lblDatosCliente = new JLabel("Datos Cliente");
		lblDatosCliente.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDatosCliente = new GridBagConstraints();
		gbc_lblDatosCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosCliente.gridx = 4;
		gbc_lblDatosCliente.gridy = 0;
		panelDatosCliente.add(lblDatosCliente, gbc_lblDatosCliente);
		
		JLabel label_5 = new JLabel("DNI");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 0, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 1;
		panelDatosCliente.add(label_5, gbc_label_5);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 0, 5);
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 1;
		panelDatosCliente.add(textField_3, gbc_textField_3);
		
		JLabel label_6 = new JLabel("Nombre");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.EAST;
		gbc_label_6.insets = new Insets(0, 0, 0, 5);
		gbc_label_6.gridx = 3;
		gbc_label_6.gridy = 1;
		panelDatosCliente.add(label_6, gbc_label_6);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 0, 5);
		gbc_textField_4.gridx = 4;
		gbc_textField_4.gridy = 1;
		panelDatosCliente.add(textField_4, gbc_textField_4);
		
		JLabel label_7 = new JLabel("Apellidos");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.EAST;
		gbc_label_7.insets = new Insets(0, 0, 0, 5);
		gbc_label_7.gridx = 5;
		gbc_label_7.gridy = 1;
		panelDatosCliente.add(label_7, gbc_label_7);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.insets = new Insets(0, 0, 0, 5);
		gbc_textField_5.gridx = 6;
		gbc_textField_5.gridy = 1;
		panelDatosCliente.add(textField_5, gbc_textField_5);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Articulo", "Descripci\u00F3n", "Precio", "Cantidad", "Subtotal"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panelTotal = new JPanel();
		GridBagConstraints gbc_panelTotal = new GridBagConstraints();
		gbc_panelTotal.anchor = GridBagConstraints.EAST;
		gbc_panelTotal.insets = new Insets(0, 0, 5, 5);
		gbc_panelTotal.fill = GridBagConstraints.VERTICAL;
		gbc_panelTotal.gridx = 1;
		gbc_panelTotal.gridy = 4;
		add(panelTotal, gbc_panelTotal);
		GridBagLayout gbl_panelTotal = new GridBagLayout();
		gbl_panelTotal.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 46, 0, 0, 0, 0, 84, 0, 0};
		gbl_panelTotal.rowHeights = new int[]{0, 0};
		gbl_panelTotal.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 4.9E-324, Double.MIN_VALUE};
		gbl_panelTotal.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelTotal.setLayout(gbl_panelTotal);
		
		JLabel label_1 = new JLabel("TOTAL");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 0, 5);
		gbc_label_1.gridx = 8;
		gbc_label_1.gridy = 0;
		panelTotal.add(label_1, gbc_label_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 4;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 0, 5);
		gbc_textField_1.gridx = 9;
		gbc_textField_1.gridy = 0;
		panelTotal.add(textField_1, gbc_textField_1);
		textField_1.setEditable(false);
		textField_1.setColumns(10);

	}

}

