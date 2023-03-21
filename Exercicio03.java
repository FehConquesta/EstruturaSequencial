
//Faça um Programa que peça dois números e imprima a soma.//

package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;
public class Exercicio03 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		float num1, num2;
		System.out.print("Informe um numero: ");
		num1 =scanner.nextFloat();
		System.out.print("Informe outro numero: ");
		num2 = scanner.nextFloat();
		float soma = num1 + num2;
		
		
		System.out.println("Soma dos numero eh: "+soma);
		
		
	}
}
