package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu {

	private JButton buscarSeleccionButton;
	private JButton agregarSeleccionButton;
	private JButton mostrarSeleccionButton;

	public void ActionListeners() {
		buscarSeleccionButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		agregarSeleccionButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		mostrarSeleccionButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
	public void mostrarVentana() {
		JFrame frame = new JFrame("VentanaMenu");
		frame.setContentPane(new VentanaMenu().buscarSeleccionButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}