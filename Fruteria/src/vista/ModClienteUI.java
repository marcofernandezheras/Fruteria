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
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Component;

public class ModClienteUI extends JPanel {
	protected JTextField txtNombre;
	protected JTextField txtApellidos;
	protected JTextField txtDNI;
	protected JTextField txtColorDePelo;
	protected JTextField txtMensaje;
	protected JLabel lblNombre = new JLabel("Nombre");
	protected JLabel lblApellidos = new JLabel("Apellidos");
	protected JLabel lblColorDePelo = new JLabel("Color de Pelo");
	protected JLabel lblMensaje = new JLabel("Mensaje");
	protected JButton btnModificar = new JButton("Modificar");
	protected JLabel lblBuscarClientes = new JLabel("Buscar Clientes Existentes");
	protected JPanel panel = new JPanel();
	protected JLabel lblBuscarNombre = new JLabel("Nombre");
	protected JTextField txtBuscarNombre = new JTextField();
	protected JLabel lblBuscarApellido = new JLabel("Apellidos");
	protected JTextField txtBuscarApellido = new JTextField();
	protected JButton btnBuscar = new JButton("");
	protected final JButton btnEscogerColor = new JButton("Escoger color");
	private final JLabel label = new JLabel("Modificar Clientes");

	/**
	 * Create the panel.
	 */
	public ModClienteUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 30, 10, 10, 0, 10, 30, 10, 10 };
		gridBagLayout.rowHeights = new int[] {44, 30, 30, 10, 34, 30, 10, 10, 10, 10, 30, 30, 30, 30};
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		setLayout(gridBagLayout);
						
						GridBagConstraints gbc_label = new GridBagConstraints();
						gbc_label.gridheight = 2;
						gbc_label.gridwidth = 5;
						gbc_label.insets = new Insets(0, 0, 5, 5);
						gbc_label.gridx = 1;
						gbc_label.gridy = 1;
						label.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
						add(label, gbc_label);
				
						GridBagConstraints gbc_lblBuscarClientes = new GridBagConstraints();
						gbc_lblBuscarClientes.gridwidth = 5;
						gbc_lblBuscarClientes.insets = new Insets(0, 0, 5, 5);
						gbc_lblBuscarClientes.gridx = 1;
						gbc_lblBuscarClientes.gridy = 3;
						lblBuscarClientes.setFont(new Font("Tahoma", Font.BOLD, 11));
						add(lblBuscarClientes, gbc_lblBuscarClientes);
				
				GridBagConstraints gbc_panel = new GridBagConstraints();
				gbc_panel.gridwidth = 5;
				gbc_panel.gridheight = 2;
				gbc_panel.insets = new Insets(0, 0, 5, 5);
				gbc_panel.fill = GridBagConstraints.HORIZONTAL;
				gbc_panel.gridx = 1;
				gbc_panel.gridy = 4;
				panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				add(panel, gbc_panel);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[]{75, 247, 50, 0, 0};
				gbl_panel.rowHeights = new int[]{14, 0, 0};
				gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
				gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
				panel.setLayout(gbl_panel);
				
				GridBagConstraints gbc_lblBuscarNombre = new GridBagConstraints();
				gbc_lblBuscarNombre.anchor = GridBagConstraints.NORTHEAST;
				gbc_lblBuscarNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblBuscarNombre.gridx = 0;
				gbc_lblBuscarNombre.gridy = 0;
				lblBuscarNombre.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblBuscarNombre, gbc_lblBuscarNombre);
				
				GridBagConstraints gbc_txtBuscarNombre = new GridBagConstraints();
				gbc_txtBuscarNombre.fill = GridBagConstraints.BOTH;
				gbc_txtBuscarNombre.insets = new Insets(0, 0, 5, 5);
				gbc_txtBuscarNombre.gridx = 1;
				gbc_txtBuscarNombre.gridy = 0;
				txtBuscarNombre.setColumns(10);
				panel.add(txtBuscarNombre, gbc_txtBuscarNombre);
				
				GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
				gbc_btnBuscar.fill = GridBagConstraints.BOTH;
				gbc_btnBuscar.insets = new Insets(0, 0, 0, 5);
				gbc_btnBuscar.gridheight = 2;
				gbc_btnBuscar.gridwidth = 2;
				gbc_btnBuscar.gridx = 2;
				gbc_btnBuscar.gridy = 0;
				btnBuscar.setIcon(new ImageIcon(ModClienteUI.class.getResource("/iconos/magnifier-left.png")));
				panel.add(btnBuscar, gbc_btnBuscar);
				
				GridBagConstraints gbc_lblBuscarApellido = new GridBagConstraints();
				gbc_lblBuscarApellido.anchor = GridBagConstraints.EAST;
				gbc_lblBuscarApellido.insets = new Insets(0, 0, 0, 5);
				gbc_lblBuscarApellido.gridx = 0;
				gbc_lblBuscarApellido.gridy = 1;
				panel.add(lblBuscarApellido, gbc_lblBuscarApellido);
				
				GridBagConstraints gbc_txtBuscarApellido = new GridBagConstraints();
				gbc_txtBuscarApellido.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtBuscarApellido.insets = new Insets(0, 0, 0, 5);
				gbc_txtBuscarApellido.gridx = 1;
				gbc_txtBuscarApellido.gridy = 1;
				txtBuscarApellido.setColumns(10);
				panel.add(txtBuscarApellido, gbc_txtBuscarApellido);
						
								GridBagConstraints gbc_lblNombre = new GridBagConstraints();
								gbc_lblNombre.anchor = GridBagConstraints.EAST;
								gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
								gbc_lblNombre.gridx = 1;
								gbc_lblNombre.gridy = 6;
								add(lblNombre, gbc_lblNombre);
				
						txtNombre = new JTextField();
						GridBagConstraints gbc_txtNombre = new GridBagConstraints();
						gbc_txtNombre.gridwidth = 4;
						gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
						gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
						gbc_txtNombre.gridx = 2;
						gbc_txtNombre.gridy = 6;
						add(txtNombre, gbc_txtNombre);
						txtNombre.setColumns(10);
												
														GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
														gbc_lblApellidos.anchor = GridBagConstraints.EAST;
														gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
														gbc_lblApellidos.gridx = 1;
														gbc_lblApellidos.gridy = 7;
														add(lblApellidos, gbc_lblApellidos);
														
																txtApellidos = new JTextField();
																GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
																gbc_txtApellidos.gridwidth = 4;
																gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
																gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
																gbc_txtApellidos.gridx = 2;
																gbc_txtApellidos.gridy = 7;
																add(txtApellidos, gbc_txtApellidos);
																txtApellidos.setColumns(10);
												
														JLabel lblDni = new JLabel("DNI");
														GridBagConstraints gbc_lblDni = new GridBagConstraints();
														gbc_lblDni.anchor = GridBagConstraints.EAST;
														gbc_lblDni.insets = new Insets(0, 0, 5, 5);
														gbc_lblDni.gridx = 1;
														gbc_lblDni.gridy = 8;
														add(lblDni, gbc_lblDni);
						
								txtDNI = new JTextField();
								GridBagConstraints gbc_txtDNI = new GridBagConstraints();
								gbc_txtDNI.gridwidth = 4;
								gbc_txtDNI.insets = new Insets(0, 0, 5, 5);
								gbc_txtDNI.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtDNI.gridx = 2;
								gbc_txtDNI.gridy = 8;
								add(txtDNI, gbc_txtDNI);
								txtDNI.setColumns(10);
						
								GridBagConstraints gbc_lblColorDePelo = new GridBagConstraints();
								gbc_lblColorDePelo.anchor = GridBagConstraints.EAST;
								gbc_lblColorDePelo.insets = new Insets(0, 0, 5, 5);
								gbc_lblColorDePelo.gridx = 1;
								gbc_lblColorDePelo.gridy = 9;
								add(lblColorDePelo, gbc_lblColorDePelo);
		
				txtColorDePelo = new JTextField();
				txtColorDePelo.setEditable(false);
				GridBagConstraints gbc_txtColorDePelo = new GridBagConstraints();
				gbc_txtColorDePelo.gridwidth = 3;
				gbc_txtColorDePelo.insets = new Insets(0, 0, 5, 5);
				gbc_txtColorDePelo.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtColorDePelo.gridx = 2;
				gbc_txtColorDePelo.gridy = 9;
				add(txtColorDePelo, gbc_txtColorDePelo);
				txtColorDePelo.setColumns(10);
						
		GridBagConstraints gbc_btnEscogerColor = new GridBagConstraints();
		gbc_btnEscogerColor.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEscogerColor.insets = new Insets(0, 0, 5, 5);
		gbc_btnEscogerColor.gridx = 5;
		gbc_btnEscogerColor.gridy = 9;
		add(btnEscogerColor, gbc_btnEscogerColor);
								
										GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
										gbc_lblMensaje.anchor = GridBagConstraints.EAST;
										gbc_lblMensaje.insets = new Insets(0, 0, 5, 5);
										gbc_lblMensaje.gridx = 1;
										gbc_lblMensaje.gridy = 10;
										add(lblMensaje, gbc_lblMensaje);
						
								txtMensaje = new JTextField();
								txtMensaje.setEditable(false);
								GridBagConstraints gbc_txtMensaje = new GridBagConstraints();
								gbc_txtMensaje.gridwidth = 4;
								gbc_txtMensaje.insets = new Insets(0, 0, 5, 5);
								gbc_txtMensaje.fill = GridBagConstraints.BOTH;
								gbc_txtMensaje.gridx = 2;
								gbc_txtMensaje.gridy = 10;
								add(txtMensaje, gbc_txtMensaje);
								txtMensaje.setColumns(10);
										
												GridBagConstraints gbc_btnModificar = new GridBagConstraints();
												gbc_btnModificar.fill = GridBagConstraints.HORIZONTAL;
												gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
												gbc_btnModificar.gridx = 5;
												gbc_btnModificar.gridy = 11;
												btnModificar.setIcon(new ImageIcon(ModClienteUI.class.getResource("/iconos/pencil.png")));
												add(btnModificar, gbc_btnModificar);

	}

}
