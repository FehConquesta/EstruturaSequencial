/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.*/


package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio15 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		double salarioHora, horasTrabalhadas, salarioBruto, inss, sindicato, impostoRenda , descontos, salarioLiquido;
		System.out.print("Informe o valor que ganha por hora: ");
		salarioHora = scanner.nextDouble();
		System.out.print("Informe a quantidade de horas trabalhadas por mes: ");
		horasTrabalhadas = scanner.nextDouble();
		salarioBruto = salarioHora * horasTrabalhadas;
		impostoRenda = salarioBruto * 0.11;
		inss = salarioBruto * 0.08;
		sindicato = salarioBruto * 0.05;
		descontos = impostoRenda + inss + sindicato;
		salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Seu salario bruto eh R$" + salarioBruto);
		System.out.println("Voce para por mes R$"+inss+" de INSS");
		System.out.println("Foi pago R$" +impostoRenda+ " de imposto de renda e R$"+inss+" de INSS");
		System.out.println("O sindicato te roubou R$"+sindicato);
		System.out.println("O total de descontos foi R$"+descontos);
		System.out.println("Seu salario liquido foi R$"+salarioLiquido);
		
		
		
		
		
				
		
		
			
	}

}
