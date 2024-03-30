package ExerciciosLista02;

// Faça um Programa que leia três números e mostre-os em ordem 
// decrescente.

public class Exercico09 {
    public static void main(String[] args) {
        int num1, num2, num3;
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3 = entrada.nextInt();
        entrada.close();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 > num2) {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }
        }
    }
}