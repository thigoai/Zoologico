package br.ufrn.imd.modelo;

public class Elefante extends Animal {

	private int tamanhoTromba;
	
	public int getTamanhoTromba() {
		return tamanhoTromba;
	}

	public void setTamanhoTromba(int tamanhoTromba) {
		this.tamanhoTromba = tamanhoTromba;
	}
	
	public void comer() {
		quantidadeAlimento = (int) (0.15*peso);
		alimentado = true;
	}
	
	public Boolean fezConsulta() {
		if(calcularIdade() >= 7) {
			return true;
		}else
    	return false;
    }

}
