package ExercicioRepeti;

import java.util.*;

public class TerceiroExercicio {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int idade=0, totalPessoas, x = 0, y = 0;
		
		while (idade == -99) {
			System.out.println("\nEntre com sua idade: ");
			idade = ler.nextInt();

			if (idade <= 21) {
				y++;
			} else if (idade>=50) {
				x++;
			}
		}
		System.out.print("\nA quantidade de pessoas com menos de 21 anos sao: " + y);
		totalPessoas = x + y;
		System.out.print("\nA quantidade todade de pessoas maior de 50 anos sao: " + x);

	}
}
