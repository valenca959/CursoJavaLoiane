package ExerciciosLista01;

import java.util.Scanner;

// Faça um Programa que peça a temperatura em graus Farenheit, 
// transforme e mostre a temperatura em graus Celsius.
// o C = (5 * (F-32) / 9).

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double farenheit, celsius;

        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        farenheit = entrada.nextDouble();

        celsius = (5 * (farenheit - 32) / 9);
        entrada.close();

        System.out.printf("A temperatura em graus Celsius é: %.2f%n", celsius);
    }
}