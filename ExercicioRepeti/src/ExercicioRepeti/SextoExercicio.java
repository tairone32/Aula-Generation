package ExercicioRepeti;
import java.util.*;
public class SextoExercicio {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int filhos,contador;
		float salarioMedio,somaSalario=0,salario,somaFilhos=0,mediaFilhos,salarioMaior=0,xx=0,mediaPessoas;
		
		for(contador=0;contador<5;contador++) {
			
			System.out.printf("\n Habitante, "+(contador+1)+" informe seu salario");
			salario=ler.nextFloat();
			System.out.printf("\n Habitante, "+(contador+1)+" informe quantos filhos tem");
			filhos=ler.nextInt();
			somaSalario=salario+somaSalario;
			somaFilhos=filhos+somaFilhos;
			
			if(salario>salarioMaior) {
				salarioMaior=salario;
			}
			if(salario<=100) {
				xx++;
				
			}
		}
		
			mediaPessoas=(xx*100)/5;
			salarioMedio=somaSalario/contador;
			mediaFilhos=somaFilhos/contador;
			
			System.out.println("\n Media de filhos: "+mediaFilhos);
			System.out.println("\n Media de salario: "+salarioMedio);
			System.out.println("\n Salario maior: "+salarioMaior);
			System.out.println("\n Percentual de Pessoas com menos de 100 "+mediaPessoas+"%");
	}
	
	

}
