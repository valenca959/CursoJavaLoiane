package ExerciciosLista1;

import java.util.Scanner;

// Faça um Programa que peça a temperatura em graus Celsius, 
// transforme e mostre em graus Farenheit.

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double celsius, farenheit;
        System.out.println("Digite a temperatura em graus Celsius: ");
        celsius = entrada.nextDouble();
        farenheit = (celsius * 9 / 5) + 32;
        entrada.close();
        System.out.printf("A temperatura em graus Farenheit é: %.2f%n", farenheit);
    }
}
