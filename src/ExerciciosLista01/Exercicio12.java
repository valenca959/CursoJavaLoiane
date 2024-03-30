package ExerciciosLista01;

import java.util.Scanner;

// Tendo como dados de entrada a altura de uma pessoa, construa um 
// algoritmo que calcule seu peso ideal, usando a seguinte fórmula: 
// (72.7*altura) - 58

public class Exercicio12 {
    public static void main(String[] args) {
        double altura;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a altura da pessoa: ");
        altura = entrada.nextDouble();
        entrada.close();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.printf("Peso ideal: %.2f%n", pesoIdeal);
    }
}
