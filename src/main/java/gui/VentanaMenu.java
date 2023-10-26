package gui;

import javax.swing.*;

public class VentanaMenu {

	private JButton buscarSeleccionButton;
	private JButton agregarSeleccionButton;
	private JButton mostrarSeleccionButton;

	public void ActionListeners() {
		throw new UnsupportedOperationException();
	}

	public void MostrarMenu() {
		JFrame frame = new JFrame("VentanaMenu");
		frame.setContentPane(new VentanaMenu().buscarSeleccionButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}