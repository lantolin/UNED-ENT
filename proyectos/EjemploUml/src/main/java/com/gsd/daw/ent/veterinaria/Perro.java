package com.gsd.daw.ent.veterinaria;

public class Perro extends Mamifero {

	public Perro(String nombre) {
		super(nombre);
	}

	@Override
	public Cita citar() {
		return null;
	}

}
