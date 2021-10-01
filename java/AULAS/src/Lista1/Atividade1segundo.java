package Lista1;
import java.util.Scanner;

public class Atividade1segundo {
	
	public static void main (String args []) {
		
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias;
		
		
		System.out.println("Escreva quantos dias de idade : ");
		dias = ler.nextInt();
				
		 anos = (dias/365);
		 meses = (dias%365)/30;
		 dias = (dias%365)%30;
		
		System.out.println(" Anos " + anos + " meses " + meses + " dias " + dias );
	}
            
}
