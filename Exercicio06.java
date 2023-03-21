
//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.//

package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio06 {	
		public static void main(String[] args) {
			System.out.println("Vamos calcular a area de um circulo");
			Scanner scanner = new Scanner(System.in);
			scanner.useLocale(Locale.US);
			float n = 3.14159f;
			float raio, area;
			
			System.out.print("Informe o raio: ");
			raio =scanner.nextFloat();
			
			area = n*(raio*raio);
			
			System.out.println("A area do circulo eh: "+ area);
			
			
		}

	}
