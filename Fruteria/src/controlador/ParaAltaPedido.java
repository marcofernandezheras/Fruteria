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

	public ParaAltaPedido(IGestorPedidos gestorPedidos, IListaArticulos listaArticulos, IListaCliente listaClientes) {

		gestorPedidos.altaPedido();
		this.gestorPedidos=gestorPedidos;
		txtNumeroPedido.setText(String.valueOf(gestorPedidos.numeroPedidoActual()));
		

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNombre.setBackground(Color.white);
				if (listaClientes.buscarCliente(txtNombre.getText().toLowerCase(), txtApellidos.getText().toLowerCase()) != null) {
					txtDatoUno.setText(listaClientes.buscarCliente(txtNombre.getText().toLowerCase(), txtApellidos.getText().toLowerCase())
							.getDni());
					txtDatoDos.setText(listaClientes.buscarCliente(txtNombre.getText().toLowerCase(), txtApellidos.getText().toLowerCase())
							.getNombre());
					txtDatoTres.setText(listaClientes.buscarCliente(txtNombre.getText().toLowerCase(), txtApellidos.getText().toLowerCase())
							.getApellidos());
					gestorPedidos.insertarCliente(listaClientes.buscarCliente(txtNombre.getText().toLowerCase(),
							txtApellidos.getText().toLowerCase()));
				} else {
					txtNombre.setBackground(Color.RED);
				}

			}
		});

		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (listaArticulos.buscarArticulo(txtBuscarArticulo.getText().toLowerCase()) != null) {
					txtBuscarArticulo.setBackground(Color.white);
					txtDescripcion.setText(listaArticulos.buscarArticulo(txtBuscarArticulo.getText().toLowerCase()).getDescripcion());
					txtPrecio.setText(String.valueOf(listaArticulos.buscarArticulo(txtBuscarArticulo.getText().toLowerCase())
							.getPrecio()));
					txtPvp.setText(String.valueOf(listaArticulos.buscarArticulo(txtBuscarArticulo.getText().toLowerCase())
							.getPVP()));
				} else {
					txtBuscarArticulo.setBackground(Color.RED);
				}

			}
		});

		btnCantidad.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (listaArticulos.buscarArticulo(txtBuscarArticulo.getText().toLowerCase()) != null
						&& listaClientes.buscarCliente(txtNombre.getText().toLowerCase(), txtApellidos.getText().toLowerCase()) != null 
						&& Integer.valueOf(txtCantidad.getText())!=0) {
					try {
						txtCantidad.setBackground(Color.white);
						Integer.parseInt(txtCantidad.getText());
						gestorPedidos.addLineaPedido(listaArticulos.buscarArticulo(txtBuscarArticulo.getText().toLowerCase()),
								Integer.valueOf(txtCantidad.getText()));
						DefaultTableModel model = (DefaultTableModel) JTabla.getModel();
						model.addRow(new Object[] {

								listaArticulos.buscarArticulo(txtBuscarArticulo.getText().toLowerCase()).getNombre(),
								listaArticulos.buscarArticulo(txtBuscarArticulo.getText().toLowerCase()).getDescripcion(),
								listaArticulos.buscarArticulo(txtBuscarArticulo.getText().toLowerCase()).getPVP(),
								Integer.valueOf(txtCantidad.getText()),
								Integer.valueOf(txtCantidad.getText())
										* listaArticulos.buscarArticulo(txtBuscarArticulo.getText().toLowerCase()).getPVP() });

						txtTotal.setText(String.valueOf(gestorPedidos.totalPedidoActual()));
						txtBuscarArticulo.setText("");
						txtDescripcion.setText("");
						txtCantidad.setText("");
						txtPrecio.setText("");
						txtPvp.setText("");

					} catch (Exception e2) {
						txtCantidad.setBackground(Color.RED);
					}
				}else{
					if(Integer.valueOf(txtCantidad.getText())==0){
						txtCantidad.setBackground(Color.RED);
					}
				}

			}
		});

		btnGuardarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarPedido();
				gestorPedidos.altaPedido();
				txtNumeroPedido.setText(String.valueOf(gestorPedidos.numeroPedidoActual()));
				txtApellidos.setText("");
				txtBuscarArticulo.setText("");
				txtCantidad.setText("");
				txtDatoDos.setText("");
				txtDatoTres.setText("");
				txtDatoUno.setText("");
				txtDescripcion.setText("");
				txtNombre.setText("");
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
