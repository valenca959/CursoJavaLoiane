package ExerciciosLista02;

import java.util.Scanner;

// Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char sexo;
        System.out.println("Digite o sexo (F/M): ");
        sexo = Character.toUpperCase(entrada.next().charAt(0));
        entrada.close();

        if (sexo == 'F') {
            System.out.println("F - Feminino");
        } else if (sexo == 'M') {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }
    }
}