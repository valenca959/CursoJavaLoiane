package ExerciciosLista02;

import java.util.Scanner;

// Faça um Programa que peça um valor e mostre na tela se o valor é 
// positivo ou negativo.

public class Exercicio02 {
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = entrada.nextInt();
        entrada.close();
        if (num > 0) {
            System.out.println("O número " + num + " é positivo");
        } else if (num < 0) {
            System.out.println("O número " + num + " é negativo");
        } else {
            System.out.println("O número é zero");
        }
    }
}