package gui;

import model.Jugador;
import model.Seleccion;

import javax.swing.*;
import java.util.ArrayList;

public class VentanaMostrarSeleccion {

		private JComboBox comboBox1;

		public void mostrarSeleccionView(ArrayList<Seleccion> selecciones) {

		}

		public void iniciarTabla() {

		}

		public void MostrarSeleccion() {
			;
		}
		public void mostrarJugadores(ArrayList<Jugador>jugadores){
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