package ExerciciosLista1;

import java.util.Scanner;

// Tendo como dados de entrada a altura e o sexo de uma pessoa, 
// construa um algoritmo que calcule seu peso ideal, utilizando as 
// seguintes fórmulas:
// . Para homens: (72.7*h) - 58
// a. Para mulheres: (62.1*h) - 44.7 (h = altura)
// b. Peça o peso da pessoa e informe se ela está dentro, acima ou 
// abaixo do peso.

public class Exercicio13 {
    public static void main(String[] args) {
        double altura, peso;
        String sexo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a altura da pessoa: ");
        altura = entrada.nextDouble();
        System.out.println("Digite o sexo da pessoa (M/F): ");
        sexo = entrada.next();
        System.out.println("Digite o peso da pessoa: ");
        peso = entrada.nextDouble();
        entrada.close();
        double pesoIdeal;
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        if (peso == pesoIdeal) {
            System.out.println("A pessoa está no peso ideal.");
        } else if (peso < pesoIdeal) {
            System.out.println("A pessoa está abaixo do peso ideal.");
        } else {
            System.out.println("A pessoa está acima do peso ideal.");
        }
    }
}
