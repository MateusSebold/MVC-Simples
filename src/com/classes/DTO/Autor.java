package com.classes.DTO;

public class Autor extends Pessoa {

	public Autor() {
		
	}

	public Autor(int cpf, String nome) {
		super(cpf, nome);
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autor [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
