package condicionais;

 import java.util.Scanner;
 import java.util.Locale;

public class Atividade2 {
            
	 public static void main (String args []) {
		 
		 Locale.setDefault(Locale.US);
		 Scanner ler = new Scanner(System.in);
		double num;
		 
		 System.out.print("Digite um n�mero  inteiro positivo :");
		 num = ler.nextInt();
				 
		
		 if (num < 0) {
	    	 System.out.println("Seu n�mero negativo");
	     }
		 
		 else if(num==0) {
	           System.out.println("\n 0 � um n�mero nulo!!!");
	        	   
	           }
		 
		 else if(num%2==0) {
	           System.out.printf("\n O valor � par e sua raiz �: %.2f",Math.sqrt(num));
		 }
		 
		 else{
	     System.out.printf("\n O valor � impar e seu valor ao quadrado �: %.2f",Math.pow(num,2));
	 }
	 
	   
}

}

