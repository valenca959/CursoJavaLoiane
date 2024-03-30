package ExerciciosLista01;

import java.util.Scanner;

//Faça um Programa que peça um número e então mostre a 
//mensagem O número informado foi [número].

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		entrada.close();
		
		System.out.println("O número informado foi "+ num);
	}

}
