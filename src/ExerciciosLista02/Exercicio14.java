package ExerciciosLista02;

import java.util.Scanner;

// Faça um programa que lê as duas notas parciais obtidas por um aluno 
// numa disciplina ao longo de um semestre, e calcule a sua média. A 
// atribuição de conceitos obedece à tabela abaixo:
// o Média de Aproveitamento Conceito 
// o Entre 9.0 e 10.0 A 
// o Entre 7.5 e 9.0 B 
// o Entre 6.0 e 7.5 C 
// o Entre 4.0 e 6.0 D 
// o Entre 4.0 e zero E

public class Exercicio14 {
    public static void main(String[] args) {
        float nota1, nota2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();
        entrada.close();

        float media = (nota1 + nota2) / 2;
        char conceito;
        if (media >= 9 && media <= 10) {
            conceito = 'A';
        } else if (media >= 7.5 && media < 9) {
            conceito = 'B';
        } else if (media >= 6 && media < 7.5) {
            conceito = 'C';
        } else if (media >= 4 && media < 6) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
    }
}
