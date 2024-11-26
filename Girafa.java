package br.ufrn.imd.modelo;

public class Girafa extends Animal {
	
	private int tamanhoLingua;

	public int getTamanhoLingua() {
		return tamanhoLingua;
	}

	public void setTamanhoLingua(int tamanhoLingua) {
		this.tamanhoLingua = tamanhoLingua;
	}
	
	public void comer() {
		quantidadeAlimento = (int) (0.1*peso);
		alimentado = true;
	}
	
	public Boolean fezConsulta() {
		if(calcularIdade() >= 5) {
			return true;
		}else
    	return false;
    }
	

}
