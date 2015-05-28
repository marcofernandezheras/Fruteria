package vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class AltaClienteUI extends JPanel {
	protected JTextField txtNombre;
	protected JTextField txtApellidos;
	protected JTextField txtDNI;
	protected JTextField txtColorDePelo;
	protected JLabel lblNombre = new JLabel("Nombre");
	protected JLabel lblApellidos = new JLabel("Apellidos");
	protected JLabel lblColorDePelo = new JLabel("Color de Pelo");
	protected JLabel lblDni = new JLabel("DNI");
	protected JButton btnCrear = new JButton("Crear");
	protected JLabel lblAltaClientes = new JLabel("Alta Clientes");
	protected JButton btnEscogerColor = new JButton("Escoger color");

	/**
	 * Create the panel.
	 */
	public AltaClienteUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 30, 10, 250, 30, 2, 0};
		gridBagLayout.rowHeights = new int[] {30, 19, 20, 30, 10, 18};
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		setLayout(gridBagLayout);
																
																GridBagConstraints gbc_lblAltaClientes = new GridBagConstraints();
																gbc_lblAltaClientes.gridwidth = 3;
																gbc_lblAltaClientes.insets = new Insets(0, 0, 5, 5);
																gbc_lblAltaClientes.gridx = 3;
																gbc_lblAltaClientes.gridy = 0;
																lblAltaClientes.setVerticalAlignment(SwingConstants.TOP);
																lblAltaClientes.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
																add(lblAltaClientes, gbc_lblAltaClientes);
														
																GridBagConstraints gbc_lblNombre = new GridBagConstraints();
																gbc_lblNombre.anchor = GridBagConstraints.EAST;
																gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
																gbc_lblNombre.gridx = 2;
																gbc_lblNombre.gridy = 1;
																add(lblNombre, gbc_lblNombre);
												
														txtNombre = new JTextField();
														GridBagConstraints gbc_txtNombre = new GridBagConstraints();
														gbc_txtNombre.gridwidth = 3;
														gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
														gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
														gbc_txtNombre.gridx = 3;
														gbc_txtNombre.gridy = 1;
														add(txtNombre, gbc_txtNombre);
														txtNombre.setColumns(10);
						
								GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
								gbc_lblApellidos.anchor = GridBagConstraints.EAST;
								gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
								gbc_lblApellidos.gridx = 2;
								gbc_lblApellidos.gridy = 3;
								add(lblApellidos, gbc_lblApellidos);
				
						txtApellidos = new JTextField();
						GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
						gbc_txtApellidos.gridwidth = 3;
						gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
						gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
						gbc_txtApellidos.gridx = 3;
						gbc_txtApellidos.gridy = 3;
						add(txtApellidos, gbc_txtApellidos);
						txtApellidos.setColumns(10);
						
								GridBagConstraints gbc_lblDni = new GridBagConstraints();
								gbc_lblDni.anchor = GridBagConstraints.EAST;
								gbc_lblDni.insets = new Insets(0, 0, 5, 5);
								gbc_lblDni.gridx = 2;
								gbc_lblDni.gridy = 5;
								add(lblDni, gbc_lblDni);
				
						txtDNI = new JTextField();
						GridBagConstraints gbc_txtDNI = new GridBagConstraints();
						gbc_txtDNI.gridwidth = 3;
						gbc_txtDNI.insets = new Insets(0, 0, 5, 5);
						gbc_txtDNI.fill = GridBagConstraints.HORIZONTAL;
						gbc_txtDNI.gridx = 3;
						gbc_txtDNI.gridy = 5;
						add(txtDNI, gbc_txtDNI);
						txtDNI.setColumns(10);
				
						GridBagConstraints gbc_lblColorDePelo = new GridBagConstraints();
						gbc_lblColorDePelo.gridwidth = 2;
						gbc_lblColorDePelo.anchor = GridBagConstraints.EAST;
						gbc_lblColorDePelo.insets = new Insets(0, 0, 5, 5);
						gbc_lblColorDePelo.gridx = 1;
						gbc_lblColorDePelo.gridy = 7;
						add(lblColorDePelo, gbc_lblColorDePelo);
		
				txtColorDePelo = new JTextField();
				txtColorDePelo.setEditable(false);
				GridBagConstraints gbc_txtColorDePelo = new GridBagConstraints();
				gbc_txtColorDePelo.gridwidth = 2;
				gbc_txtColorDePelo.insets = new Insets(0, 0, 5, 5);
				gbc_txtColorDePelo.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtColorDePelo.gridx = 3;
				gbc_txtColorDePelo.gridy = 7;
				add(txtColorDePelo, gbc_txtColorDePelo);
				txtColorDePelo.setColumns(10);
		
		GridBagConstraints gbc_btnEscogerColor = new GridBagConstraints();
		gbc_btnEscogerColor.insets = new Insets(0, 0, 5, 5);
		gbc_btnEscogerColor.gridx = 5;
		gbc_btnEscogerColor.gridy = 7;
		btnEscogerColor.setIcon(new ImageIcon(AltaClienteUI.class.getResource("/iconos/color.png")));
		add(btnEscogerColor, gbc_btnEscogerColor);
		
				GridBagConstraints gbc_btnCrear = new GridBagConstraints();
				gbc_btnCrear.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnCrear.gridheight = 2;
				gbc_btnCrear.insets = new Insets(0, 0, 0, 5);
				gbc_btnCrear.gridx = 5;
				gbc_btnCrear.gridy = 8;
				btnCrear.setIcon(new ImageIcon(AltaClienteUI.class.getResource("/iconos/plus.png")));
				add(btnCrear, gbc_btnCrear);

	}
}