
/*Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9) */


package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;


public class Exercicio09 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		float far, celsius;
		System.out.print("Informe a temperatura em Fahrenheit: ");
		far =scanner.nextFloat();
		celsius = 5*((far-32)/9);
		
		System.out.println("A temperatura em Celsius eh: "+celsius);
		
		
	}
}
