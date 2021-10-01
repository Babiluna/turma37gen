package Lista1;

import java.util.Scanner;

public class Atividade1oitavo {
	
	public static void main (String args []){
		
		Scanner ler = new Scanner(System.in);
		double custoFabrica, custoDistribuidor, custoImposto , custoConsumidor;
		
		System.out.println("Custo de Fábrica : ");
		custoFabrica = ler.nextDouble();
		
		custoDistribuidor = custoFabrica*0.28;
		custoImposto = custoFabrica*0.45;
		
		
		custoConsumidor = custoFabrica + custoDistribuidor + custoImposto;
	
		
		
		System.out.println("O valor é: " + custoConsumidor);
				
				
				
	}

}
