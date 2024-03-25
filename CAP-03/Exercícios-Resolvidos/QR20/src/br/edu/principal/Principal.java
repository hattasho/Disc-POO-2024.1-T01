package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ang,escada,radiano = 0;
		double alt = 0;
		System.out.print("Qual é a medida do ângulo que a escada está formando? Digite aqui: ");
		ang = sc.nextDouble();
		System.out.print("Qual a altura que se encontra o ponto onde a escada toca a parede? Digite aqui: ");
		alt = sc.nextDouble();
		radiano = ang*3.14/180;
		escada = alt/radiano;
		System.out.printf("A medida da escada é de: %.2f", escada);
	}

}
