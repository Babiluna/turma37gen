programa
{
	
	funcao inicio()
	{
		inteiro numero 
		escreva("Digite o numero positivo")
		leia(numero)

		
		se (numero==0){ 
			escreva(" Você digitou um numero neutro " )

	      }
          senao se(numero<0){
          	escreva(" Você digitou um numero negativo " )
          }
          senao se(numero%2==0){
          	escreva(" Seu numero e par ")
         }
          senao{
          	escreva(" Seu numero e impar" )
          }
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 448; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */