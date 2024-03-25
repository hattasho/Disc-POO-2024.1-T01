package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sal, cheq1, cheq2;
		double saldo = 0;
		double cpmf1;
		double cpmf2;
		System.out.print("Qual o salário do trabalhador? Digite aqui: ");
		sal = sc.nextFloat();
		System.out.print("Qual é o valor do primeiro cheque? Digite aqui: ");
		cheq1 = sc.nextFloat();
		System.out.print("Qual é o valor do segundo cheque? Digite aqui: ");
		cheq2 = sc.nextFloat();
		cpmf1 = cheq1 * 0.38/100;
		cpmf2 = cheq2 * 0.38/100;
		saldo = sal - cheq1 - cheq2 - cpmf1 - cpmf2;
		System.out.println("O saldo final foi de: "+saldo);
	}
}
