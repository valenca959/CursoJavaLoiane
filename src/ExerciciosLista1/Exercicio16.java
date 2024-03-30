package ExerciciosLista1;

import java.util.Scanner;

// Faça um programa para uma loja de tintas. O programa deverá pedir o 
// tamanho em metros quadrados da área a ser pintada. Considere que a 
// cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a 
// tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao 
// usuário a quantidades de latas de tinta a serem compradas e o preço 
// total.

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double area, litros, latas, preco;
        final float LITROS_POR_METRO = 3;
        final float LITROS_POR_LATA = 18;
        final float PRECO_POR_LATA = 80;

        System.out.println("Digite o tamanho da área a ser pintada em metros quadrados: ");
        area = entrada.nextFloat();
        entrada.close();

        litros = area / LITROS_POR_METRO;
        latas = Math.ceil(litros / LITROS_POR_LATA);
        preco = latas * PRECO_POR_LATA;

        System.out.printf("Você precisará de %.0f latas de tinta, totalizando R$ %.2f%n", latas, preco);
    }
}
