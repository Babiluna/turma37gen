programa
{
	
	funcao inicio()
	{
        real pontuacao [5], maior =0

        para(inteiro i=0;i<5;i++){
        	escreva("Escreva uma pontuação : " )
        		leia(pontuacao[i]) 


           se (maior<pontuacao[i])
	   		maior = pontuacao [i]
        }
       
	  
	   	
	  escreva("Sua maior pontuação é : " + maior  )
} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */