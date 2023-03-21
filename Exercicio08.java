
//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.//

package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;


public class Exercicio08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		int horasTrabalhadas;
		float valorHora,salarioMes;
		
		System.out.print("Informe quanto voce ganha por hora: ");
		valorHora =scanner.nextFloat();
		System.out.print("Informe quantas horas você trabalha por mes: ");
		horasTrabalhadas = scanner.nextInt();
		
		salarioMes =horasTrabalhadas * valorHora;
		
		System.out.println("Seu salario mensal eh: "+salarioMes);
		
		
		
		
		
	}

}
