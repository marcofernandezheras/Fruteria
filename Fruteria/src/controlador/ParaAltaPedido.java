package controlador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import vista.AltaPedidoUI;

public class ParaAltaPedido extends AltaPedidoUI {
	IGestorPedidos gestorPedidos;
	IListaCliente listaClientes;
	public ParaAltaPedido(IGestorPedidos gestorPedidos, IListaArticulos listaArticulos, IListaCliente listaClientes) {

		this.gestorPedidos=gestorPedidos;
		this.listaClientes=listaClientes;
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
					txtDatoUno.setText("");
					txtDatoDos.setText("");
					txtDatoTres.setText("");
					altaNuevoCliente();
				}

			}

		});

		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (listaArticulos.buscarArticulo(txtBuscarArticulo.getText()) != null) {
					txtBuscarArticulo.setBackground(Color.white);
					txtDescripcion.setText(listaArticulos.buscarArticulo(txtBuscarArticulo.getText()).getDescripcion());
					txtPrecio.setText(String.format("%.02f",listaArticulos.buscarArticulo(txtBuscarArticulo.getText())
							.getPrecio()));
					txtPvp.setText(String.format("%.02f", listaArticulos.buscarArticulo(txtBuscarArticulo.getText())
							.getPVP()));
				} else {
					txtBuscarArticulo.setBackground(Color.RED);
				}

			}
		});

		btnCantidad.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if (listaArticulos.buscarArticulo(txtBuscarArticulo.getText()) != null
						&& listaClientes.buscarCliente(txtNombre.getText(), txtApellidos.getText()) != null 
						&& comprobarCantidad()) {
					try {
						txtCantidad.setBackground(Color.white);
						Integer.parseInt(txtCantidad.getText());
						gestorPedidos.addLineaPedido(listaArticulos.buscarArticulo(txtBuscarArticulo.getText()),
								Integer.valueOf(txtCantidad.getText()));
						DefaultTableModel model = (DefaultTableModel) JTabla.getModel();
						model.addRow(new Object[] {

								listaArticulos.buscarArticulo(txtBuscarArticulo.getText()).getNombre(),
								listaArticulos.buscarArticulo(txtBuscarArticulo.getText()).getDescripcion(),
								String.format("%.02f",listaArticulos.buscarArticulo(txtBuscarArticulo.getText()).getPVP()),
								Integer.valueOf(txtCantidad.getText()),
								String.format("%.02f",Integer.valueOf(txtCantidad.getText())
										* listaArticulos.buscarArticulo(txtBuscarArticulo.getText()).getPVP()) });

						txtTotal.setText(String.format("%.02f", gestorPedidos.totalPedidoActual()));
						txtBuscarArticulo.setText("");
						txtDescripcion.setText("");
						txtCantidad.setText("");
						txtPrecio.setText("");
						txtPvp.setText("");

					} catch (Exception e2) {
						txtCantidad.setBackground(Color.RED);
					}
				}else{
					if(!comprobarCantidad()){
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
	private boolean comprobarCantidad() {
		boolean cantidadCorrecta=false;
		if (txtCantidad.getText()!=""){
			
			try {
				Integer.parseInt(txtCantidad.getText());
				if(Integer.valueOf(txtCantidad.getText())!=0){
					cantidadCorrecta=true;
				}
			} catch (Exception e) {
		
			}
		}
		return cantidadCorrecta;
	}

	protected void guardarPedido() {
		if (!gestorPedidos.guardarPedido()) {
			JOptionPane.showMessageDialog(this, "El pedido no se ha guardado con exito", 
					"Error", JOptionPane.WARNING_MESSAGE);
		}
	}

	private void altaNuevoCliente() {
		int si_no = JOptionPane.showConfirmDialog(this, "El cliente no existe, ¿Desea crearlo ahora?","¿Crear cliente?",JOptionPane.YES_OPTION);
		if(si_no == JOptionPane.YES_OPTION)
		{
			JDialog d = new JDialog();
			d.setContentPane(new ParaAltaCliente(listaClientes));
			d.setModal(true);
			d.setSize(600, 400);
			d.setResizable(false);
			d.setVisible(true);
		}
		else
		{
			txtNombre.setBackground(Color.RED);			
		}		
		
	}
}
