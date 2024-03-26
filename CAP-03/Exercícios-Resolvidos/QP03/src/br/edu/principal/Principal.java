package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		System.out.print("Qual é o primeiro número? Digite aqui: ");
		n1 = sc.nextInt();
		System.out.print("Qual é o segundo número? Digite aqui: ");
		n2 = sc.nextInt();
		if (n1 > n2){
			System.out.println(n2);
		} else {
			System.out.println(n1);
		}
	}

}
