
/*Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
o produto do dobro do primeiro com metade do segundo .
a soma do triplo do primeiro com o terceiro.
o terceiro elevado ao cubo.*/

package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		int num1, num2;
		float num3;
		double result;
			
		System.out.print("Informe o primeiro numero: ");
		num1 = scanner.nextInt();
		System.out.print("Informe o segundo numero: ");
		num2 = scanner.nextInt();
		System.out.print("Informe o terceiro numero: ");
		num3 = scanner.nextFloat();
		
		result = (num1 * num1)+(num2/2);
		System.out.println("Produto do dobro do primeiro com a metade do segundo: "+result);
		result =(num1*3)+ num3;
		System.out.println("Soma do triplo do primeiro com o terceiro: "+result);
		result = Math.pow(num3, 3);
		System.out.println("Terceiro elevado ao cubo: "+result);
		
		

	}

}
