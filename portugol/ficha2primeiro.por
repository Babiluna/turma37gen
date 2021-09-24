programa
{
	
	funcao inicio()
	{
		inteiro peso, excesso, multa
		escreva("Qual é o peso do tomate?")
		leia(peso)

		excesso = peso-50

		multa = excesso*4

		se (excesso==0) {
			escreva("Não ha peso a mais")
		}
		senao se (excesso>0) {
			escreva(" Você tem ", excesso , " peso pagará ", multa , " reais ")
	     }

	     senao se (excesso<0) { 
	     	escreva("Peso invalido")
	     }
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */