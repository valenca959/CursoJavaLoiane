package ExerciciosLista02;

// Faça um Programa que peça dois números e imprima o maior deles

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois número: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        entrada.close();
        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior que o número " + num2);
        } else if (num1 < num2) {
            System.out.println("O número " + num2 + " é maior que o número " + num1);
        } else {
            System.out.println("Os números são iguais"); 
        }
    }

}
