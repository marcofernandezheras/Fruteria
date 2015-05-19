package vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AltaPedidoUI extends JPanel {
	protected BuscarClienteUI panelBuscarClienteUI;
	protected BuscarArticuloUI panelBuscarArticulo;
	protected JTextField txtCantidad;
	protected JButton btnCantidad;
	protected JPanel panelCantidad;
	protected JPanel panelTabla;
	protected JTable table;
	protected JPanel panelTotal;
	protected JLabel lblTotal;
	protected JTextField txtTotal;
	protected JPanel panelNumeroPedido;
	protected JLabel lblNewLabel;
	protected JTextField textField;

	/**
	 * Create the panel.
	 */
	public AltaPedidoUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 624, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 41, 17, 33, 63, 0, 28, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		panelNumeroPedido = new JPanel();
		GridBagConstraints gbc_panelNumeroPedido = new GridBagConstraints();
		gbc_panelNumeroPedido.insets = new Insets(0, 0, 5, 5);
		gbc_panelNumeroPedido.fill = GridBagConstraints.BOTH;
		gbc_panelNumeroPedido.gridx = 1;
		gbc_panelNumeroPedido.gridy = 1;
		add(panelNumeroPedido, gbc_panelNumeroPedido);
		GridBagLayout gbl_panelNumeroPedido = new GridBagLayout();
		gbl_panelNumeroPedido.columnWidths = new int[]{147, 46, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelNumeroPedido.rowHeights = new int[]{0, 0};
		gbl_panelNumeroPedido.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelNumeroPedido.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelNumeroPedido.setLayout(gbl_panelNumeroPedido);
		
		lblNewLabel = new JLabel("N\u00BA Pedido");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panelNumeroPedido.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.gridwidth = 13;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panelNumeroPedido.add(textField, gbc_textField);
		textField.setColumns(10);
		
		panelBuscarClienteUI = new BuscarClienteUI();
		GridBagConstraints gbc_panelCantidad = new GridBagConstraints();
		gbc_panelCantidad.insets = new Insets(0, 0, 5, 5);
		gbc_panelCantidad.fill = GridBagConstraints.BOTH;
		gbc_panelCantidad.gridx = 1;
		gbc_panelCantidad.gridy = 2;
		add(panelBuscarClienteUI, gbc_panelCantidad);
		
		panelBuscarArticulo = new BuscarArticuloUI();
		GridBagConstraints gbc_panelu = new GridBagConstraints();
		gbc_panelu.insets = new Insets(0, 0, 5, 5);
		gbc_panelu.fill = GridBagConstraints.BOTH;
		gbc_panelu.gridx = 1;
		gbc_panelu.gridy = 3;
		add(panelBuscarArticulo, gbc_panelu);
		
		panelCantidad = new JPanel();
		GridBagConstraints gbc_panelCantidad1 = new GridBagConstraints();
		gbc_panelCantidad1.insets = new Insets(0, 0, 5, 5);
		gbc_panelCantidad1.fill = GridBagConstraints.BOTH;
		gbc_panelCantidad1.gridx = 1;
		gbc_panelCantidad1.gridy = 4;
		add(panelCantidad, gbc_panelCantidad1);
		GridBagLayout gbl_panelCantidad = new GridBagLayout();
		gbl_panelCantidad.columnWidths = new int[] {70, 43, 30, 240, 0, 10};
		gbl_panelCantidad.rowHeights = new int[]{14, 0, 0};
		gbl_panelCantidad.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelCantidad.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelCantidad.setLayout(gbl_panelCantidad);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		GridBagConstraints gbc_lblCantidad = new GridBagConstraints();
		gbc_lblCantidad.insets = new Insets(0, 0, 0, 5);
		gbc_lblCantidad.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblCantidad.gridx = 1;
		gbc_lblCantidad.gridy = 1;
		panelCantidad.add(lblCantidad, gbc_lblCantidad);
		
		txtCantidad = new JTextField();
		GridBagConstraints gbc_txtCantidad = new GridBagConstraints();
		gbc_txtCantidad.insets = new Insets(0, 0, 0, 5);
		gbc_txtCantidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCantidad.gridx = 3;
		gbc_txtCantidad.gridy = 1;
		panelCantidad.add(txtCantidad, gbc_txtCantidad);
		txtCantidad.setColumns(10);
		
		btnCantidad = new JButton("");
		btnCantidad.setIcon(new ImageIcon(AltaPedidoUI.class.getResource("/iconos/plus.png")));
		GridBagConstraints gbc_btnCantidad = new GridBagConstraints();
		gbc_btnCantidad.gridx = 4;
		gbc_btnCantidad.gridy = 1;
		panelCantidad.add(btnCantidad, gbc_btnCantidad);
		
		panelTabla = new JPanel();
		GridBagConstraints gbc_panelTabla = new GridBagConstraints();
		gbc_panelTabla.insets = new Insets(0, 0, 5, 5);
		gbc_panelTabla.fill = GridBagConstraints.BOTH;
		gbc_panelTabla.gridx = 1;
		gbc_panelTabla.gridy = 5;
		add(panelTabla, gbc_panelTabla);
		GridBagLayout gbl_panelTabla = new GridBagLayout();
		gbl_panelTabla.columnWidths = new int[]{0, 0};
		gbl_panelTabla.rowHeights = new int[]{0, 0};
		gbl_panelTabla.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelTabla.rowWeights = new double[]{0.0, Double.MIN_VALUE};
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
		gbc_panelTotal.gridy = 7;
		add(panelTotal, gbc_panelTotal);
		GridBagLayout gbl_panelTotal = new GridBagLayout();
		gbl_panelTotal.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelTotal.rowHeights = new int[]{0, 0, 0};
		gbl_panelTotal.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelTotal.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelTotal.setLayout(gbl_panelTotal);
		
		lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotal.anchor = GridBagConstraints.EAST;
		gbc_lblTotal.gridx = 16;
		gbc_lblTotal.gridy = 0;
		panelTotal.add(lblTotal, gbc_lblTotal);
		
		txtTotal = new JTextField();
		GridBagConstraints gbc_txtTotal = new GridBagConstraints();
		gbc_txtTotal.insets = new Insets(0, 0, 5, 0);
		gbc_txtTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTotal.gridx = 17;
		gbc_txtTotal.gridy = 0;
		panelTotal.add(txtTotal, gbc_txtTotal);
		txtTotal.setColumns(10);

	}

}
