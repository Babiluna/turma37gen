package La�os;

import java.util.Scanner;

public class Atividadedowhile {
	  
	public static void main(String[] args) {
            
		Scanner ler = new Scanner(System.in);

        int numero=0;
        double media=0.00,soma=0.00, totalMultiplos=0.00;

        do {
            System.out.printf("Digite um n�mero: ");
            numero = ler.nextInt();
            
            if (numero%3==0) {
                soma+=numero;
                totalMultiplos++;
            }

        
        }while(numero!=0);

        media=soma/totalMultiplos;
        System.out.printf("A soma dos m�ltiplos de 3 � %.2f.",soma);
        System.out.printf("\nVoc� digitou %.2f numeros m�ltiplos de 3.",totalMultiplos);
        System.out.printf("\nA m�dia entre eles � %.2f.",media);
    }
}
