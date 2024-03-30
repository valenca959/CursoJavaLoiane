package ExerciciosLista1;

import java.util.Scanner;

// Faça um Programa que converta metros para centímetros.

public class Exercicio05 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double metros, centimetros;

    System.out.println("Digite o valor em metros: ");
    metros = entrada.nextDouble();
    centimetros = metros * 100;
    entrada.close();

    System.out.println("O valor em centímetros é: " + centimetros);
    }
}
