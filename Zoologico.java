package br.ufrn.imd.modelo;

import java.util.ArrayList;

public class Zoologico {
	
	private ArrayList<Animal> animais;
	
	public Zoologico() {
		animais = new ArrayList<Animal> ();
	}
	
	public void adicionarAnimal(Animal a) {
		animais.add(a);
	}
	
	public void listarAnimais() {
		for(Animal a : animais) {
			System.out.println("*****************************");
			System.out.println("Nome: " + a.getNome() + " Alimentação: " + a.getAlimentacao());
			System.out.println("Peso: " + a.getPeso() + " Idade: " + a.calcularIdade() + " Alimentado: " + a.getAlimentado());
		}
	}
	
	public void calcularConsumoTotalAlimento() {
		
		int totalAlimentoHerbivoros = 0;
        int totalAlimentoCarnivoros = 0;
        int totalTodosAlimentos = 0;
        
		for ( Animal a : animais) {
	        
			System.out.println("*****************************");
			System.out.println("Animal " + a.getNome() + " se alimentou de " + a.getQuantidadeAlimento() + " quilos.");
			
			
			if (a instanceof Elefante || a instanceof Girafa) {
                totalAlimentoHerbivoros += a.getQuantidadeAlimento();
                totalTodosAlimentos += totalAlimentoHerbivoros;
            } else if (a instanceof Tigre) {
                totalAlimentoCarnivoros += a.getQuantidadeAlimento();
                totalTodosAlimentos += totalAlimentoCarnivoros;
            }
		}
		
		System.out.println("Consumo total de alimento por herbívoros (elefantes e girafas): " + totalAlimentoHerbivoros + " kg");
        System.out.println("Consumo total de alimento por carnívoros (tigres): " + totalAlimentoCarnivoros + " kg");
        System.out.println("Consumo total de alimento: " + totalTodosAlimentos + " kg");
        
	}
	
	public void listarAnimaisConsultados() {
		System.out.println("**************Consultad Animais***************");
		for(Animal a : animais) {
			if(a.fezConsulta() == true) {
				System.out.println("Animal " + a.getNome() + " Foi consultado!!");
			}
		}
		System.out.println("**********************************************");
	}
	
	public void listarMaisNovosEVelhosPorEspecie() {
		
        Tigre maisNovoTigre = null;
        Tigre maisVelhoTigre = null;

        Elefante maisNovoElefante = null;
        Elefante maisVelhoElefante = null;

        Girafa maisNovaGirafa = null;
        Girafa maisVelhaGirafa = null;

        for (Animal a : animais) {
            if (a instanceof Tigre) {
                Tigre tigre = (Tigre) a;
                if (maisNovoTigre == null || tigre.calcularIdade() < maisNovoTigre.calcularIdade()) {
                    maisNovoTigre = tigre;
                }
                if (maisVelhoTigre == null || tigre.calcularIdade() > maisVelhoTigre.calcularIdade()) {
                    maisVelhoTigre = tigre;
                }
            } else if (a instanceof Elefante) {
                Elefante elefante = (Elefante) a;
                if (maisNovoElefante == null || elefante.calcularIdade() < maisNovoElefante.calcularIdade()) {
                    maisNovoElefante = elefante;
                }
                if (maisVelhoElefante == null || elefante.calcularIdade() > maisVelhoElefante.calcularIdade()) {
                    maisVelhoElefante = elefante;
                }
            } else if (a instanceof Girafa) {
                Girafa girafa = (Girafa) a;
                if (maisNovaGirafa == null || girafa.calcularIdade() < maisNovaGirafa.calcularIdade()) {
                    maisNovaGirafa = girafa;
                }
                if (maisVelhaGirafa == null || girafa.calcularIdade() > maisVelhaGirafa.calcularIdade()) {
                    maisVelhaGirafa = girafa;
                }
            }
        }

        System.out.println("***** Resultados por Espécie *****");
        
        if (maisNovoTigre != null) {
            System.out.println("Tigre mais novo: " + maisNovoTigre.getNome() + " - Idade: " + maisNovoTigre.calcularIdade() + " anos");
            System.out.println("Tigre mais velho: " + maisVelhoTigre.getNome() + " - Idade: " + maisVelhoTigre.calcularIdade() + " anos");
        } else {
            System.out.println("Nenhum tigre cadastrado.");
        }

        if (maisNovoElefante != null) {
            System.out.println("Elefante mais novo: " + maisNovoElefante.getNome() + " - Idade: " + maisNovoElefante.calcularIdade() + " anos");
            System.out.println("Elefante mais velho: " + maisVelhoElefante.getNome() + " - Idade: " + maisVelhoElefante.calcularIdade() + " anos");
        } else {
            System.out.println("Nenhum elefante cadastrado.");
        }

        if (maisNovaGirafa != null) {
            System.out.println("Girafa mais nova: " + maisNovaGirafa.getNome() + " - Idade: " + maisNovaGirafa.calcularIdade() + " anos");
            System.out.println("Girafa mais velha: " + maisVelhaGirafa.getNome() + " - Idade: " + maisVelhaGirafa.calcularIdade() + " anos");
        } else {
            System.out.println("Nenhuma girafa cadastrada.");
        }
        
        System.out.println("***********************************");
    }
}
