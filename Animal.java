package br.ufrn.imd.modelo;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.Period;
import java.util.Date;

public class Animal {

	protected String nome;
	protected Date dataNascimento;
	protected int peso;
	protected Boolean alimentado;
	protected Boolean consultado;
	protected String alimentacao;
	protected int quantidadeAlimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public Boolean getAlimentado() {
		return alimentado;
	}
	
	public void setAlimentado(Boolean alimentado) {
		this.alimentado = alimentado;
	}
	
	public Boolean getConsultado() {
		return consultado;
	}
	public void setConsultado(Boolean consultado) {
		this.consultado = consultado;
	}
	
	public String getAlimentacao() {
		return alimentacao;
	}
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	public int getQuantidadeAlimento() {
		return quantidadeAlimento;
	}
	public void setQuantidadeAlimento(int quantidadeAlimento) {
		this.quantidadeAlimento = quantidadeAlimento;
	}
	
	public void comer() {
		quantidadeAlimento = (int) (0.05*peso);
		alimentado = true;
	}
	
    public int calcularIdade() {
        if (dataNascimento == null) {
            return 0;
        }
        
        LocalDate dataNascimentoLocal = dataNascimento.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();
        
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimentoLocal, dataAtual).getYears();
    }
    
    public Boolean fezConsulta() {
    	return false;
    }
}
