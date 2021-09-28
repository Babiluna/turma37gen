programa
{
	
	funcao inicio()
	{

	     inteiro habitantes = 3
		inteiro salario
		inteiro filhos
		real mediaSalario=00.00
		real mediaFilhos=00.00
		inteiro maiorSalario=0
		real pessoasate100
		real filhosTotal=00.00
		real salarioTotal=00.00
          real totalpessoas=00.00
	


			para (inteiro x=1; x<=3; x++){
				escreva("Qual é o seu salário? : ")
				leia(salario)
				escreva("Quantos filhos? : ")
				leia(filhos)
				 
				filhosTotal = filhosTotal + filhos
				salarioTotal = salarioTotal + salario 

				  se (salario > maiorSalario){
				  	maiorSalario = salario
				  	
				  }
				  	
				 se (salario<=100){
				 	totalpessoas++
				 }
				 	
			}
			
			    mediaFilhos = filhosTotal/3
			    mediaSalario = salarioTotal/3
			    pessoasate100 = (totalpessoas/3)*100

			    escreva("\nSua média de salário é : ", mediaSalario )
			    escreva("\nSua média de filho é: ", mediaFilhos)
			    escreva("\nMaior salário é: ", maiorSalario)
			    escreva("\nPorcentagem de pessoas com salário até 100: ", pessoasate100 "%")
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1045; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */