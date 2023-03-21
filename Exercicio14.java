
/* João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) 
deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) 
e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. 
Imprima os dados do programa com as mensagens adequadas. */

package listaDeExercicios;
import java.util.Scanner;
import java.util.Locale;


public class Exercicio14 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		double pesca;
		double multaValor = 4.00;
		int maximoPesca = 50;
		double excedente;
		double multaTotal;
		
		System.out.print("Informe a quantidade pescada em quilos: ");
		pesca = scanner.nextDouble();
		
		excedente = pesca - maximoPesca;
		
		if(excedente <= 0) {
			System.out.println("Não houve excessos de pesca");
		}else {
			multaTotal = excedente * multaValor;
			System.out.println("Sua pescaria foi excessiva, tera que pagar uma multa de R$"+multaTotal);
		}
		
		
	}

}
