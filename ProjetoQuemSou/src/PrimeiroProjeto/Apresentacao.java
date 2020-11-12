package PrimeiroProjeto;

import java.util.*;

public class Apresentacao {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.printf("Voce deve ser maior de idade para verificar curiosidades sobre Caio Tairone");
		
		System.out.printf("\nEntre com o sua idade ");
		idade = ler.nextInt();
		ler.nextLine();
		
		System.out.printf("\nEntre com seu nome ");
		nome = ler.next();
				
				System.out.printf("seu nome: %s",nome);
				System.out.printf("\nsua idade: %d",idade);
		
		
				String minhaVida = "\nOla me chamo Caio tenho 25 anos de idade utimamente nao pretico nem um tipo de atividade fisica"
						+ "\napesar de gostar muito, meus hobbies sao tocar violao e escrever musicas e recentimente descobri"
						+ "\nque amo programar tambem kkkk... pelomenos por enquanto nee  kk... nas horas vagas gosto de jogar "
						+ "\nValorant e nao gosto muito de fica sem fazer nada sempre gosto de estar com a mente ocupada com alguma coisa."
						+ "\nhoje me encontro na terceira semana do Bootcamp da Generation no qual estou aprendendo muito, agora "
						+ "\nja com a mentalidade de crescimento e muuita mentalidade de persistência venho desenvolvendo minhas habilidades"
						+ "\nno decorrer do processo uma delas que acredito ter evoluido muito é a habilidade de comunicação, sei que tenho "
						+ "\n muita coisa para aprender, e vou porem um passo de cada vez";
		
	if(idade>=18){
		
		System.out.printf("\nparabens voce tem acesso a informaçao perfil do Caio Tairone");
		System.out.printf("\n %s",minhaVida);
		}
	
		else if (idade >= 1 && idade <18){
		
		System.out.printf("\nvoce nao tem acesso a essa informação");
		
	}
		else {
			
			System.out.printf("\ncaracter invalido");
		}
	 
	}
}
