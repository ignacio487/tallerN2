package gui;

import model.Jugador;
import model.Seleccion;

import javax.swing.*;
import java.util.ArrayList;

public class VentanaMostrarSeleccion {

		private JComboBox comboBox1;

		public void mostrarSeleccionView(ArrayList<Seleccion> selecciones) {
			for (Seleccion seleccion:selecciones){
				comboBox1.addItem(seleccion.getNombre());
			}
		}

		public void iniciarTabla() {

		}
		public void mostrarJugadores(ArrayList<Jugador>jugadores){
			for (Jugador jugador:jugadores){
				comboBox1.addItem(jugador.getNombre());
			}
			;
		}

		public void mostrar() {
			JFrame frame = new JFrame("VentanaMostrarSeleccion");
			frame.setContentPane(new VentanaMostrarSeleccion().comboBox1);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
		}
	}