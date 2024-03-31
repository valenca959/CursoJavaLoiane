package ExerciciosLista02;

import java.util.Scanner;

// Faça um Programa que peça os 3 lados de um triângulo. O programa 
// deverá informar se os valores podem ser um triângulo. Indique, caso 
// os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou 
// escaleno.
// o Dicas:
// o Três lados formam um triângulo quando a soma de quaisquer 
// dois lados for maior que o terceiro;
// o Triângulo Equilátero: três lados iguais;
// o Triângulo Isósceles: quaisquer dois lados iguais;
// o Triângulo Escaleno: três lados diferentes;

public class Exercicio15 {
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o lado 1: ");
        lado1 = entrada.nextInt();
        System.out.println("Digite o lado 2: ");
        lado2 = entrada.nextInt();
        System.out.println("Digite o lado 3: ");
        lado3 = entrada.nextInt();
        entrada.close();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}
