package com.gsd.daw.ent.veterinaria;

public class Gato extends Mamifero {

	public Gato(String nombre) {
		super(nombre);
	}

	@Override
	public Cita citar() {
		return null;
	}

}
