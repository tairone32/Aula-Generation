package ExercicioRepeti;

import java.util.*;

public class SegundoExercicio {
	public static void main(String[] args) {

		int x = 0, y = 0;
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("\nEntre com um numero: ");
			vetor[i] = ler.nextInt();

			if (vetor[i] % 2 == 1) {
				x++;
			} else {
				y++;
			}
		}

		System.out.printf("\nA Quantia de numeros impares sao " + x);
		System.out.printf("\nA quantidade de numeros pares sao: " + y);

	}

}
