package Entities;

import Entities.Funcionario;
import Entities.TerceiroFuncionario;

public class TestFuncionario {


	    public static void main(String[] args) {
	    Funcionario funcionario1= new Funcionario("funcionario1","108",8,25);
	    
	  
	    System.out.print(funcionario1.getNome());
	    System.out.print(funcionario1.getMatricula());
	    System.out.print(funcionario1.getHorasTrabalhadas());
	    System.out.print(funcionario1.getValorHoras());
	   
	    TerceiroFuncionario terceiro1= new TerceiroFuncionario("terceiro1","205",8,25,10);
	    System.out.print(terceiro1.getNome());
	    System.out.print(terceiro1.getMatricula());
	    System.out.print(terceiro1.getHorasTrabalhadas());
	    System.out.print(terceiro1.getValorHora());
	    System.out.print(terceiro1.getAdicional());
	
}
}