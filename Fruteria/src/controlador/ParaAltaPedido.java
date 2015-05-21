package controlador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import vista.AltaPedidoUI;

public class ParaAltaPedido extends AltaPedidoUI {
	IGestorPedidos gestorPedidos;
	IListaCliente listaClientes;
	IListaArticulos listaArticulos;

	public ParaAltaPedido(IGestorPedidos gestorPedidos, IListaArticulos listaArticulos, IListaCliente listaClientes) {

		gestorPedidos.altaPedido();
		txtNumeroPedido.setText(String.valueOf(gestorPedidos.numeroPedidoActual()));
		

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNombre.setBackground(Color.white);
				if (listaClientes.buscarCliente(txtNombre.getText(), txtApellidos.getText()) != null) {
					txtDatoUno.setText(listaClientes.buscarCliente(txtNombre.getText(), txtApellidos.getText())
							.getDni());
					txtDatoDos.setText(listaClientes.buscarCliente(txtNombre.getText(), txtApellidos.getText())
							.getNombre());
					txtDatoTres.setText(listaClientes.buscarCliente(txtNombre.getText(), txtApellidos.getText())
							.getApellidos());
					gestorPedidos.insertarCliente(listaClientes.buscarCliente(txtNombre.getText(),
							txtApellidos.getText()));
				} else {
					txtNombre.setBackground(Color.RED);
				}

			}
		});

		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (listaArticulos.buscarArticulo(txtBuscarArticulo.getText()) != null) {
					txtNombre.setBackground(Color.white);
					txtDescripcion.setText(listaArticulos.buscarArticulo(txtBuscarArticulo.getText()).getDescripcion());
					txtPrecio.setText(String.valueOf(listaArticulos.buscarArticulo(txtBuscarArticulo.getText())
							.getPrecio()));
					txtPrecio.setText(String.valueOf(listaArticulos.buscarArticulo(txtBuscarArticulo.getText())
							.getPrecio()));
				} else {
					txtNombre.setBackground(Color.RED);
				}

			}
		});

		btnCantidad.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (listaArticulos.buscarArticulo(txtBuscarArticulo.getText()) != null
						&& listaClientes.buscarCliente(txtNombre.getText(), txtApellidos.getText()) != null) {
					try {
						txtCantidad.setBackground(Color.white);
						Integer.parseInt(txtCantidad.getText());
						gestorPedidos.addLineaPedido(listaArticulos.buscarArticulo(txtBuscarArticulo.getText()),
								Integer.valueOf(txtCantidad.getText()));
						DefaultTableModel model = (DefaultTableModel) JTabla.getModel();
						model.addRow(new Object[] {

								listaArticulos.buscarArticulo(txtBuscarArticulo.getText()).getNombre(),
								listaArticulos.buscarArticulo(txtBuscarArticulo.getText()).getDescripcion(),
								listaArticulos.buscarArticulo(txtBuscarArticulo.getText()).getPVP(),
								Integer.valueOf(txtCantidad.getText()),
								Integer.valueOf(txtCantidad.getText())
										* listaArticulos.buscarArticulo(txtBuscarArticulo.getText()).getPVP() });

						txtTotal.setText(String.valueOf(gestorPedidos.totalPedidoActual()));
						txtBuscarArticulo.setText("");
						txtDatoUno.setText("");
						txtDatoDos.setText("");
						txtDatoTres.setText("");

					} catch (Exception e2) {
						txtCantidad.setBackground(Color.RED);
					}
				}

			}
		});

		btnGuardarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarPedido();
				txtApellidos.setText("");
				txtBuscarArticulo.setText("");
				txtCantidad.setText("");
				txtDatoDos.setText("");
				txtDatoTres.setText("");
				txtDatoUno.setText("");
				txtDescripcion.setText("");
				txtNombre.setText("");
				txtNumeroPedido.setText("");
				txtPrecio.setText("");
				txtPvp.setText("");
				txtTotal.setText("");
				DefaultTableModel model = (DefaultTableModel) JTabla.getModel();
				model.setRowCount(0);
			}
		});

	}

	protected void guardarPedido() {
		if (!gestorPedidos.guardarPedido()) {
			JOptionPane.showMessageDialog(this, "El pedidido no se ha guardado con exito");

		}
	}

}
