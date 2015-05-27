package controlador;

import vista.BuscarClienteUI;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

import modelo.Cliente;

@SuppressWarnings("serial")
public class ParaBuscarCliente extends BuscarClienteUI {

	private IListaCliente listaCliente;

	public ParaBuscarCliente(IListaCliente listaCliente) {
		super();
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNombre.setText("");
				txtApellido.setText("");
				txtDNI.setText("");
				txtColorPelo.setText("");
				buscarCliente();
			}
		});
		this.listaCliente = listaCliente;
	}

	/**
	 * Evento del boton <code>btnBuscar</code>
	 */
	private void buscarCliente() {
		txtMensaje.setText("");
		if (!txtBuscarNombre.getText().isEmpty() && !txtBuscarApellido.getText().isEmpty()) {
			Cliente cliente = listaCliente.buscarCliente(txtBuscarNombre.getText(), txtBuscarApellido.getText());
			if (cliente != null) {
				txtMensaje.setText("");
				txtDNI.setText(cliente.getDni());
				txtNombre.setText(cliente.getNombre());
				txtApellido.setText(cliente.getApellidos());
				if (cliente.getColorPelo() != null) {
					txtColorPelo.setText(colorToText(cliente.getColorPelo()));
					txtColorPelo.setForeground(cliente.getColorPelo());
				}
				txtBuscarNombre.setText("");
				txtBuscarApellido.setText("");
			} else {
				txtMensaje.setText("No existe un cliente con ese nombre y apellidos");
			}
			txtBuscarNombre.setText("");
			txtBuscarApellido.setText("");
		} else {
			txtMensaje.setText("Debe introducir datos para poder buscar");
		}
	}

	private String colorToText(Color c) {
		return String.format("#%02x%02x%02x", c.getRed(), c.getGreen(), c.getBlue());
	}
	
}
