package Arrays;

import java.util.Scanner;

	public class Vetor {
	
	 	public static void main (String args[]) {
	 		
	 		Scanner ler = new Scanner(System.in);	
	 		
	 		 		
	 		int num[] = {0,0,0,0,0};
	 		int maior= 0;
	 		int i;
	 		
	 		 		
	 		 	for (i=0;i<5;i++) {
	 		 	System.out.println("Digite uma pontuação:  ");	
	 		 	num[i]= ler.nextInt();
	 		 	if(maior<num[i]) {
	 		 	maior = num [i];
	 		 	}
	 		 	
	 		 	}
	 		 	for (int i1=0;i1<5;i1++) {
	 		 		 System.out.print(num[i1] + "\n");
	 		 	}
	 	        System.out.println("O maior número é: "+ maior);
	 		 	}
	 		 			
	 		 			
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 	}


