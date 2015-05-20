package controlador;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import modelo.Articulo;
import modelo.Cliente;

import com.aeat.valida.Validador;

import vista.AltaArticuloUI;
import vista.AltaClienteUI;

public class ParaAltaCliente extends AltaClienteUI {

	IListaCliente listaClientes;

	public ParaAltaCliente(IListaCliente listaClientes) {
		this.listaClientes = listaClientes;
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				crearCliente();
			}

		});
	}

	private void crearCliente() {
		if (validarDatos()) {
			if (listaClientes.altaCliente(generarCliente())) {
				txtNombre.setText("");
				txtApellidos.setText("");
				txtColorDePelo.setText("");
				txtDNI.setText("");
				JOptionPane.showMessageDialog(this, "Cliente creado con éxito");
			} else {
				JOptionPane.showMessageDialog(this, "El cliente ya existe");
			}
		}

	}

	private boolean validarDatos() {

		boolean valid = false;
		Validador validador = new Validador();
		int e = validador.checkNif(txtDNI.getText());

		if (e > 0) {
			if (!txtNombre.getText().isEmpty() && !txtApellidos.getText().isEmpty()
					&& !txtColorDePelo.getText().isEmpty()) {
				try {
					Integer.parseInt(txtNombre.getText());
					JOptionPane.showMessageDialog(this, "El nombre no debe contener numeros");
				} catch (Exception e2) {

					try {
						Integer.parseInt(txtApellidos.getText());
						JOptionPane.showMessageDialog(this, "Los apellidos no deben contener numeros");
					} catch (Exception e3) {
						valid = true;
					}

				}
			} else {
				JOptionPane.showMessageDialog(this, "Algunos campos estan vacios");
			}

		} else {
			JOptionPane.showMessageDialog(this, "DNI no valido");
		}
		return valid;
	}

	private Cliente generarCliente() {
		Cliente cliente = new Cliente(txtDNI.getText(), txtNombre.getText(), txtApellidos.getText(),
				Color.getColor(txtColorDePelo.getText()));
		return cliente;
	}

}

