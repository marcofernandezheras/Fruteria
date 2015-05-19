package vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class AltaArticuloUI extends JPanel {

	protected JTextField txtNombre;
	protected JTextField txtPrecio;
	protected JTextField txtPVP;
	protected JTextField txtDescripcion;
	protected JLabel lblAltaArticulos = new JLabel("Alta Articulos");
	protected JLabel lblNombre = new JLabel("Nombre");
	protected JLabel lblPrecio = new JLabel("Precio");
	protected JLabel lblEuro = new JLabel("\u20AC");
	protected JLabel lblPvp = new JLabel("PVP");
	protected JLabel lblEuros = new JLabel("\u20AC");
	protected JLabel lblDescripcion = new JLabel("Descripcion");
	protected JButton btnCrear;
	/**
	 * Create the panel.
	 */
	public AltaArticuloUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 78, 0, 59, 0, 0, 0, 26, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		lblAltaArticulos.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		GridBagConstraints gbc_lblAltaArticulos = new GridBagConstraints();
		gbc_lblAltaArticulos.gridwidth = 4;
		gbc_lblAltaArticulos.insets = new Insets(0, 0, 5, 5);
		gbc_lblAltaArticulos.gridx = 3;
		gbc_lblAltaArticulos.gridy = 0;
		add(lblAltaArticulos, gbc_lblAltaArticulos);

		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		add(lblNombre, gbc_lblNombre);

		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridwidth = 5;
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 3;
		gbc_txtNombre.gridy = 1;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);

		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 3;
		add(lblPrecio, gbc_lblPrecio);

		txtPrecio = new JTextField();
		GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
		gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecio.gridx = 3;
		gbc_txtPrecio.gridy = 3;
		add(txtPrecio, gbc_txtPrecio);
		txtPrecio.setColumns(10);

		GridBagConstraints gbc_lblEuro = new GridBagConstraints();
		gbc_lblEuro.insets = new Insets(0, 0, 5, 5);
		gbc_lblEuro.gridx = 4;
		gbc_lblEuro.gridy = 3;
		add(lblEuro, gbc_lblEuro);

		GridBagConstraints gbc_lblPvp = new GridBagConstraints();
		gbc_lblPvp.anchor = GridBagConstraints.EAST;
		gbc_lblPvp.insets = new Insets(0, 0, 5, 5);
		gbc_lblPvp.gridx = 5;
		gbc_lblPvp.gridy = 3;
		add(lblPvp, gbc_lblPvp);

		txtPVP = new JTextField();
		GridBagConstraints gbc_txtPVP = new GridBagConstraints();
		gbc_txtPVP.gridwidth = 2;
		gbc_txtPVP.insets = new Insets(0, 0, 5, 5);
		gbc_txtPVP.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPVP.gridx = 6;
		gbc_txtPVP.gridy = 3;
		add(txtPVP, gbc_txtPVP);
		txtPVP.setColumns(10);
		
				GridBagConstraints gbc_lblEuros = new GridBagConstraints();
				gbc_lblEuros.anchor = GridBagConstraints.WEST;
				gbc_lblEuros.insets = new Insets(0, 0, 5, 5);
				gbc_lblEuros.gridx = 8;
				gbc_lblEuros.gridy = 3;
				add(lblEuros, gbc_lblEuros);

		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 5;
		add(lblDescripcion, gbc_lblDescripcion);

		txtDescripcion = new JTextField();
		GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
		gbc_txtDescripcion.gridwidth = 6;
		gbc_txtDescripcion.gridheight = 4;
		gbc_txtDescripcion.insets = new Insets(0, 0, 5, 0);
		gbc_txtDescripcion.fill = GridBagConstraints.BOTH;
		gbc_txtDescripcion.gridx = 3;
		gbc_txtDescripcion.gridy = 5;
		add(txtDescripcion, gbc_txtDescripcion);
		txtDescripcion.setColumns(10);

		btnCrear = new JButton("Crear");
		btnCrear.setIcon(new ImageIcon(AltaArticuloUI.class.getResource("/iconos/plus.png")));

		GridBagConstraints gbc_btnCrear = new GridBagConstraints();
		gbc_btnCrear.gridwidth = 3;
		gbc_btnCrear.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCrear.gridx = 7;
		gbc_btnCrear.gridy = 9;
		add(btnCrear, gbc_btnCrear);

	}

}
