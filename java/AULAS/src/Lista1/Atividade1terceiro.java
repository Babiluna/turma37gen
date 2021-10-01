package Lista1;
import java.util.Scanner;

public class Atividade1terceiro {
	
	public static void main (String arg []) {
		
		Scanner ler = new Scanner(System.in);
		int horas, minutos, segundos; 
		
		System.out.println("Quantos segundos durou? : ");
		segundos = ler.nextInt();
		
		horas = (segundos/3600);
		minutos = (segundos%3600)/60;
	    segundos = (segundos%3600)%60;
	    
	    System.out.println("Quantos segundos durou : " + horas + " horas " + minutos + " minutos " + segundos + " segundos " );
	    
	}

}
