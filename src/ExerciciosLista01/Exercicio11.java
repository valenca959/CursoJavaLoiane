package ExerciciosLista01;

import java.util.Scanner;

// Faça um Programa que peça 2 números inteiros e um número real. 
// Calcule e mostre:
// a. o produto do dobro do primeiro com metade do segundo .
// b. a soma do triplo do primeiro com o terceiro.
// c. o terceiro elevado ao cubo

public class Exercicio11 {
    public static void main(String[] args) {
        int num1, num2;
        double num3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        num2 = entrada.nextInt();
        System.out.println("Digite o número real: ");
        num3 = entrada.nextDouble();
        entrada.close();

        double a = (num1 * 2) * (num2 / 2);
        double b = (num1 * 3) + num3;
        double c = Math.pow(num3, 3);

        System.out.println("a. o produto do dobro do primeiro com metade do segundo: " + a);
        System.out.println("b. a soma do triplo do primeiro com o terceiro: " + b);
        System.out.println("c. o terceiro elevado ao cubo: " + c);
    }
}
