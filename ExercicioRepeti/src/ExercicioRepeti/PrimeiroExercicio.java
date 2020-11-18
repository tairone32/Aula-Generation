package ExercicioRepeti;

import java.util.*;

public class PrimeiroExercicio {
	public static void main(String[] args) {

		int numeros,x=0, valorTotal=0;
		System.out.println("Vamos mostrar todos os numeros de 1000 a 1900 " + "que dividido por 11 é iguaal a 5");

		System.out.println("\nOs numeros sao: ");
		for (numeros = 1000; numeros <= 1900; numeros++) {
		
			valorTotal=numeros%11;
			
			if (valorTotal == 5) {
					x++;
				System.out.printf("\n"+numeros);

			}
		}
	}
}