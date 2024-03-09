package com.gsd.daw.ent.veterinaria;

public abstract class Animal implements Citable {
	String nombre;
	
	public Animal( String nombre ) {
		this.nombre = nombre;
	}
}
