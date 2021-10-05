package Laços;

	import java.util.Locale;
	import java.util.Scanner;

	      public class Atividadewhile {

		      public static void main (String args []) {
		    	  
		      Locale.setDefault(Locale.US);
		 	  Scanner ler = new Scanner(System.in);	  
		 	  
		 	  
		 	  int idade =0,idade21 =0, idade50=0;
		 	  
		 	  
		 	  System.out.println("Programa\n Informe idade 99 para parar\n\n");
		 	  while(idade!= -99) {
		 		  System.out.println("Informe idade: ");
		 		  idade = ler.nextInt();
		 		  
		 	   if (idade<21 && idade>0) {
		 		  idade21 ++;
		 	  }
		 	 
		 	  else if (idade>50) {
		 	    	idade50 ++;
		 	    }
		 	  }
		    	 System.out.println("Idade menor que 21 :" + idade21); 
		    	 System.out.println("\nIdade maior que 50 :" + idade50); 
		    	 
		    	 
	 
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  
		     
		    	  
		      
	}


}
