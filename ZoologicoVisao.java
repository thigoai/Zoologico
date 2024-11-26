package br.ufrn.imd.visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.ufrn.imd.modelo.Elefante;
import br.ufrn.imd.modelo.Girafa;
import br.ufrn.imd.modelo.Tigre;
import br.ufrn.imd.modelo.Zoologico;

public class ZoologicoVisao {

	public static void main(String[] args) {
		
		
        Zoologico zoologico = new Zoologico();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = null;
        
        try {
            dataNascimento = formato.parse("01/01/2015");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Tigre tigre1 = new Tigre();
        tigre1.setNome("Tigre de Bengala");
        tigre1.setPeso(220);
        tigre1.setTipoTigre("Tigre Siberiano");
        tigre1.setDataNascimento(dataNascimento);
        tigre1.comer();
        zoologico.adicionarAnimal(tigre1);

        Elefante elefante1 = new Elefante();
        elefante1.setNome("Elefante Africano");
        elefante1.setPeso(5000);
        elefante1.setTamanhoTromba(150);
        elefante1.setDataNascimento(dataNascimento); 
        elefante1.comer();
        zoologico.adicionarAnimal(elefante1);

        Girafa girafa1 = new Girafa();
        girafa1.setNome("Girafa Masai");
        girafa1.setPeso(800);
        girafa1.setTamanhoLingua(45);
        girafa1.setDataNascimento(dataNascimento); 
        girafa1.comer();
        zoologico.adicionarAnimal(girafa1);

        Tigre tigre2 = new Tigre();
        tigre2.setNome("Tigre Branco");
        tigre2.setPeso(200);
        tigre2.setTipoTigre("Tigre Branco");
        tigre2.setDataNascimento(dataNascimento); 
        tigre2.comer();
        zoologico.adicionarAnimal(tigre2);
            
        
        zoologico.listarAnimais();
        System.out.println(" ");
        zoologico.calcularConsumoTotalAlimento();
        System.out.println(" ");
        zoologico.listarAnimaisConsultados();
        System.out.println(" ");
        zoologico.listarMaisNovosEVelhosPorEspecie();
	}

}
