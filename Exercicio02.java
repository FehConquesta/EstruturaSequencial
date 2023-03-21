//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].//


package listaDeExercicios;
import java.util.Scanner;
public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		System.out.print("Digite um numero: ");
		numero = scanner.nextInt();
		System.out.println("O numero informado eh: "+numero);
	
	}

}
