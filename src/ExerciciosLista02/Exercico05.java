package ExerciciosLista02;

import java.util.Scanner;

// Faça um programa para a leitura de duas notas parciais de um aluno. 
// O programa deve calcular a média alcançada por aluno e apresentar:
// o A mensagem "Aprovado", se a média alcançada for maior ou 
// igual a sete;
// o A mensagem "Reprovado", se a média for menor do que sete;
// o A mensagem "Aprovado com Distinção", se a média for igual a 
// dez

public class Exercico05 {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        entrada.close();
        media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}