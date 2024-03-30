package ExerciciosLista02;

import java.util.Scanner;

// Faça um Programa que verifique se uma letra digitada é vogal ou 
// consoante.

public class Exercico04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char letra = Character.toLowerCase(entrada.next().charAt(0));
        entrada.close();

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra " + letra + " é uma vogal.");
        } else {
            System.out.println("A letra " + letra + " é uma consoante.");
        }
    }
}