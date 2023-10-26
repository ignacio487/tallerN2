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
JFrame frame = new JFrame("Agregar Selección");
		JPanel panel = new JPanel();
		textField1 = new JTextField(10);
		textField2 = new JTextField(10);
		textField3 = new JTextField(10);
		agregarSeleccionButton = new JButton("Agregar");
		regresarButton = new JButton("Regresar");
		panel.add(textField1);
		panel.add(textField2);
		panel.add(textField3);
		panel.add(agregarSeleccionButton);
		panel.add(regresarButton);
		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		actionListeners();
	}

	public void actionListeners() {
		regresarButton.addActionListener(e -> {
			VentanaMenu ventanaMenu = new VentanaMenu();
			ventanaMenu.mostrarVentana();
		});
		agregarSeleccionButton.addActionListener(e -> {
			agregarSeleccion();
		});

	}

	public void iniciarComboBox() {
conectar();
		String sql = "SELECT * FROM seleccion";
		try {
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				//comboBox1.addItem(resultSet.getString(2));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al agregar seleccion");
		}
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