package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("AVISO!!! Escala em metros!");
        System.out.print("Qual o tamanho da escada?");
        double x = sc.nextDouble();
        System.out.print("Qual a altura que deseja colocar o quadro?");
        double h = sc.nextDouble();

        double y = Math.pow(x, 2) - Math.pow(h, 2);
        y = Math.sqrt(y);

        System.out.printf("A distância que a escada deve ficar é de %.2f m", y);
    }
}