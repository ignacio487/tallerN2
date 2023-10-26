package model;

import java.util.Vector;
import model.Jugador;

public class Seleccion {
	private String nombre;
	private int id;
	private int rankingFifa;
	private Vector<Jugador> jugadores = new Vector<Jugador>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRankingFifa() {
		return this.rankingFifa;
	}

	public void setRankingFifa(int rankingFifa) {
		this.rankingFifa = rankingFifa;
	}

	public Seleccion(int nombre, int id, int rankingFifa) {
		throw new UnsupportedOperationException();
	}
}