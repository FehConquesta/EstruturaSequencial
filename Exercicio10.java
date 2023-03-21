
/*Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
 * F= (C * 1.8) +32
 */

package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;


public class Exercicio10 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		float celsius;
		double far;
		System.out.print("Informe a temperatura em Celcius: ");
		celsius = scanner.nextFloat();
		far = (celsius*1.8)+32;
		
		System.out.println("A temperatura em Fahrenheit eh: " +far);
		
		
	}

}
