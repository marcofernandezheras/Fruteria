package controlador;

import vista.BuscarPedidoUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.Articulo;
import modelo.Cliente;
import modelo.LineaPedido;
import modelo.Pedido;

public class ParaBuscarPedido extends BuscarPedidoUI {
	IGestorPedidos gestorPedidos;

	public ParaBuscarPedido(IGestorPedidos gestorPedidos) {
		super();
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarPedido();
			}
		});
		this.gestorPedidos = gestorPedidos;
	}

	protected void buscarPedido() {		
		limpiarCampos();
		if(!txtBuscar.getText().isEmpty())
		{
			int numero = 0;
			try {
				numero = Integer.parseInt(txtBuscar.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Debe introducir un número de pedido a buscar", 
						"Error", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			Pedido pedido = gestorPedidos.buscarPedido(numero);
			if(pedido != null)
			{
				/* Datos del cliente */
				Cliente cliente = pedido.getCliente();
				txtDni.setText(cliente.getDni());
				txtNombre.setText(cliente.getNombre());
				txtApellidos.setText(cliente.getApellidos());
				
				/* Lineas de pedido */
				DefaultTableModel model = (DefaultTableModel) tablaLineas.getModel();
				ArrayList<LineaPedido> lineasPedido = pedido.getLineasPedido();				
				for (LineaPedido lineaPedido : lineasPedido) {
					Articulo articulo = lineaPedido.getArticulo();
					model.addRow(new Object[]{
							articulo.getNombre(),
							articulo.getDescripcion(),
							String.format("%.02f",articulo.getPVP()),
							lineaPedido.getCantidad(),
							String.format("%.02f",lineaPedido.getTotalLinea())
					});
				}
				
				/* Total de pedido : 2 decimales*/
				txtTotal.setText(String.format("%.02f", pedido.getTotalPedido()));
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Pedido no encontrado");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Debe introducir un número de pedido a buscar");
		}
		
		txtBuscar.setText("");
	}

	private void limpiarCampos() {
		txtDni.setText("");
		txtNombre.setText("");
		txtApellidos.setText("");	
		DefaultTableModel model = (DefaultTableModel) tablaLineas.getModel();
		model.setRowCount(0);
		txtTotal.setText("");
	}	
	
}
