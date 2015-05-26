package controlador;

import vista.ModClienteUI;

import java.awt.event.ActionListener;

import com.aeat.valida.Validador;

import modelo.Cliente;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JColorChooser;

public class ParaModCliente extends ModClienteUI {
	
	private IListaCliente listaCliente;
	private Object identificador;
	private Cliente cliente;
	private Color colorActual;
	public ParaModCliente(IListaCliente listaCliente) {
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
	      if (c != null)
	      {
	    	  colorActual = c;
	    	  txtColorDePelo.setText(colorToText(c));
	    	  txtColorDePelo.setForeground(c);
	      }		
	}

	private void buscarCliente() {
		txtMensaje.setText("");
		if(!txtBuscarNombre.getText().isEmpty() && !txtBuscarApellido.getText().isEmpty())
		{
			cliente = listaCliente.buscarCliente(txtBuscarNombre.getText(), txtBuscarApellido.getText());
			if(cliente != null){
				identificador = cliente.identificador();
				txtDNI.setText(cliente.getDni());
				txtNombre.setText(cliente.getNombre());
				txtApellidos.setText(cliente.getApellidos());
				if(cliente.getColorPelo() != null){
					txtColorDePelo.setText(colorToText(cliente.getColorPelo()));
					txtColorDePelo.setForeground(cliente.getColorPelo());
				}
			}
			else
			{
				txtMensaje.setText("No existe un cliente con ese nombre y apellidos");
			}
		}
		else
		{
			txtMensaje.setText("Debe introducir datos para poder buscar");
		}
		
	}
	private void modificarCliente() {
		if(cliente != null) /* Si tenemos un cliente */
		{ 
			if(!txtNombre.getText().isEmpty() 
					&& !txtApellidos.getText().isEmpty()
					&& !txtDNI.getText().isEmpty()
					&& !txtColorDePelo.getText().isEmpty() ) /* No hay ningún valor vacio */
			{
				Validador validador = new Validador();
		        int e = validador.checkNif(txtDNI.getText());
		 
		        if (e > 0)
		        {
		        	cliente.setDni(txtDNI.getText());
		        	cliente.setNombre(txtNombre.getText());
		        	cliente.setApellidos(txtApellidos.getText());
		        	cliente.setColorPelo(colorActual);
		        	if(listaCliente.modificarCliente(cliente, identificador))
		        	{
		        		identificador = cliente.identificador();
		        	}
		        	else
		        	{
		        		txtMensaje.setText("Error interno al modificar");
		        	}
		        }
		        else
				{
					txtMensaje.setText("DNI erroneo");
				}
			}
			else
			{
				txtMensaje.setText("Todos los campos son obligatorios");
			}
		}
		else
		{
			txtMensaje.setText("Debe buscar un cliente a modificar");
		}
	}	
	
	private String colorToText(Color c){
		return String.format("#%02x%02x%02x", c.getRed(), c.getGreen(), c.getBlue());
	}
}

