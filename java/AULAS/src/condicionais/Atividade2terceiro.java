package condicionais;

import java.util.Scanner;

public class Atividade2terceiro {

		 public static void main (String arg []) {
			 
			 Scanner ler = new Scanner(System.in);
			 
			 int idade;
			 
			 
			 
			 System.out.print("Quantos anos voc� tem? : ");
			 idade = ler.nextInt();
			 System.out.printf("Sua idade %d",  idade);
			 
			 
			 if (idade>=10&&idade<=14) {
				 System.out.println("\nVoc� � infantil");	 
			 }
			 else if (idade>=15&&idade<=17) {
				 System.out.println("\nVoc� � juvenil");
			 }
			 else if (idade>=18&&idade<=25) {
				 System.out.println("\nVoc� � adulto");
			 }
			 
			 
			 
			 
			 
		 }

}
