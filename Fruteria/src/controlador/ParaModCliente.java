package controlador;

import vista.ModClienteUI;

import java.awt.event.ActionListener;

import com.aeat.valida.Validador;

import modelo.Cliente;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class ParaModCliente extends ModClienteUI {

	private IListaCliente listaCliente;
	private Object identificador;
	private Cliente cliente;
	private Color colorActual;

	public ParaModCliente(IListaCliente listaCliente) {
		btnBuscar.setFocusable(false);
		txtNombre.setEditable(false);
		txtApellidos.setEditable(false);
		txtDNI.setEditable(false);
		btnEscogerColor.setEnabled(false);
		btnModificar.setEnabled(false);
		//PARA NO ELIMINARLO
		txtMensaje.setVisible(false);
		lblMensaje.setVisible(false);
		btnEscogerColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escogerColor();
			}
		});
		this.listaCliente = listaCliente;
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarCliente();
			}
		});
		btnBuscar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				buscarCliente();
			}

		});
	}

	protected void escogerColor() {
		Color c = JColorChooser.showDialog(this, "Escoger color", colorActual);
		if (c != null) {
			colorActual = c;
			txtColorDePelo.setText(colorToText(c));
			txtColorDePelo.setForeground(c);
		}
	}

	private void buscarCliente() {
		txtMensaje.setText("");
		if (!txtBuscarNombre.getText().isEmpty() && !txtBuscarApellido.getText().isEmpty()) {
			cliente = listaCliente.buscarCliente(txtBuscarNombre.getText(), txtBuscarApellido.getText());
			if (cliente != null) {
				identificador = cliente.identificador();
				txtDNI.setText(cliente.getDni());
				txtNombre.setText(cliente.getNombre());
				txtApellidos.setText(cliente.getApellidos());
				if (cliente.getColorPelo() != null) {
					colorActual = cliente.getColorPelo();
					txtColorDePelo.setText(colorToText(cliente.getColorPelo()));
					txtColorDePelo.setForeground(cliente.getColorPelo());
					txtBuscarNombre.setText("");
					txtBuscarApellido.setText("");

					txtNombre.setEditable(true);
					txtApellidos.setEditable(true);
					txtDNI.setEditable(true);
					btnEscogerColor.setEnabled(true);
					btnModificar.setEnabled(true);
				}
			} else {
				JOptionPane.showMessageDialog(this, "No existe un cliente con ese nombre y apellido");
//				txtMensaje.setText("No existe un cliente con ese nombre y apellidos");
			}
		} else {
			JOptionPane.showMessageDialog(this, "Debe introducir datos para poder buscar");
//			txtMensaje.setText("Debe introducir datos para poder buscar");
		}

	}

	private void modificarCliente() {
		if (cliente != null) /* Si tenemos un cliente */
		{
			if (!txtNombre.getText().isEmpty() && !txtApellidos.getText().isEmpty() && !txtDNI.getText().isEmpty()
					&& !txtColorDePelo.getText()
							.isEmpty()) /* No hay ningún valor vacio */
			{
				Validador validador = new Validador();
				int e = validador.checkNif(txtDNI.getText());

				if (e > 0) {
					cliente.setDni(txtDNI.getText());
					cliente.setNombre(txtNombre.getText());
					cliente.setApellidos(txtApellidos.getText());
					cliente.setColorPelo(colorActual);
					if (listaCliente.modificarCliente(cliente, identificador)) {
						identificador = cliente.identificador();
						JOptionPane.showMessageDialog(this, "Cliente modificado con éxito");
						txtNombre.setText("");
						txtApellidos.setText("");
						txtDNI.setText("");
						txtColorDePelo.setText("");
						txtNombre.setEditable(false);
						txtApellidos.setEditable(false);
						txtDNI.setEditable(false);
						btnEscogerColor.setEnabled(false);
						btnModificar.setEnabled(false);
					} else {
						JOptionPane.showMessageDialog(this, "Error interno al modificar");
//						txtMensaje.setText("Error interno al modificar");
					}
				} else {
					JOptionPane.showMessageDialog(this, "DNI erroneo");
//					txtMensaje.setText("DNI erroneo");
				}
			} else {
				JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
//				txtMensaje.setText("Todos los campos son obligatorios");
			}
		} else {
			JOptionPane.showMessageDialog(this, "Debe buscar un cliente a modificar");
//			txtMensaje.setText("Debe buscar un cliente a modificar");
		}
	}

	private String colorToText(Color c) {
		return String.format("#%02x%02x%02x", c.getRed(), c.getGreen(), c.getBlue());
	}
}
