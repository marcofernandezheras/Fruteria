package controlador;

import vista.BuscarClienteUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import modelo.Cliente;

@SuppressWarnings("serial")
public class ParaBuscarCliente extends BuscarClienteUI {
	
	private IListaCliente listaCliente;

	public ParaBuscarCliente(IListaCliente listaCliente) {
		super();
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarCliente();
			}
		});
		this.listaCliente = listaCliente;
	}
	
	/**
	 * Evento del boton <code>btnBuscar</code>
	 */
	private void buscarCliente(){
		if(!txtBuscar.getText().isEmpty() && !txtBuscar.getText().isEmpty())//FIXME Arreglar cuando se arregle la UI
		{
			Cliente cliente = listaCliente.buscarCliente(txtBuscar.getText(), txtBuscar.getText());//FIXME Arreglar cuando se arregle la UI
			if(cliente != null){
				txtDNI.setText(cliente.getDni());
				txtNombre.setText(cliente.getNombre());
				txtApellido.setText(cliente.getApellidos());
				txtColorPelo.setText(cliente.getColorPelo().toString());
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
}
