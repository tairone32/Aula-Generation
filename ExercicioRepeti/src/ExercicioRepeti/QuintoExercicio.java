package ExercicioRepeti;

import java.util.*;

public class QuintoExercicio {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero,soma=0,contador=0;
		float media=0;
	do {
		System.out.println("\nEntre com o numero: ");
		numero = ler.nextInt();
		
		if(numero<01) {	
			System.out.println("escreva um numero maior que 0");
	}
		else if (numero%3==0 && numero!=0)
			soma+=numero;
			contador++;	
	}while(numero!=0);
		
	
		media=(float) soma/contador;
			
			System.out.println("\nA media dos numeros multiplos de 3 é: "+media);
	}
	
}

