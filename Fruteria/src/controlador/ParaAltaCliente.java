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

public class ParaAltaCliente extends AltaClienteUI{

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
		if(validarDatos()){
			if(listaClientes.altaCliente(generarCliente())){
				JOptionPane.showMessageDialog(this, "Cliente creado con éxito");
			}else{
				JOptionPane.showMessageDialog(this, "El cliente ya existe");
			}
		}else{
			JOptionPane.showMessageDialog(this, "Datos no validos");
		}
		
	}
	private boolean validarDatos() {
		
		boolean valid = false;
		Validador validador = new Validador();
        int e = validador.checkNif(txtDNI.getText());
 
        if (e > 0){
        	if(!txtNombre.getText().isEmpty() 
        			&& !txtApellidos.getText().isEmpty() 
        			&& !txtColorDePelo.getText().isEmpty()){
        		valid=true;
        	}
    		
        }
		return valid;
	}	
	
	private Cliente generarCliente() {
		Cliente cliente = new Cliente(txtDNI.getText(), txtNombre.getText(), txtApellidos.getText(), 
										Color.getColor(txtColorDePelo.getText()) );
		return cliente;
	}

}
