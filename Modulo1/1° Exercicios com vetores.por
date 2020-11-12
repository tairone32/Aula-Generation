programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{

		/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
               atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */
		
		inteiro notas[5]
			

		para (inteiro x=0;x<5;x++) {

			escreva("entre com a nota ")
			leia (notas[x])
		}
		limpa()
		escreva("\n As notas digitadas foram :")

		para(inteiro N =0;N<5;N++) {
			escreva("\n [",notas[N],"]")
		}
		inteiro maiorValor=0
		para (inteiro P =0; P<5;P++){

				
			se (notas[P]>=maiorValor]){
				maiorValor=notas[P]
			}			
		}
		escreva("\na maior nota foi ",maiorValor)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 596; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */