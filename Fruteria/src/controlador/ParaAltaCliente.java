package controlador;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import modelo.Articulo;
import modelo.Cliente;

import com.aeat.valida.Validador;

import vista.AltaArticuloUI;
import vista.AltaClienteUI;

public class ParaAltaCliente extends AltaClienteUI {

	IListaCliente listaClientes;
	Color colorActual = null; 

	public ParaAltaCliente(IListaCliente listaClientes) {
		btnEscogerColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Color c = JColorChooser.showDialog(null, "Choose a Color", colorActual);
			      if (c != null)
			      {
			    	  colorActual = c;
			    	  txtColorDePelo.setText(colorToText(c));
			    	  txtColorDePelo.setForeground(c);
			      }
			}
		});
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
				colorActual = null;
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
					) 
			{
				if(colorActual != null)
				{
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
				}
				else
				{
					JOptionPane.showMessageDialog(this, "Color no valido");
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
		Cliente cliente = new Cliente(txtDNI.getText(), txtNombre.getText().toLowerCase(), txtApellidos.getText().toLowerCase(),
				colorActual);
		return cliente;
	}

	private String colorToText(Color c){
		return String.format("#%02x%02x%02x", c.getRed(), c.getGreen(), c.getBlue());
	}
}

