package Laços;

import java.util.Scanner;

        public class AtividadeFor {

	
	        public static void main (String args []) {
	        Scanner ler = new Scanner(System.in);	
	
	        int num, tPar = 0, tImpar=0, i;
	        	
	
	         for(i=1;i<=10;i++)
	            { System.out.println("Digite um número: "); 
	             num = ler.nextInt();
	        
	          if(num%2==0) {
		        tPar=tPar+1; } 
	
	          else if(num%2==1)
	          { tImpar=tImpar+1; } 
	} 
	
	
	      System.out.printf("Pares: %d\n",tPar); 
	      System.out.printf("Impares: %d",tImpar); System.out.printf("\n"); 
	} 
	}


