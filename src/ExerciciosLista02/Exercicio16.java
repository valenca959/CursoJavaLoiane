package ExerciciosLista02;

import java.util.Scanner;

// Faça um programa que calcule as raízes de uma equação do segundo 
// grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a, 
// b e c e fazer as consistências, informando ao usuário nas seguintes 
// situações:
// a. Se o usuário informar o valor de A igual a zero, a equação não é 
// do segundo grau e o programa não deve fazer pedir os demais 
// valores, sendo encerrado;
// b. Se o delta calculado for negativo, a equação não possui raizes 
// reais. Informe ao usuário e encerre o programa;
// c. Se o delta calculado for igual a zero a equação possui apenas 
// uma raiz real; informe-a ao usuário;
// d. Se o delta for positivo, a equação possui duas raiz reais; 
// informe-as ao usuário

public class Exercicio16 {
    public static void main(String[] args) {
        float a, b, c;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        a = entrada.nextFloat();
        if (a == 0) {
            System.out.println("A equação não é do segundo grau");
            entrada.close();
            return;
        }
        System.out.println("Digite o valor de b: ");
        b = entrada.nextFloat();
        System.out.println("Digite o valor de c: ");
        c = entrada.nextFloat();
        entrada.close();

        float delta = (float) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais");
        } else if (delta == 0) {
            float raiz = (float) (-b / (2 * a));
            System.out.println("A equação possui uma raiz real: " + raiz);
        } else {
            float raiz1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            float raiz2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
        }
    }
}
