package controlador;

import vista.BuscarArticuloUI;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import modelo.Articulo;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;

public class ParaBuscarArticulo extends BuscarArticuloUI {
	
	IListaArticulos listaArticulos;
	public ParaBuscarArticulo(IListaArticulos listaArticulos) {
		this.listaArticulos = listaArticulos;
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buscarArticulo();
			}
		});
	}

	public void initCompleter() {
		Window windowAncestor = SwingUtilities.getWindowAncestor(this);
		AutoSuggestor autoSuggestor = new AutoSuggestor(txtBusquedaNombre, windowAncestor , null, Color.WHITE.brighter(), Color.BLUE, Color.RED, 0.75f) {
            @Override
            boolean wordTyped(String typedWord) {

                //create list for dictionary this in your case might be done via calling a method which queries db and returns results as arraylist
                ArrayList<String> words = new ArrayList<>();
                
                listaArticulos.listarArticulo().stream()
                .filter(a -> a.getNombre().toUpperCase().contains(typedWord.toUpperCase()))
                .forEach(a -> words.add(a.getNombre()));
                setDictionary(words);


                return super.wordTyped(typedWord);//now call super to check for any matches against newest dictionary
            }
        };
	}

	private void buscarArticulo(){
		
		if(!txtBusquedaNombre.getText().isEmpty() )
		{
			Articulo articulo = listaArticulos.buscarArticulo(txtBusquedaNombre.getText());
			if(articulo != null){
				txtDescripcion.setText(articulo.getDescripcion());
				txtNombre.setText(articulo.getNombre());
				txtPrecio.setText(String.format("%.2f", articulo.getPrecio()));
				txtPVP.setText(String.format("%.2f", articulo.getPVP()));
			}
			else
			{
				JOptionPane.showMessageDialog(this, "No existe un artículo con ese nombre", 
						"Error", JOptionPane.WARNING_MESSAGE);
				txtPrecio.setText("");
				txtDescripcion.setText("");
				txtNombre.setText("");
				txtPVP.setText("");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Debe introducir datos para poder buscar", 
					"Error", JOptionPane.WARNING_MESSAGE);
		}
		txtBusquedaNombre.setText("");
	}
}
