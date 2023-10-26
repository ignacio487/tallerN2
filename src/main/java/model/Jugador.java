package model;

public class Jugador {
	private String nombre;
	private int numero;
	private String posicion;
	private Seleccion seleccion;

	public Jugador(String nombre, String apellido, String posicion, int edad, int numeroCamiseta) {
		super();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosicion() {
		return this.posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
}