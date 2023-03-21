
/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7*/


package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio13 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		double altura, pesoIdealH, pesoIdealM;
		
		System.out.print("Informe sua altura: ");
		altura = scanner.nextDouble();
		pesoIdealH = (72.7 * altura) -58;
		pesoIdealM = (62.1* altura) - 44.7;
		
		System.out.println("Com base na sua altura, seu peso ideal eh: "+pesoIdealH + " se você for homem e " +pesoIdealM + " se você for mulher");
	
		
		
	}
	
	

}