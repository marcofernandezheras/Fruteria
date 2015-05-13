package vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class BuscarClienteUI extends JPanel {
	protected JTextField txtBuscarNombre;
	protected final JButton btnBuscar = new JButton("");
	protected JLabel lblNombre;
	protected JTextField txtNombre;
	protected JLabel lblApellido;
	protected JTextField txtApellido;
	protected JLabel lblDNI;
	protected JTextField txtDNI;
	protected JLabel lblColorPelo;
	protected JTextField txtColorPelo;
	protected JLabel lblMensaje;
	protected JTextField txtMensaje;
	protected JLabel lblBuscarCliente;
	protected JTextField txtBuscarApellido;
	protected JLabel lblNewLabel;
	protected JLabel lblNewLabel_1;

	/**
	 * Create the panel.
	 */
	public BuscarClienteUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 28, 58, 0, 195, 0, 1, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblBuscarCliente = new JLabel("BUSCAR CLIENTE");
		lblBuscarCliente.setIcon(null);
		lblBuscarCliente.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		GridBagConstraints gbc_lblBuscarCliente = new GridBagConstraints();
		gbc_lblBuscarCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscarCliente.gridx = 4;
		gbc_lblBuscarCliente.gridy = 0;
		add(lblBuscarCliente, gbc_lblBuscarCliente);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblBuscar = new GridBagConstraints();
		gbc_lblBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscar.gridx = 1;
		gbc_lblBuscar.gridy = 1;
		add(lblBuscar, gbc_lblBuscar);
		
		lblNewLabel = new JLabel("Nombre");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txtBuscarNombre = new JTextField();
		GridBagConstraints gbc_txtBuscarNombre = new GridBagConstraints();
		gbc_txtBuscarNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtBuscarNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBuscarNombre.gridx = 4;
		gbc_txtBuscarNombre.gridy = 1;
		add(txtBuscarNombre, gbc_txtBuscarNombre);
		txtBuscarNombre.setColumns(10);
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 0);
		gbc_btnBuscar.gridx = 6;
		gbc_btnBuscar.gridy = 1;
		btnBuscar.setIcon(new ImageIcon("C:\\Users\\Eddi\\Desktop\\lupa.ico"));
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		add(btnBuscar, gbc_btnBuscar);
		
		lblNewLabel_1 = new JLabel("Apellido");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 2;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtBuscarApellido = new JTextField();
		GridBagConstraints gbc_txtBuscarApellido = new GridBagConstraints();
		gbc_txtBuscarApellido.insets = new Insets(0, 0, 5, 5);
		gbc_txtBuscarApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBuscarApellido.gridx = 4;
		gbc_txtBuscarApellido.gridy = 2;
		add(txtBuscarApellido, gbc_txtBuscarApellido);
		txtBuscarApellido.setColumns(10);
		
		lblNombre = new JLabel(" Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 3;
		add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 4;
		gbc_txtNombre.gridy = 3;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 2;
		gbc_lblApellido.gridy = 4;
		add(lblApellido, gbc_lblApellido);
		
		txtApellido = new JTextField();
		GridBagConstraints gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.gridx = 4;
		gbc_txtApellido.gridy = 4;
		add(txtApellido, gbc_txtApellido);
		txtApellido.setColumns(10);
		
		lblDNI = new JLabel("DNI");
		lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDNI = new GridBagConstraints();
		gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNI.gridx = 2;
		gbc_lblDNI.gridy = 5;
		add(lblDNI, gbc_lblDNI);
		
		txtDNI = new JTextField();
		GridBagConstraints gbc_txtDNI = new GridBagConstraints();
		gbc_txtDNI.insets = new Insets(0, 0, 5, 5);
		gbc_txtDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDNI.gridx = 4;
		gbc_txtDNI.gridy = 5;
		add(txtDNI, gbc_txtDNI);
		txtDNI.setColumns(10);
		
		lblColorPelo = new JLabel("Color Pelo");
		lblColorPelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblColorPelo = new GridBagConstraints();
		gbc_lblColorPelo.insets = new Insets(0, 0, 5, 5);
		gbc_lblColorPelo.gridx = 2;
		gbc_lblColorPelo.gridy = 6;
		add(lblColorPelo, gbc_lblColorPelo);
		
		txtColorPelo = new JTextField();
		GridBagConstraints gbc_txtColorPelo = new GridBagConstraints();
		gbc_txtColorPelo.insets = new Insets(0, 0, 5, 5);
		gbc_txtColorPelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtColorPelo.gridx = 4;
		gbc_txtColorPelo.gridy = 6;
		add(txtColorPelo, gbc_txtColorPelo);
		txtColorPelo.setColumns(10);
		
		lblMensaje = new JLabel("Mensaje");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensaje.gridx = 2;
		gbc_lblMensaje.gridy = 7;
		add(lblMensaje, gbc_lblMensaje);
		
		txtMensaje = new JTextField();
		GridBagConstraints gbc_txtMensaje = new GridBagConstraints();
		gbc_txtMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_txtMensaje.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMensaje.gridx = 4;
		gbc_txtMensaje.gridy = 7;
		add(txtMensaje, gbc_txtMensaje);
		txtMensaje.setColumns(10);

	}

}
