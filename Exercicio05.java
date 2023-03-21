
//Faça um Programa que converta metros para centímetros.//


package listaDeExercicios;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int metros, cm;
		System.out.print("Informe a quantidade de metros: ");
		metros = scanner.nextInt();
		
		cm = metros *100;
		System.out.println(metros +" metros eh igual a "+cm+ " centimetros");
		
	}

}
