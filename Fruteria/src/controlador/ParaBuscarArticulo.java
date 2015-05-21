package controlador;

import vista.BuscarArticuloUI;
import java.awt.event.ActionListener;

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

				txtMensaje.setText("");
			}
			else
			{
				txtMensaje.setText("No existe un artículo con ese nombre");
				txtPrecio.setText("");
				txtDescripcion.setText("");
				txtNombre.setText("");
				txtPVP.setText("");
			}
		}
		else
		{
			txtMensaje.setText("Debe introducir datos para poder buscar");
		}
		txtBusquedaNombre.setText("");

	}
}
