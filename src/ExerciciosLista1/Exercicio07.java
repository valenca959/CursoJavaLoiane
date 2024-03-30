package ExerciciosLista1;

import java.util.Scanner;

// Faça um Programa que calcule a área de um quadrado, em seguida 
// mostre o dobro desta área para o usuário.

public class Exercicio07 {
    public static void main(String[] args) {
        
        double lado, area, dobroArea;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        lado = entrada.nextDouble();
        area = Math.pow(lado, 2);
        dobroArea = area * 2;
        entrada.close();
        
        System.out.printf("A área do quadrado é: %.2f%n", area);
        System.out.printf("O dobro da área do quadrado é: %.2f%n", dobroArea);
    }
}
