package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;

public class BuscarArticuloUI extends JPanel {

	protected JTextField txtPrecio;
	protected JTextField txtPVP;
	protected JTextField txtDescripcion;
	protected JTextField txtMensaje;
	protected JLabel lblBsquedaDeArticulos = new JLabel("Búsqueda de artículos");
	protected JLabel lblBusquedaNombre = new JLabel("Búsqueda Nombre");
	protected JButton btnBuscar = new JButton("");
	protected JLabel lblNombre = new JLabel("Nombre");
	protected JLabel lblPrecio = new JLabel("Precio");
	protected JLabel lblMensaje = new JLabel("Mensaje");
	protected JLabel label = new JLabel("\u20AC");
	protected JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
	protected JLabel lblPvp = new JLabel("PVP");
	protected JLabel lblEuros = new JLabel("\u20AC");
	protected JTextField txtBusquedaNombre = new JTextField();
	protected JTextField txtNombre = new JTextField();
	protected JLabel label_1 = new JLabel("         ");
	protected JLabel lblKgjhk = new JLabel("    ");

	/**
	 * Create the panel.
	 */
	public BuscarArticuloUI() {
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtBusquedaNombre.setColumns(10);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {42, 99, 110, 30, 80, 30, 79, 79, 0};
		gridBagLayout.rowHeights = new int[] {59, 10, 53, 23, 30, 30, 30, 38, 30, 10};
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		setLayout(gridBagLayout);

		lblBsquedaDeArticulos.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		GridBagConstraints gbc_lblBsquedaDeArticulos = new GridBagConstraints();
		gbc_lblBsquedaDeArticulos.fill = GridBagConstraints.VERTICAL;
		gbc_lblBsquedaDeArticulos.gridwidth = 5;
		gbc_lblBsquedaDeArticulos.insets = new Insets(0, 0, 5, 5);
		gbc_lblBsquedaDeArticulos.gridx = 2;
		gbc_lblBsquedaDeArticulos.gridy = 0;
		add(lblBsquedaDeArticulos, gbc_lblBsquedaDeArticulos);

		lblBusquedaNombre.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblBusquedaNombre = new GridBagConstraints();
		gbc_lblBusquedaNombre.anchor = GridBagConstraints.EAST;
		gbc_lblBusquedaNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblBusquedaNombre.gridx = 1;
		gbc_lblBusquedaNombre.gridy = 1;
		add(lblBusquedaNombre, gbc_lblBusquedaNombre);

		GridBagConstraints gbc_txtBusquedaNombre = new GridBagConstraints();
		gbc_txtBusquedaNombre.gridwidth = 5;
		gbc_txtBusquedaNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtBusquedaNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBusquedaNombre.gridx = 2;
		gbc_txtBusquedaNombre.gridy = 1;
		add(txtBusquedaNombre, gbc_txtBusquedaNombre);

		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 7;
		gbc_btnBuscar.gridy = 1;
		btnBuscar.setIcon(new ImageIcon(BuscarArticuloUI.class.getResource("/iconos/magnifier-left.png")));
		add(btnBuscar, gbc_btnBuscar);
		
		GridBagConstraints gbc_lblKgjhk = new GridBagConstraints();
		gbc_lblKgjhk.insets = new Insets(0, 0, 5, 5);
		gbc_lblKgjhk.gridx = 0;
		gbc_lblKgjhk.gridy = 2;
		add(lblKgjhk, gbc_lblKgjhk);

		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 2;
		add(lblNombre, gbc_lblNombre);

		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 5;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 2;
		add(txtNombre, gbc_txtNombre);

		lblPrecio.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 3;
		add(lblPrecio, gbc_lblPrecio);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
		gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecio.gridx = 2;
		gbc_txtPrecio.gridy = 3;
		add(txtPrecio, gbc_txtPrecio);
		txtPrecio.setColumns(10);

		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridwidth = 2;
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 3;
		gbc_label.gridy = 3;
		add(label, gbc_label);

		GridBagConstraints gbc_lblPvp = new GridBagConstraints();
		gbc_lblPvp.anchor = GridBagConstraints.EAST;
		gbc_lblPvp.insets = new Insets(0, 0, 5, 5);
		gbc_lblPvp.gridx = 5;
		gbc_lblPvp.gridy = 3;
		add(lblPvp, gbc_lblPvp);

		txtPVP = new JTextField();
		txtPVP.setEditable(false);
		GridBagConstraints gbc_txtPVP = new GridBagConstraints();
		gbc_txtPVP.insets = new Insets(0, 0, 5, 5);
		gbc_txtPVP.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPVP.gridx = 6;
		gbc_txtPVP.gridy = 3;
		add(txtPVP, gbc_txtPVP);
		txtPVP.setColumns(10);

		GridBagConstraints gbc_lblEuros = new GridBagConstraints();
		gbc_lblEuros.anchor = GridBagConstraints.WEST;
		gbc_lblEuros.insets = new Insets(0, 0, 5, 5);
		gbc_lblEuros.gridx = 7;
		gbc_lblEuros.gridy = 3;
		add(lblEuros, gbc_lblEuros);

		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 1;
		gbc_lblDescripcin.gridy = 4;
		add(lblDescripcin, gbc_lblDescripcin);

		txtDescripcion = new JTextField();
		txtDescripcion.setEditable(false);
		txtDescripcion.setMargin(new Insets(2, 2, 2, 20));
		GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
		gbc_txtDescripcion.gridheight = 4;
		gbc_txtDescripcion.gridwidth = 6;
		gbc_txtDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescripcion.fill = GridBagConstraints.BOTH;
		gbc_txtDescripcion.gridx = 2;
		gbc_txtDescripcion.gridy = 4;
		add(txtDescripcion, gbc_txtDescripcion);
		txtDescripcion.setColumns(10);
		
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 8;
		gbc_label_1.gridy = 6;
		add(label_1, gbc_label_1);

		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.anchor = GridBagConstraints.EAST;
		gbc_lblMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensaje.gridx = 1;
		gbc_lblMensaje.gridy = 8;
		add(lblMensaje, gbc_lblMensaje);

		txtMensaje = new JTextField();
		txtMensaje.setEditable(false);
		GridBagConstraints gbc_txtMensaje = new GridBagConstraints();
		gbc_txtMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_txtMensaje.gridwidth = 6;
		gbc_txtMensaje.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMensaje.gridx = 2;
		gbc_txtMensaje.gridy = 8;
		add(txtMensaje, gbc_txtMensaje);
		txtMensaje.setColumns(10);

	}

}