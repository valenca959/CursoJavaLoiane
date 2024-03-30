package ExerciciosLista01;

import java.util.Scanner;

// Faça um Programa que peça as 4 notas bimestrais e mostre a média

public class Exercicio04 {

        public static void main(String[] args) {
            Scanner entrada= new Scanner(System.in);
            System.out.println("Digite as 4 notas dos bimestres: "); 
            float nota1 = entrada.nextFloat();
            float nota2 = entrada.nextFloat();
            float nota3 = entrada.nextFloat();
            float nota4 = entrada.nextFloat();
            entrada.close();
            float media = (nota1 + nota2 + nota3 + nota4)/4;

            System.out.println("A média é "+ media);
        }
}
