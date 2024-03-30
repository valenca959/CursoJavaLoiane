package ExerciciosLista1;

import java.util.Scanner;

// Faça um Programa que peça o raio de um círculo, calcule e mostre 
// sua área.

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    double raio, area;
    System.out.println("Digite o raio do círculo: ");
    raio = entrada.nextDouble();
    area = Math.PI * Math.pow(raio, 2);
    entrada.close();
    System.out.printf("A área do círculo é: %.2f%n", area);
    }

}
