package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Adeg,Auser = 0;
		double qtd = 0;
		System.out.print("Qual é a altura de um degrau da escada? Digite aqui: ");
		Adeg = sc.nextDouble();
		System.out.print("Qual é a altura que você deseja subir? Digite aqui: ");
		Auser = sc.nextDouble();
		qtd = Auser/Adeg;
		System.out.println("A quantidade necessária de degraus que você precisa subir");
		System.out.printf("para chegar a altura que você deseja é de: %.0f", qtd);
	}

}
