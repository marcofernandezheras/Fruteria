package controlador;

import vista.BuscarClienteUI;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.Window;
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

	public void initCompleter() {
		Window windowAncestor = SwingUtilities.getWindowAncestor(this);
		AutoSuggestor autoSuggestor = new AutoSuggestor(txtBuscarNombre, windowAncestor , null, Color.WHITE.brighter(), Color.BLUE, Color.RED, 0.75f) {
            @Override
            boolean wordTyped(String typedWord) {

                //create list for dictionary this in your case might be done via calling a method which queries db and returns results as arraylist
                ArrayList<String> words = new ArrayList<>();
                
                listaCliente.listarClientes().stream()
                .filter(a -> a.getNombre().toUpperCase().contains(typedWord.toUpperCase()))
                .forEach(a -> words.add(a.getNombre()));
                setDictionary(words);


                return super.wordTyped(typedWord);//now call super to check for any matches against newest dictionary
            }
        };
        
        AutoSuggestor autoSuggestor2 = new AutoSuggestor(txtBuscarApellido, windowAncestor , null, Color.WHITE.brighter(), Color.BLUE, Color.RED, 0.75f) {
            @Override
            boolean wordTyped(String typedWord) {

                //create list for dictionary this in your case might be done via calling a method which queries db and returns results as arraylist
                ArrayList<String> words = new ArrayList<>();
                
                listaCliente.listarClientes().stream()
                .filter(a -> a.getApellidos().toUpperCase().contains(typedWord.toUpperCase()))
                .forEach(a -> words.add(a.getApellidos()));
                setDictionary(words);


                return super.wordTyped(typedWord);//now call super to check for any matches against newest dictionary
            }
        };
	}
	/**
	 * Evento del boton <code>btnBuscar</code>
	 */
	private void buscarCliente() {
		if (!txtBuscarNombre.getText().isEmpty() && !txtBuscarApellido.getText().isEmpty()) {
			Cliente cliente = listaCliente.buscarCliente(txtBuscarNombre.getText(), txtBuscarApellido.getText());
			if (cliente != null) {
				txtDNI.setText(cliente.getDni().toUpperCase());
				txtNombre.setText(cliente.getNombre());
				txtApellido.setText(cliente.getApellidos());
				if (cliente.getColorPelo() != null) {
					txtColorPelo.setText(colorToText(cliente.getColorPelo()));
					txtColorPelo.setForeground(cliente.getColorPelo());
				}
				txtBuscarNombre.setText("");
				txtBuscarApellido.setText("");
			} else {
				JOptionPane.showMessageDialog(this, "No existe un cliente con ese nombre y apellidos", 
						"Error", JOptionPane.WARNING_MESSAGE);
			}
			txtBuscarNombre.setText("");
			txtBuscarApellido.setText("");
		} else {
			JOptionPane.showMessageDialog(this, "Debe introducir datos para poder buscar", 
					"Error", JOptionPane.WARNING_MESSAGE);
		}
	}

	private String colorToText(Color c) {
		return String.format("#%02x%02x%02x", c.getRed(), c.getGreen(), c.getBlue());
	}
	
}
