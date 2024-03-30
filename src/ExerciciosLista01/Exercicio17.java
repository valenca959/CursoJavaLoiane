package ExerciciosLista01;

import java.util.Scanner;

// Faça um Programa para uma loja de tintas. O programa deverá pedir o 
// tamanho em metros quadrados da área a ser pintada. Considere que a 
// cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a 
// tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em 
// galões de 3,6 litros, que custam R$ 25,00.
// o Informe ao usuário as quantidades de tinta a serem compradas 
// e os respectivos preços em 3 situações:
// o comprar apenas latas de 18 litros;
// o comprar apenas galões de 3,6 litros;
// o misturar latas e galões, de forma que o preço seja o 
// menor. Acrescente 10% de folga e sempre arredonde os 
// valores para cima, isto é, considere latas cheias

public class Exercicio17 {
    public static void main(String[] args) {
        float area, litros, latas, galoes, precoLatas, precoGaloes, precoLatasGaloes;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tamanho da área a ser pintada em metros quadrados: ");
        area = entrada.nextFloat();
        entrada.close();
        litros = area / 6;
        latas = litros / 18;
        galoes = litros / 3.6f;
        precoLatas = (float) Math.ceil(latas) * 80;
        precoGaloes = (float) Math.ceil(galoes) * 25;
        precoLatasGaloes = (float) Math.ceil(latas) * 80 + (float) Math.ceil(galoes) * 25;
        System.out.println("Comprar apenas latas de 18 litros: " + latas + " latas, R$ " + precoLatas);
        System.out.println("Comprar apenas galões de 3,6 litros: " + galoes + " galões, R$ " + precoGaloes);
        System.out.println("Misturar latas e galões: " + latas + " latas e " + galoes + " galões, R$ " + precoLatasGaloes);
    }
}
