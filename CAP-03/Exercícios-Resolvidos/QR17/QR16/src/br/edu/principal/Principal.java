package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float horas = 0;
		float valorsalmin = 0;
		float valorhora = 0;
		float salbruto = 0;
		float imp = 0;
		float salliq = 0;
		System.out.print("Quantas horas o trabalhador trabalhou? Digite aqui: ");
		horas = sc.nextFloat();
		System.out.print("Qual o salário mínimo desse trabalhador? Digite aqui: ");
		valorsalmin = sc.nextFloat();
		valorhora = valorsalmin/2;
		salbruto = valorhora*horas;
		imp = salbruto*3/100;
		salliq = salbruto-imp;
		System.out.print("O valor do salário líquido deste trabalhador é de: "+salliq);
	}

}
