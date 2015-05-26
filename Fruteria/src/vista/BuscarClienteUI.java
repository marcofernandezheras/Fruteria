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
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class BuscarClienteUI extends JPanel {
	protected JTextField txtBuscarNombre;
	protected JButton btnBuscar = new JButton("");
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
	protected JPanel panel;
	protected JLabel lblNewLabel_2;
	protected JLabel lblNewLabel_3;

	/**
	 * Create the panel.
	 */
	public BuscarClienteUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {58, 30, 58, 0, 10};
		gridBagLayout.rowHeights = new int[] {58, 30, 30, 30, 10, 10, 30, 10, 30, 10, 30};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		lblBuscarCliente = new JLabel("BUSCAR CLIENTE");
		lblBuscarCliente.setIcon(null);
		lblBuscarCliente.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		GridBagConstraints gbc_lblBuscarCliente = new GridBagConstraints();
		gbc_lblBuscarCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscarCliente.gridx = 2;
		gbc_lblBuscarCliente.gridy = 0;
		add(lblBuscarCliente, gbc_lblBuscarCliente);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.ipadx = 10;
		gbc_panel.gridwidth = 2;
		gbc_panel.gridheight = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{10, 49, 86, 51, 86, 57, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 28, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblNewLabel_2 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 0;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 5;
		gbc_lblNewLabel_3.gridy = 3;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		lblNewLabel = new JLabel("Nombre");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtBuscarNombre = new JTextField();
		GridBagConstraints gbc_txtBuscarNombre = new GridBagConstraints();
		gbc_txtBuscarNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBuscarNombre.gridwidth = 4;
		gbc_txtBuscarNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtBuscarNombre.gridx = 2;
		gbc_txtBuscarNombre.gridy = 1;
		panel.add(txtBuscarNombre, gbc_txtBuscarNombre);
		txtBuscarNombre.setColumns(10);
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.gridwidth = 4;
		gbc_btnBuscar.fill = GridBagConstraints.BOTH;
		gbc_btnBuscar.gridheight = 2;
		gbc_btnBuscar.gridx = 6;
		gbc_btnBuscar.gridy = 1;
		panel.add(btnBuscar, gbc_btnBuscar);
		btnBuscar.setIcon(new ImageIcon(BuscarClienteUI.class.getResource("/iconos/magnifier-left.png")));
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		lblNewLabel_1 = new JLabel("Apellidos");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtBuscarApellido = new JTextField();
		GridBagConstraints gbc_txtBuscarApellido = new GridBagConstraints();
		gbc_txtBuscarApellido.gridwidth = 4;
		gbc_txtBuscarApellido.fill = GridBagConstraints.BOTH;
		gbc_txtBuscarApellido.insets = new Insets(0, 0, 0, 5);
		gbc_txtBuscarApellido.gridx = 2;
		gbc_txtBuscarApellido.gridy = 2;
		panel.add(txtBuscarApellido, gbc_txtBuscarApellido);
		txtBuscarApellido.setColumns(10);
		
		lblNombre = new JLabel(" Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 4;
		add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 4;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.anchor = GridBagConstraints.EAST;
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 1;
		gbc_lblApellido.gridy = 5;
		add(lblApellido, gbc_lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		GridBagConstraints gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.gridx = 2;
		gbc_txtApellido.gridy = 5;
		add(txtApellido, gbc_txtApellido);
		txtApellido.setColumns(10);
		
		lblDNI = new JLabel("DNI");
		lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDNI = new GridBagConstraints();
		gbc_lblDNI.anchor = GridBagConstraints.EAST;
		gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNI.gridx = 1;
		gbc_lblDNI.gridy = 6;
		add(lblDNI, gbc_lblDNI);
		
		txtDNI = new JTextField();
		txtDNI.setEditable(false);
		GridBagConstraints gbc_txtDNI = new GridBagConstraints();
		gbc_txtDNI.insets = new Insets(0, 0, 5, 5);
		gbc_txtDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDNI.gridx = 2;
		gbc_txtDNI.gridy = 6;
		add(txtDNI, gbc_txtDNI);
		txtDNI.setColumns(10);
		
		lblColorPelo = new JLabel("Color Pelo");
		lblColorPelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblColorPelo = new GridBagConstraints();
		gbc_lblColorPelo.anchor = GridBagConstraints.EAST;
		gbc_lblColorPelo.insets = new Insets(0, 0, 5, 5);
		gbc_lblColorPelo.gridx = 1;
		gbc_lblColorPelo.gridy = 7;
		add(lblColorPelo, gbc_lblColorPelo);
		
		txtColorPelo = new JTextField();
		txtColorPelo.setEditable(false);
		GridBagConstraints gbc_txtColorPelo = new GridBagConstraints();
		gbc_txtColorPelo.insets = new Insets(0, 0, 5, 5);
		gbc_txtColorPelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtColorPelo.gridx = 2;
		gbc_txtColorPelo.gridy = 7;
		add(txtColorPelo, gbc_txtColorPelo);
		txtColorPelo.setColumns(10);
		
		lblMensaje = new JLabel("Mensaje");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.anchor = GridBagConstraints.EAST;
		gbc_lblMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensaje.gridx = 1;
		gbc_lblMensaje.gridy = 9;
		add(lblMensaje, gbc_lblMensaje);
		
		txtMensaje = new JTextField();
		txtMensaje.setEditable(false);
		GridBagConstraints gbc_txtMensaje = new GridBagConstraints();
		gbc_txtMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_txtMensaje.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMensaje.gridx = 2;
		gbc_txtMensaje.gridy = 9;
		add(txtMensaje, gbc_txtMensaje);
		txtMensaje.setColumns(10);

	}

}