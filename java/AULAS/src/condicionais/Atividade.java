package condicionais;

import java.util.Scanner;

public class Atividade {

	 public static void main (String arg []) {
		 
		 Scanner ler = new Scanner(System.in);
		 int num1;
		 int num2;
		 int num3;
		 
		 
		 System.out.print("Escreva um número: " );
		 num1 = ler.nextInt();
		 System.out.print("Escreva um número :" );
		 num2 = ler.nextInt();
		 System.out.print("Escreva um número : ");
		 num3 = ler.nextInt();
		 
				 
		 if (num1>num2 && num1>num3) {
	     System.out.println("O número maior é : " + num1);	 
		 }	 
		 if (num1>num2 && num2>num3) {
		 System.out.println("O número maior é : " + num2);	 
		 }
		 if (num3>num1 && num3>num2) {
		 System.out.println("O número maior é : " + num3);	 
		 }
		 			 
			 
		 else {
			 
		 }
		 
		 
		 
			 
				 
				 
		 
	 }
}
