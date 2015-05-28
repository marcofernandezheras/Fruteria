package controlador;

import vista.AltaArticuloUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import modelo.Articulo;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;

public class ParaAltaArticulo extends AltaArticuloUI {

	IListaArticulos listaArticulos;

	public ParaAltaArticulo(IListaArticulos listaArticulos) {
		txtPrecio.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(java.awt.event.FocusEvent arg0) {
				actualizarPVP();
			}
		});
		txtPVP.setFocusable(false);
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
		if (validarDatos()) {
			if (listaArticulos.insertarArticulo(generarArticulo())) {
				JOptionPane.showMessageDialog(this, "Artículo creado con éxito");
				txtPrecio.setText("");
				txtDescripcion.setText("");
				txtNombre.setText("");
				txtPVP.setText("");
			} else
				JOptionPane.showMessageDialog(this, "El artículo ya existe", 
						"Error", JOptionPane.WARNING_MESSAGE);
		} else
			JOptionPane.showMessageDialog(this, "Datos no válidos", 
					"Error", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Valida los datos del formulario
	 * 
	 * @return <code>true</code> si son validos, <code>false</code> en caso
	 *         contrario.
	 */
	private boolean validarDatos() {
		boolean valid = true;
		valid &= !txtNombre.getText().isEmpty();
		valid &= !txtDescripcion.getText().isEmpty();
		try {
			Float.parseFloat(txtPrecio.getText());
		} catch (NumberFormatException e) {
			valid = false;
		}
		return valid;
	}

	/**
	 * Crea un nuevo {@link Articulo} a partir de los datos del formulario.
	 * 
	 * @return Nuevo {@link Articulo}.
	 */
	private Articulo generarArticulo() {
		Articulo art = new Articulo(txtNombre.getText(), txtDescripcion.getText(),
				Float.parseFloat(txtPrecio.getText()));
		return art;
	}

	private void actualizarPVP() {
		if (!txtPrecio.getText().isEmpty()) {
			Float pvp;
			try {
				pvp = Float.parseFloat(txtPrecio.getText()) * 1.21f;
				txtPVP.setText(String.format("%.02f", pvp));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Formato de precio no válido", 
						"Error", JOptionPane.WARNING_MESSAGE);
				txtPrecio.setText("");
				txtPVP.setText("");
			}
		}
	}

}
