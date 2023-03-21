
//Faça um Programa que peça as 4 notas bimestrais e mostre a média.//

package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;


public class Exercicio04 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		float nota1, nota2, nota3, nota4;
		System.out.print("Informe sua primeira nota: ");
		nota1 = scanner.nextFloat();
		System.out.print("Informe sua segunda nota: ");
		nota2 = scanner.nextFloat();
		System.out.print("Informe sua terceira nota: ");
		nota3 = scanner.nextFloat();
		System.out.print("Informe sua quarta nota: ");
		nota4 = scanner.nextFloat();
		
		float media = (nota1+ nota2 + nota3+ nota4)/4;
		
		System.out.println("Sua media eh: "+media);
		
	}

}
