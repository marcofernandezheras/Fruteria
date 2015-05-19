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
				txtPrecio.setText(String.format("%.2d", articulo.getPrecio()));
				txtPVP.setText(String.format("%.2d", articulo.getPVP()));
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
