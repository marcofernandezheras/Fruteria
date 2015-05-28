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
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Dimension;

public class AltaPedidoUI extends JPanel {
	protected JTextField txtNumeroPedido;
	protected JPanel panelNumeroPedido;
	protected GridBagConstraints gbc_panelNumeroPedido;
	protected JPanel panelTotal;
	protected JLabel lblTotal;
	protected JTextField txtTotal;
	protected JLabel lblAltaDePedidos;
	protected JPanel panelBuscarCliente;
	protected JLabel lblBuscarCliente;
	protected JTextField txtNombre;
	protected JTextField txtApellidos;
	protected JLabel lblDatos;
	protected JTextField txtDatoUno;
	protected JTextField txtDatoDos;
	protected JTextField txtDatoTres;
	protected JPanel panelBuscarArticulo;
	protected JLabel lblBuscarArticulo;
	protected JButton btnBuscar;
	protected JTextField txtBuscarArticulo;
	protected JLabel lblDescripcion;
	protected JTextField txtDescripcion;
	protected JTextField txtPrecio;
	protected JLabel lblPrecio;
	protected JLabel lblPvp;
	protected JTextField txtPvp;
	protected JLabel lblCantidad;
	protected JTextField txtCantidad;
	protected JButton btnCantidad;
	protected JButton button;
	protected JScrollPane scrollPane;
	protected JTable JTabla;
	protected JButton btnGuardarPedido;
	protected JLabel label;
	protected JLabel lblNombre;
	protected JLabel lblApellidos;
	protected JLabel lblApellidos_1;
	protected JLabel lblDni;
	protected JLabel label_1;
	protected JLabel label_2;
	protected JLabel lblBsquedaDeArticulos;

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("serial")
	public AltaPedidoUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{20, 0, 20, 0};
		gridBagLayout.rowHeights = new int[]{0, 31, 25, 95, 93, 0, 116, 36, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		panelNumeroPedido = new JPanel();
		panelNumeroPedido.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GridBagConstraints gbc_panelCantidad;
		
		lblAltaDePedidos = new JLabel("Alta de Pedidos");
		lblAltaDePedidos.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		GridBagConstraints gbc_lblAltaDePedidos = new GridBagConstraints();
		gbc_lblAltaDePedidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblAltaDePedidos.gridx = 1;
		gbc_lblAltaDePedidos.gridy = 1;
		add(lblAltaDePedidos, gbc_lblAltaDePedidos);
		gbc_panelNumeroPedido = new GridBagConstraints();
		gbc_panelNumeroPedido.insets = new Insets(0, 0, 5, 5);
		gbc_panelNumeroPedido.fill = GridBagConstraints.BOTH;
		gbc_panelNumeroPedido.gridx = 1;
		gbc_panelNumeroPedido.gridy = 2;
		add(panelNumeroPedido, gbc_panelNumeroPedido);
		GridBagLayout gbl_panelNumeroPedido = new GridBagLayout();
		gbl_panelNumeroPedido.columnWidths = new int[]{20, 28, 107, 122, 160, 0, 0, 0};
		gbl_panelNumeroPedido.rowHeights = new int[]{10, 33, 10, 0};
		gbl_panelNumeroPedido.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelNumeroPedido.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelNumeroPedido.setLayout(gbl_panelNumeroPedido);
		
		JLabel lblNumeroPedido = new JLabel("N\u00BA Pedido");
		GridBagConstraints gbc_lblNumeroPedido = new GridBagConstraints();
		gbc_lblNumeroPedido.anchor = GridBagConstraints.WEST;
		gbc_lblNumeroPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroPedido.gridx = 1;
		gbc_lblNumeroPedido.gridy = 1;
		panelNumeroPedido.add(lblNumeroPedido, gbc_lblNumeroPedido);
		
		txtNumeroPedido = new JTextField();
		txtNumeroPedido.setEditable(false);
		GridBagConstraints gbc_txtNumeroPedido = new GridBagConstraints();
		gbc_txtNumeroPedido.gridwidth = 2;
		gbc_txtNumeroPedido.insets = new Insets(0, 0, 5, 5);
		gbc_txtNumeroPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNumeroPedido.gridx = 2;
		gbc_txtNumeroPedido.gridy = 1;
		panelNumeroPedido.add(txtNumeroPedido, gbc_txtNumeroPedido);
		txtNumeroPedido.setColumns(10);
		
		btnGuardarPedido = new JButton("Guardar y nuevo");
		btnGuardarPedido.setIconTextGap(2);
		btnGuardarPedido.setIcon(new ImageIcon(AltaPedidoUI.class.getResource("/iconos/disk-black.png")));
		btnGuardarPedido.setPreferredSize(new Dimension(63, 23));
		btnGuardarPedido.setMinimumSize(new Dimension(63, 33));
		btnGuardarPedido.setMaximumSize(new Dimension(63, 23));
		GridBagConstraints gbc_btnGuardarPedido = new GridBagConstraints();
		gbc_btnGuardarPedido.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardarPedido.fill = GridBagConstraints.BOTH;
		gbc_btnGuardarPedido.gridx = 4;
		gbc_btnGuardarPedido.gridy = 1;
		panelNumeroPedido.add(btnGuardarPedido, gbc_btnGuardarPedido);
		
		panelBuscarCliente = new JPanel();
		panelBuscarCliente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GridBagConstraints gbc_panelBuscarCliente = new GridBagConstraints();
		gbc_panelBuscarCliente.insets = new Insets(0, 0, 5, 5);
		gbc_panelBuscarCliente.fill = GridBagConstraints.BOTH;
		gbc_panelBuscarCliente.gridx = 1;
		gbc_panelBuscarCliente.gridy = 3;
		add(panelBuscarCliente, gbc_panelBuscarCliente);
		GridBagLayout gbl_panelBuscarCliente = new GridBagLayout();
		gbl_panelBuscarCliente.columnWidths = new int[]{0, 20, 0, 126, 91, 70, 83, 70, 20, 0};
		gbl_panelBuscarCliente.rowHeights = new int[]{0, 0, 45, 15, 0};
		gbl_panelBuscarCliente.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelBuscarCliente.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelBuscarCliente.setLayout(gbl_panelBuscarCliente);
		
		lblBuscarCliente = new JLabel("Búsqueda de Clientes");
		lblBuscarCliente.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		GridBagConstraints gbc_lblBuscarCliente = new GridBagConstraints();
		gbc_lblBuscarCliente.gridwidth = 8;
		gbc_lblBuscarCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscarCliente.gridx = 0;
		gbc_lblBuscarCliente.gridy = 0;
		panelBuscarCliente.add(lblBuscarCliente, gbc_lblBuscarCliente);
		
		label_2 = new JLabel("");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 1;
		panelBuscarCliente.add(label_2, gbc_label_2);
		
		lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 1;
		panelBuscarCliente.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 3;
		gbc_txtNombre.gridy = 1;
		panelBuscarCliente.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.gridx = 4;
		gbc_lblApellidos.gridy = 1;
		panelBuscarCliente.add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 5;
		gbc_txtApellidos.gridy = 1;
		panelBuscarCliente.add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(AltaPedidoUI.class.getResource("/iconos/magnifier-left.png")));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 6;
		gbc_button.gridy = 1;
		panelBuscarCliente.add(button, gbc_button);
		
		lblDatos = new JLabel("DNI");
		GridBagConstraints gbc_lblDatos = new GridBagConstraints();
		gbc_lblDatos.anchor = GridBagConstraints.EAST;
		gbc_lblDatos.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatos.gridx = 2;
		gbc_lblDatos.gridy = 2;
		panelBuscarCliente.add(lblDatos, gbc_lblDatos);
		
		txtDatoUno = new JTextField();
		txtDatoUno.setEditable(false);
		GridBagConstraints gbc_txtDatoUno = new GridBagConstraints();
		gbc_txtDatoUno.insets = new Insets(0, 0, 5, 5);
		gbc_txtDatoUno.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDatoUno.gridx = 3;
		gbc_txtDatoUno.gridy = 2;
		panelBuscarCliente.add(txtDatoUno, gbc_txtDatoUno);
		txtDatoUno.setColumns(10);
		
		lblApellidos_1 = new JLabel("Nombre");
		GridBagConstraints gbc_lblApellidos_1 = new GridBagConstraints();
		gbc_lblApellidos_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos_1.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos_1.gridx = 4;
		gbc_lblApellidos_1.gridy = 2;
		panelBuscarCliente.add(lblApellidos_1, gbc_lblApellidos_1);
		
		txtDatoDos = new JTextField();
		txtDatoDos.setEditable(false);
		GridBagConstraints gbc_txtDatoDos = new GridBagConstraints();
		gbc_txtDatoDos.insets = new Insets(0, 0, 5, 5);
		gbc_txtDatoDos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDatoDos.gridx = 5;
		gbc_txtDatoDos.gridy = 2;
		panelBuscarCliente.add(txtDatoDos, gbc_txtDatoDos);
		txtDatoDos.setColumns(10);
		
		lblDni = new JLabel("Apellidos");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.anchor = GridBagConstraints.EAST;
		gbc_lblDni.gridx = 6;
		gbc_lblDni.gridy = 2;
		panelBuscarCliente.add(lblDni, gbc_lblDni);
		
		txtDatoTres = new JTextField();
		txtDatoTres.setEditable(false);
		GridBagConstraints gbc_txtDatoTres = new GridBagConstraints();
		gbc_txtDatoTres.insets = new Insets(0, 0, 5, 5);
		gbc_txtDatoTres.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDatoTres.gridx = 7;
		gbc_txtDatoTres.gridy = 2;
		panelBuscarCliente.add(txtDatoTres, gbc_txtDatoTres);
		txtDatoTres.setColumns(10);
		
		panelBuscarArticulo = new JPanel();
		panelBuscarArticulo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GridBagConstraints gbc_panelBuscarArticulo = new GridBagConstraints();
		gbc_panelBuscarArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_panelBuscarArticulo.fill = GridBagConstraints.BOTH;
		gbc_panelBuscarArticulo.gridx = 1;
		gbc_panelBuscarArticulo.gridy = 4;
		add(panelBuscarArticulo, gbc_panelBuscarArticulo);
		GridBagLayout gbl_panelBuscarArticulo = new GridBagLayout();
		gbl_panelBuscarArticulo.columnWidths = new int[]{20, 0, 214, 0, 52, 64, 0, 47, 0, 53, 0, 20, 0};
		gbl_panelBuscarArticulo.rowHeights = new int[]{0, 0, 20, 0, 0, 10, 0};
		gbl_panelBuscarArticulo.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelBuscarArticulo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelBuscarArticulo.setLayout(gbl_panelBuscarArticulo);
		
		lblBsquedaDeArticulos = new JLabel("Búsqueda de Artículos");
		lblBsquedaDeArticulos.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		GridBagConstraints gbc_lblBsquedaDeArticulos = new GridBagConstraints();
		gbc_lblBsquedaDeArticulos.gridwidth = 11;
		gbc_lblBsquedaDeArticulos.insets = new Insets(0, 0, 5, 0);
		gbc_lblBsquedaDeArticulos.gridx = 1;
		gbc_lblBsquedaDeArticulos.gridy = 0;
		panelBuscarArticulo.add(lblBsquedaDeArticulos, gbc_lblBsquedaDeArticulos);
		
		lblBuscarArticulo = new JLabel("Buscar Artículo");
		GridBagConstraints gbc_lblBuscarArticulo = new GridBagConstraints();
		gbc_lblBuscarArticulo.anchor = GridBagConstraints.EAST;
		gbc_lblBuscarArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscarArticulo.gridx = 1;
		gbc_lblBuscarArticulo.gridy = 1;
		panelBuscarArticulo.add(lblBuscarArticulo, gbc_lblBuscarArticulo);
		
		txtBuscarArticulo = new JTextField();
		GridBagConstraints gbc_txtBuscarArticulo = new GridBagConstraints();
		gbc_txtBuscarArticulo.gridwidth = 2;
		gbc_txtBuscarArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_txtBuscarArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBuscarArticulo.gridx = 2;
		gbc_txtBuscarArticulo.gridy = 1;
		panelBuscarArticulo.add(txtBuscarArticulo, gbc_txtBuscarArticulo);
		txtBuscarArticulo.setColumns(10);
		
		btnBuscar = new JButton("");
		btnBuscar.setIcon(new ImageIcon(AltaPedidoUI.class.getResource("/iconos/magnifier-left.png")));
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.anchor = GridBagConstraints.WEST;
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 4;
		gbc_btnBuscar.gridy = 1;
		panelBuscarArticulo.add(btnBuscar, gbc_btnBuscar);
		
		lblDescripcion = new JLabel("Descripción");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 3;
		panelBuscarArticulo.add(lblDescripcion, gbc_lblDescripcion);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setEditable(false);
		GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
		gbc_txtDescripcion.gridwidth = 2;
		gbc_txtDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDescripcion.gridx = 2;
		gbc_txtDescripcion.gridy = 3;
		panelBuscarArticulo.add(txtDescripcion, gbc_txtDescripcion);
		txtDescripcion.setColumns(10);
		
		lblPrecio = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 4;
		gbc_lblPrecio.gridy = 3;
		panelBuscarArticulo.add(lblPrecio, gbc_lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
		gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecio.gridx = 5;
		gbc_txtPrecio.gridy = 3;
		panelBuscarArticulo.add(txtPrecio, gbc_txtPrecio);
		txtPrecio.setColumns(10);
		
		label = new JLabel("€");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 6;
		gbc_label.gridy = 3;
		panelBuscarArticulo.add(label, gbc_label);
		
		lblPvp = new JLabel("P.V.P");
		GridBagConstraints gbc_lblPvp = new GridBagConstraints();
		gbc_lblPvp.anchor = GridBagConstraints.EAST;
		gbc_lblPvp.insets = new Insets(0, 0, 5, 5);
		gbc_lblPvp.gridx = 7;
		gbc_lblPvp.gridy = 3;
		panelBuscarArticulo.add(lblPvp, gbc_lblPvp);
		
		txtPvp = new JTextField();
		txtPvp.setEditable(false);
		GridBagConstraints gbc_txtPvp = new GridBagConstraints();
		gbc_txtPvp.insets = new Insets(0, 0, 5, 5);
		gbc_txtPvp.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPvp.gridx = 8;
		gbc_txtPvp.gridy = 3;
		panelBuscarArticulo.add(txtPvp, gbc_txtPvp);
		txtPvp.setColumns(10);
		
		label_1 = new JLabel("€");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 9;
		gbc_label_1.gridy = 3;
		panelBuscarArticulo.add(label_1, gbc_label_1);
		
		lblCantidad = new JLabel("A\u00F1adir cantidad a pedido");
		GridBagConstraints gbc_lblCantidad = new GridBagConstraints();
		gbc_lblCantidad.gridwidth = 2;
		gbc_lblCantidad.anchor = GridBagConstraints.EAST;
		gbc_lblCantidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantidad.gridx = 7;
		gbc_lblCantidad.gridy = 4;
		panelBuscarArticulo.add(lblCantidad, gbc_lblCantidad);
		
		txtCantidad = new JTextField();
		GridBagConstraints gbc_txtCantidad = new GridBagConstraints();
		gbc_txtCantidad.insets = new Insets(0, 0, 5, 5);
		gbc_txtCantidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCantidad.gridx = 9;
		gbc_txtCantidad.gridy = 4;
		panelBuscarArticulo.add(txtCantidad, gbc_txtCantidad);
		txtCantidad.setColumns(10);
		
		btnCantidad = new JButton("");
		btnCantidad.setIcon(new ImageIcon(AltaPedidoUI.class.getResource("/iconos/plus.png")));
		GridBagConstraints gbc_btnCantidad = new GridBagConstraints();
		gbc_btnCantidad.insets = new Insets(0, 0, 5, 5);
		gbc_btnCantidad.gridx = 10;
		gbc_btnCantidad.gridy = 4;
		panelBuscarArticulo.add(btnCantidad, gbc_btnCantidad);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 6;
		add(scrollPane, gbc_scrollPane);
		
		JTabla = new JTable();
		JTabla.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Articulo", "Descripci\u00F3n", "Precio", "Cantidad", "Subtotal"
			}
		){
			@Override
		    public boolean isCellEditable(int row, int column) {
		       return false;
		    }
		});
		scrollPane.setViewportView(JTabla);
		
		panelTotal = new JPanel();
		GridBagConstraints gbc_panelTotal = new GridBagConstraints();
		gbc_panelTotal.insets = new Insets(0, 0, 5, 5);
		gbc_panelTotal.fill = GridBagConstraints.BOTH;
		gbc_panelTotal.gridx = 1;
		gbc_panelTotal.gridy = 7;
		add(panelTotal, gbc_panelTotal);
		GridBagLayout gbl_panelTotal = new GridBagLayout();
		gbl_panelTotal.columnWidths = new int[]{0, 0, 0};
		gbl_panelTotal.rowHeights = new int[]{0, 0};
		gbl_panelTotal.columnWeights = new double[]{1.0, 0.0, 0.0};
		gbl_panelTotal.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelTotal.setLayout(gbl_panelTotal);
		
		lblTotal = new JLabel("TOTAL");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.anchor = GridBagConstraints.EAST;
		gbc_lblTotal.insets = new Insets(0, 0, 0, 5);
		gbc_lblTotal.gridx = 1;
		gbc_lblTotal.gridy = 0;
		panelTotal.add(lblTotal, gbc_lblTotal);
		
		txtTotal = new JTextField();
		GridBagConstraints gbc_txtTotal = new GridBagConstraints();
		gbc_txtTotal.anchor = GridBagConstraints.EAST;
		gbc_txtTotal.gridx = 2;
		gbc_txtTotal.gridy = 0;
		panelTotal.add(txtTotal, gbc_txtTotal);
		txtTotal.setColumns(10);

	}

}