programa
{
	
	funcao inicio()
	{
	      inteiro codigo, hstrabalhadas, salario, excedente 

	      escreva("Digite codigo : ")
			leia(codigo)
		 escreva(" Digite hstrabalhadas : ")
		 	leia(hstrabalhadas)
		

		  se(hstrabalhadas<0){
		  	escreva(" Codigo invalido" )
		  
		  }
		  senao se(hstrabalhadas<=50){
		  	salario = hstrabalhadas * 10
		  	excedente = 0
		  	escreva( "\n Seu salário é : ", salario, "\n valor horas excedentes : ", excedente )
		  }
		  senao {
		  	excedente = ((hstrabalhadas - 50) * 20)
		  	salario = 500 + excedente
		  	escreva( "\n Salário do funcionário é :", salario, "\n valor horas excedentes : ", excedente )
		  	
		  }
		     
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 684; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */