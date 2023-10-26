package gui;

import javax.swing.*;
import java.sql.*;

public class VentanaAgregarSeleccion {

	Connection con;
	DefaultListModel mod = new DefaultListModel();
	Statement statement;
	ResultSet resultSet;

	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JButton agregarSeleccionButton;
	private JButton regresarButton;

	public void agregarSeleccionView() {


	}

	public void actionListeners() {

	}

	public void iniciarComboBox() {

	}

	public void agregarSeleccion() {
		conectar();
		String nombre = textField1.getText();
		String confederacion = textField2.getText();
		String ranking = textField3.getText();
		String sql = "INSERT INTO seleccion (nombre, confederacion, ranking) VALUES ('"+nombre+"','"+confederacion+"','"+ranking+"')";
try{
			con.createStatement().execute(sql);
			JOptionPane.showMessageDialog(null, "Seleccion ingresada exitosamente");
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error al ingresar seleccion");
		}
	}

	private Connection conectar() {
		Connection connection = null;
		try {
			String url = "jdbc:mysql://localhost:3306/basededatos";
			String usuario = "root";
			String contraseña = "";
			connection = DriverManager.getConnection(url, usuario, contraseña);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}