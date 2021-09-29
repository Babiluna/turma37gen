programa
{
	
	funcao inicio()
	{
		inteiro mat [3][3]
		inteiro l=0, c=0, soma =0
		inteiro somaDiagonal=0

		para(l=0;l<3;l++){
			para (c=0;c<3;c++){
		     	escreva("\nDigite um valor : ")
				leia(mat [l][c])
				
					
		     }
		}
		para(l=0;l<3;l++){
			para (c=0;c<3;c++){
				soma = soma + mat [l][c] 
			}
					
			      
	     }		 
	     para(inteiro x=0;x<3;x++){
             somaDiagonal = somaDiagonal + mat [x][x]
	      	
	      }
	      escreva("\nA soma total da matriz foi: " , soma)
	      escreva("\nA soma da dioganal principal é : ", somaDiagonal)
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 222; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 6, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */