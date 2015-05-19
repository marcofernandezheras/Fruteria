package controlador;

import vista.ModClienteUI;
import java.awt.event.ActionListener;

import modelo.Cliente;

import java.awt.event.ActionEvent;

public class ParaModCliente extends ModClienteUI {
	
	private IListaCliente listaCliente;
	public ParaModCliente(IListaCliente listaCliente) {
		this.listaCliente = listaCliente;
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarCliente();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				modificarCliente();
			}
			
		});
	}

	private void buscarCliente() {
		if(!txtBuscarNombre.getText().isEmpty() && !txtBuscarApellido.getText().isEmpty())
		{
			Cliente cliente = listaCliente.buscarCliente(txtBuscarNombre.getText(), txtBuscarApellido.getText());
			if(cliente != null){
				txtDNI.setText(cliente.getDni());
				txtNombre.setText(cliente.getNombre());
				txtApellidos.setText(cliente.getApellidos());
				txtColorDePelo.setText(cliente.getColorPelo().toString());
			}
			else
			{
				txtMensaje.setText("No existe un cliente con ese nmbre y apellidos");
			}
		}
		else
		{
			txtMensaje.setText("Debe introducir datos para poder buscar");
		}
		
	}
	private void modificarCliente() {
		// TODO Auto-generated method stub
		
	}	
}
