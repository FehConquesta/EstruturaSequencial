
//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.//

package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;


public class Exercicio07 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		float lado, area;
		
		System.out.print("Informe o tamanho do lado do quadrado: ");
		lado =scanner.nextFloat();
		
		area = lado*lado;
		
		System.out.println("A area deste quadrado eh: "+area);
		
	
	}
	
	
	
}
