package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("AVISO!!! Escala em metros!");
        double x,z = 0;
        System.out.print("Qual o tamanho da escada?");
        z = sc.nextDouble();
        System.out.print("Qual a altura que deseja colocar o quadro?");
        x = sc.nextDouble();

        double y = Math.pow(z, 2) - Math.pow(x, 2);
        y = Math.sqrt(y);

        System.out.printf("A distância que a escada deve ficar é de %.2f m", y);
    }
}