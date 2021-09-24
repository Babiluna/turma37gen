programa
{
	inclua biblioteca Matematica --> math 
	
	funcao inicio()
	{
	

		real num1, num2, num3, num4

		escreva("Primeiro valor : ")
			leia(num1)
		escreva("Segundo valor : ")
			leia(num2)
		escreva(" Terceiro valor : ")
               leia(num3)
          escreva(" Quarto valor : ")
          	leia(num4)


           num1 = math.potencia(num1,2)
           num2 = math.potencia(num2,2)
           num3 = math.potencia(num3,2)
           num4 = math.potencia(num4,2)

           se(math.potencia(num3, 2) >=1000){
               escreva("O quadrado de", num3," é : ", num3)
           }
         
          senao se(math.potencia(3,2)<1000){
          	escreva("\n o valor do primeiro e : ",num1)
          	escreva("\n o valor do segundo e : ", num2)
          	escreva("\n o valor do terceiro e : ", num3)
          	escreva("\n o valor do quarto e : ", num4)
          }
              
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 653; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */