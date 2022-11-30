package com.classes.DTO;

public class Cliente extends Pessoa {

	public Cliente() {
		
	}

	public Cliente(int cpf, String nome) {
		super(cpf, nome);
	}

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
