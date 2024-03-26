package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		System.out.print("Escolha um número de 0 a 10. Digite aqui: ");
		n1 = sc.nextInt();
		if(n1<0 || n1>10) {
			System.out.print("O número não está entre 0 e 10. Tente novamente.");
		} else {
			for (int i = 0; i <= 10; i++){
				System.out.println(n1+" x "+i+" = "+(n1*i));
			}
		}
	}

}
