package tests;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Cliente;
import controlador.ListaClientes;
import controlador.ParaModCliente;

public class ParaModificarClienteTest extends JFrame {

	private ParaModCliente paraModCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaModificarClienteTest frame = new ParaModificarClienteTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ParaModificarClienteTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ListaClientes listaClientes=new ListaClientes();
		Cliente cliente=new Cliente("45879066T", "Maria", "cabeza", Color.black);
		Cliente clienteDos=new Cliente("45879066T", "Marcos", "marcos", Color.black);
		listaClientes.altaCliente(cliente);
		listaClientes.altaCliente(clienteDos);
		paraModCliente=new ParaModCliente(listaClientes);
		setContentPane(paraModCliente);
	}

}
