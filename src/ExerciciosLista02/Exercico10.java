package ExerciciosLista02;

import java.util.Scanner;

// Faça um Programa que pergunte em que turno você estuda. Peça 
// para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a 
// mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor 
// Inválido!", conforme o caso.

public class Exercico10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Em que turno você estuda? Digite M para matutino, V para vespertino ou N para noturno: ");
        char turno = Character.toUpperCase(entrada.next().charAt(0));
        entrada.close();

        switch (turno) {
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'V':
                System.out.println("Boa tarde!");
                break;
            case 'N':
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido!");
        }
    }
}