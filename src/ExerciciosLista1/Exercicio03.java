package ExerciciosLista1;

import java.util.Scanner;

// Faça um Programa que peça dois números e imprima a soma.

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o 1º número e depois o 2º número: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        entrada.close();

        System.out.println(num1+" + "+ num2 + " = "+ (num1+num2));

    }

}
