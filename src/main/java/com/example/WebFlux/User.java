package com.example.WebFlux;



public class User {
	
	private String nombre;
	private String apellido;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public User(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public User(String upperCase, String[] split) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
}
