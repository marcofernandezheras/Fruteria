package controlador;

import vista.ModClienteUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ParaModCliente extends ModClienteUI {
	public ParaModCliente() {
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
		// TODO Auto-generated method stub
		
	}
	private void modificarCliente() {
		// TODO Auto-generated method stub
		
	}	
}
