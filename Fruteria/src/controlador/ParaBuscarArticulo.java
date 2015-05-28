package controlador;

import vista.BuscarArticuloUI;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Articulo;

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
