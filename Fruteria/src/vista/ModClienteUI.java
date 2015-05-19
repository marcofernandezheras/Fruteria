package vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ModClienteUI extends JPanel {

	protected JTextField txtBuscarNombre;
	protected JTextField txtNombre;
	protected JTextField txtApellidos;
	protected JTextField txtDNI;
	protected JTextField txtColorDePelo;
	protected JTextField txtMensaje;
	protected JLabel lblModificarClientes = new JLabel("Modificar Clientes");
	protected JLabel lblBuscar = new JLabel("Buscar");
	protected JLabel lblNombre = new JLabel("Nombre");
	protected JLabel lblApellidos = new JLabel("Apellidos");
	protected JLabel lblColorDePelo = new JLabel("Color de Pelo");
	protected JLabel lblMensaje = new JLabel("Mensaje");
	protected JButton btnModificar = new JButton("Modificar");
	protected JButton btnNewButton = new JButton("");
	protected JTextField txtBuscarApellido = new JTextField();

	/**
	 * Create the panel.
	 */
	public ModClienteUI() {
		txtBuscarApellido.setColumns(10);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 44, 0, 23, 0, 0, 0, 0, 0, 20, 0, 0, 10, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		lblModificarClientes.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		GridBagConstraints gbc_lblModificarClientes = new GridBagConstraints();
		gbc_lblModificarClientes.gridwidth = 3;
		gbc_lblModificarClientes.fill = GridBagConstraints.VERTICAL;
		gbc_lblModificarClientes.gridheight = 2;
		gbc_lblModificarClientes.insets = new Insets(0, 0, 5, 5);
		gbc_lblModificarClientes.gridx = 2;
		gbc_lblModificarClientes.gridy = 0;
		add(lblModificarClientes, gbc_lblModificarClientes);

		GridBagConstraints gbc_lblBuscar = new GridBagConstraints();
		gbc_lblBuscar.anchor = GridBagConstraints.EAST;
		gbc_lblBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscar.gridx = 1;
		gbc_lblBuscar.gridy = 2;
		add(lblBuscar, gbc_lblBuscar);

		txtBuscarNombre = new JTextField();
		GridBagConstraints gbc_txtBuscarNombre = new GridBagConstraints();
		gbc_txtBuscarNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtBuscarNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBuscarNombre.gridx = 2;
		gbc_txtBuscarNombre.gridy = 2;
		add(txtBuscarNombre, gbc_txtBuscarNombre);
		txtBuscarNombre.setColumns(10);
		
		GridBagConstraints gbc_txtBuscarApellido = new GridBagConstraints();
		gbc_txtBuscarApellido.gridwidth = 2;
		gbc_txtBuscarApellido.insets = new Insets(0, 0, 5, 5);
		gbc_txtBuscarApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBuscarApellido.gridx = 3;
		gbc_txtBuscarApellido.gridy = 2;
		add(txtBuscarApellido, gbc_txtBuscarApellido);
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 2;
		btnNewButton.setIcon(new ImageIcon(ModClienteUI.class.getResource("/iconos/magnifier-left.png")));
		add(btnNewButton, gbc_btnNewButton);

		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 3;
		add(lblNombre, gbc_lblNombre);

		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 3;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 3;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);

		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 4;
		add(lblApellidos, gbc_lblApellidos);

		txtApellidos = new JTextField();
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.gridwidth = 3;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 2;
		gbc_txtApellidos.gridy = 4;
		add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);

		JLabel lblDni = new JLabel("DNI");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.anchor = GridBagConstraints.EAST;
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 1;
		gbc_lblDni.gridy = 5;
		add(lblDni, gbc_lblDni);

		txtDNI = new JTextField();
		GridBagConstraints gbc_txtDNI = new GridBagConstraints();
		gbc_txtDNI.gridwidth = 3;
		gbc_txtDNI.insets = new Insets(0, 0, 5, 5);
		gbc_txtDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDNI.gridx = 2;
		gbc_txtDNI.gridy = 5;
		add(txtDNI, gbc_txtDNI);
		txtDNI.setColumns(10);

		GridBagConstraints gbc_lblColorDePelo = new GridBagConstraints();
		gbc_lblColorDePelo.anchor = GridBagConstraints.EAST;
		gbc_lblColorDePelo.insets = new Insets(0, 0, 5, 5);
		gbc_lblColorDePelo.gridx = 1;
		gbc_lblColorDePelo.gridy = 6;
		add(lblColorDePelo, gbc_lblColorDePelo);

		txtColorDePelo = new JTextField();
		GridBagConstraints gbc_txtColorDePelo = new GridBagConstraints();
		gbc_txtColorDePelo.gridwidth = 3;
		gbc_txtColorDePelo.insets = new Insets(0, 0, 5, 5);
		gbc_txtColorDePelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtColorDePelo.gridx = 2;
		gbc_txtColorDePelo.gridy = 6;
		add(txtColorDePelo, gbc_txtColorDePelo);
		txtColorDePelo.setColumns(10);

		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.anchor = GridBagConstraints.EAST;
		gbc_lblMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensaje.gridx = 1;
		gbc_lblMensaje.gridy = 7;
		add(lblMensaje, gbc_lblMensaje);

		txtMensaje = new JTextField();
		GridBagConstraints gbc_txtMensaje = new GridBagConstraints();
		gbc_txtMensaje.gridwidth = 3;
		gbc_txtMensaje.gridheight = 3;
		gbc_txtMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_txtMensaje.fill = GridBagConstraints.BOTH;
		gbc_txtMensaje.gridx = 2;
		gbc_txtMensaje.gridy = 7;
		add(txtMensaje, gbc_txtMensaje);
		txtMensaje.setColumns(10);

		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.gridwidth = 2;
		gbc_btnModificar.insets = new Insets(0, 0, 5, 0);
		gbc_btnModificar.gridx = 4;
		gbc_btnModificar.gridy = 10;
		btnModificar.setIcon(new ImageIcon(ModClienteUI.class.getResource("/iconos/pencil.png")));
		add(btnModificar, gbc_btnModificar);

	}

}

