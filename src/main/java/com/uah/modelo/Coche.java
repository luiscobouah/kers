package com.uah.modelo;

public class Coche  {

	private static final long serialVersionUID = 1L;
	private String nombreCoche;
	private double gananciaCurva;

	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombreCoche() {
		return nombreCoche;
	}

	public void setNombreCoche(String nombreCoche) {
		this.nombreCoche = nombreCoche;
	}

	public double getGananciaCurva() {
		return gananciaCurva;
	}

	public void setGananciaCurva(double gananciaCurva) {
		this.gananciaCurva = gananciaCurva;
	}

}
