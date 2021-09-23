programa
{
	
	funcao inicio()
	{
		real custodefabrica, custododistribuidor, custoimpostos, custoconsumidor
		escreva ("Custo de fabrica: ")
		leia(custodefabrica)

		custododistribuidor = custodefabrica*0.28
		custoimpostos = custodefabrica*0.45

		custoconsumidor = custodefabrica + custododistribuidor + custoimpostos 

		escreva (" o valor é: "+ custoconsumidor)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */