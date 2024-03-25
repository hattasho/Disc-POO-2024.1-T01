package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double psSaco, rG1, rG2, total = 0;
		System.out.print("Qual é o peso do saco de ração? Digite aqui: ");
		psSaco = sc.nextDouble();
		System.out.print("Qual é a quantidade de ração para o primeiro gato? Digite aqui: ");
		rG1 = sc.nextDouble();
		System.out.print("Qual é a quantidade de ração para o segundo gato? Digite aqui: ");
		rG2 = sc.nextDouble();
		rG1 = rG1/1000;
		rG2 = rG2/1000;
		total = psSaco - 5*(rG1+rG2);
		System.out.print("Restará "+total+" unidades de ração após 5 dias.");
	}
}