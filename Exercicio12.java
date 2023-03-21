
//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio12 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		double altura, pesoIdeal;
		
		System.out.print("Informe sua altura: ");
		altura = scanner.nextDouble();
		pesoIdeal = (72.7 * altura) -58;
		
		System.out.println("Com base na sua altura, seu peso ideal eh: "+pesoIdeal);
	
		
		
	}
	
	

}
