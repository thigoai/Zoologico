package br.ufrn.imd.modelo;

public class Tigre extends Animal{

	private String tipoTigre;
	
	public void comer() {
		quantidadeAlimento = (int) (0.04*peso);
		alimentado = true;
	}

	public String getTipoTigre() {
		return tipoTigre;
	}

	public void setTipoTigre(String tipoTigre) {
		this.tipoTigre = tipoTigre;
	}
	
	public Boolean fezConsulta() {
		if(calcularIdade() >= 3) {
			return true;
		}else
    	return false;
    }
	
}
