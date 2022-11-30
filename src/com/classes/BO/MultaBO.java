package com.classes.BO;
import com.classes.DTO.Multa;
public class MultaBO {
	
	public boolean verificacao() {
		return true;
	}
	
	public int diasAtrasados() {
		return 5;
	}
	
	public float valorPagar() {
		return (float) (diasAtrasados()*0.5);
	}
}
