package controlador;

import vista.AltaArticuloUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import modelo.Articulo;

public class ParaAltaArticulo extends AltaArticuloUI {
	
	IListaArticulos listaArticulos;
	public ParaAltaArticulo(IListaArticulos listaArticulos) {
		this.listaArticulos = listaArticulos;
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearArticulo();
			}		
		});
	}
	
	/**
	 * MAnejador del boton crear
	 */
	private void crearArticulo() {
		if(validarDatos())
		{
			if(listaArticulos.insertarArticulo(generarArticulo()))
				JOptionPane.showMessageDialog(this, "Articulo creado con éxito");
			else
				JOptionPane.showMessageDialog(this, "El artículo ya existe");
		}		
		else
			JOptionPane.showMessageDialog(this, "Datos no validos");
	}

	/**
	 * Valida los datos del formulario
	 * @return <code>true</code> si son validos, <code>false</code> en caso contrario.
	 */
	private boolean validarDatos() {
		boolean valid = true;
		valid &= !txtNombre.getText().isEmpty();
		valid &= !txtDescripcion.getText().isEmpty();
		try{
			Float.parseFloat(txtPrecio.getText());
		}
		catch (NumberFormatException e){
			valid = false;
		}
		return valid;
	}

	/**
	 * Crea un nuevo {@link Articulo} a partir de los datos del formulario.
	 * @return Nuevo {@link Articulo}.
	 */
	private Articulo generarArticulo() {
		Articulo art = new Articulo(txtNombre.getText(),
									txtDescripcion.getText(),
									Float.parseFloat(txtPrecio.getText()));
		return art;
	}
	
}
