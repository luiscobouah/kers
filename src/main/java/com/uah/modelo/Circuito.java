package com.uah.modelo;

public class Circuito {
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String ciudad;
	private String pais;
	private int numeroVueltas;
	private double longitudVuelta;
	private int numeroCurvasVuelta;

	public Circuito() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getNumeroVueltas() {
		return numeroVueltas;
	}

	public void setNumeroVueltas(int numeroVueltas) {
		this.numeroVueltas = numeroVueltas;
	}

	public double getLongitudVuelta() {
		return longitudVuelta;
	}

	public void setLongitudVuelta(double longitudVuelta) {
		this.longitudVuelta = longitudVuelta;
	}

	public int getNumeroCurvasVuelta() {
		return numeroCurvasVuelta;
	}

	public void setNumeroCurvasVuelta(int numeroCurvasVuelta) {
		this.numeroCurvasVuelta = numeroCurvasVuelta;
	}

	

}
