package controller;

import model.Seleccion;

import java.util.ArrayList;


public class SeleccionController {

	public SeleccionController() {
		this.listaSelecciones = new ArrayList<>();
	}

	public void agregarSelecciones(Seleccion seleccion, ArrayList<Seleccion> listaSelecciones) {
		listaSelecciones.add(seleccion);
	}

	public ArrayList<Seleccion> obtenerSelecciones(ArrayList<Seleccion> listaSelecciones) {
		return listaSelecciones;
	}
}