package controller;

import model.Seleccion;

import java.util.ArrayList;


public class SeleccionController {
	private ArrayList<Seleccion> listaSelecciones;

	public SeleccionController() {
		this.listaSelecciones = new ArrayList<>();
	}

	public void agregarSelecciones(Seleccion seleccion, ArrayList<Seleccion> listaSelecciones) {
		listaSelecciones.add(seleccion);
	}

	public ArrayList<Seleccion> obtenerSelecciones(ArrayList<Seleccion> listaSelecciones) {
		return listaSelecciones;
	}
	public void agregarJugadorASeleccion(Seleccion seleccion, String nombre, String apellido, String posicion, int edad, int numeroCamiseta) {
		seleccion.agregarJugador(nombre, apellido, posicion, edad, numeroCamiseta);
	}
}