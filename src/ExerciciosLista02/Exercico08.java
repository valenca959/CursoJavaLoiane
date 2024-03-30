package ExerciciosLista02;

import java.util.Scanner;

// Faça um programa que pergunte o preço de três produtos e informe 
// qual produto você deve comprar, sabendo que a decisão é sempre 
// pelo mais barato

public class Exercico08 {
    public static void main(String[] args) {
        double preco1, preco2, preco3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o preço do primeiro produto: ");
        preco1 = entrada.nextDouble();
        System.out.println("Digite o preço do segundo produto: ");
        preco2 = entrada.nextDouble();
        System.out.println("Digite o preço do terceiro produto: ");
        preco3 = entrada.nextDouble();
        entrada.close();

        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("Compre o primeiro produto.");
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("Compre o segundo produto.");
        } else {
            System.out.println("Compre o terceiro produto.");
        }
    }
}
