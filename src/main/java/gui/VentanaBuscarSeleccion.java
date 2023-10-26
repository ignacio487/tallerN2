package gui;

import javax.swing.*;
import java.sql.*;

public class VentanaBuscarSeleccion {
	Connection con;
	DefaultListModel mod = new DefaultListModel();
	Statement statement;
	ResultSet resultSet;

	private JButton regresarButton;
	private JButton buscarButton;
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	private JComboBox comboBox3;

	public void buscarSeleccionView() {
		JFrame frame = new JFrame("Buscar Selección");
		JPanel panel = new JPanel();
		comboBox1 = new JComboBox<>();
		regresarButton = new JButton("Regresar");
		panel.add(comboBox1);
		panel.add(regresarButton);
		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		iniciarComboBox();
		actionListeners();

	}

	public void actionListeners() {
		regresarButton.addActionListener(e -> {
			VentanaMenu ventanaMenu = new VentanaMenu();
			ventanaMenu.MostrarMenu();
		});
	}

	public void iniciarComboBox() {
conectar();
		String sql = "SELECT * FROM seleccion";
		try {
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				comboBox1.addItem(resultSet.getString(2));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al buscar seleccion");
		}

	}

	public void mostrar() {
		JFrame frame = new JFrame("VentanaBuscarSeleccion");
		frame.setContentPane(new VentanaBuscarSeleccion().regresarButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

public void buscarSeleccion() {
	conectar();
	String nombre = comboBox1.getSelectedItem().toString();
	int id = Integer.parseInt(comboBox2.getSelectedItem().toString());
	int ranking = Integer.parseInt(comboBox3.getSelectedItem().toString());
	String sql = "SELECT * FROM seleccion WHERE nombre = '"+nombre+"' AND id = '"+id+"' AND ranking = '"+ranking+"'";
	try{
		resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
			mod.addElement(resultSet.getString(2));
		}
		JOptionPane.showMessageDialog(null, "Seleccion encontrada");
	}catch(SQLException e){
		JOptionPane.showMessageDialog(null, "Error al buscar seleccion");
	}
}

	private Connection conectar() {
		Connection connection = null;
		try {
			String url = "jdbc:mysql://localhost:3306/basededatos";
			String usuario = "";
			String contraseña = "root";
			connection = DriverManager.getConnection(url, usuario, contraseña);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	}