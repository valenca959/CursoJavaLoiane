package ExerciciosLista02;

import java.util.Scanner;

// Faça um Programa que leia três números e mostre o maior deles.

public class Exercico06 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3 = entrada.nextInt();
        entrada.close();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é " + num2);
        } else {
            System.out.println("O maior número é " + num3);
        }
    }
}
