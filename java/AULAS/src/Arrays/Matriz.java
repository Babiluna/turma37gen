package Arrays;

import java.util.Scanner;

public class Matriz {

				public static void main (String args []) {
					Scanner ler = new Scanner(System.in);
					
					
			int matriz[][] = new int [3][3];
			int l=0, c=0, soma =0;
			int somaDiagonal=0;
			
			
			
			for(l=0;l<3;l++) {
				for(c=0;c<3;c++) {
					System.out.println("Digite o valor da matriz: ");
					matriz[l][c]=ler.nextInt();
					soma = soma + matriz[l][c];
					if(l==c)
						somaDiagonal= somaDiagonal + matriz[l][c];
				}
				
				
				}
	
	
			System.out.println(" A soma dos números da matriz é: " +soma);
			System.out.println(" A soma dos números da diagonal é: " +somaDiagonal);
	
	
	
	
				}
}
