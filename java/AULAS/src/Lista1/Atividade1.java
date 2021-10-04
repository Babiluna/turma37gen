package Lista1;
import java.util.Scanner;

public class Atividade1 {

	public static void main (String args []) {
		
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, totalDias;
				
				
				System.out.println("Escreva Anos: " );
				anos = ler.nextInt();
				System.out.println("Escreva Meses : ");
				meses = ler.nextInt();
				System.out.println("Escreva Dias : ");
				dias = ler.nextInt();
				
				totalDias = (anos*365) + (meses*12) + (dias);
				
				System.out.println("Total de dias é: "+ totalDias);
				
		
               
	}
}
