package ExerciciosLista02;

import java.util.Scanner;

// As Organizações Tabajara resolveram dar um aumento de salário aos 
// seus colaboradores e lhe contraram para desenvolver o programa que 
// calculará os reajustes.
// o Faça um programa que recebe o salário de um colaborador e o 
// reajuste segundo o seguinte critério, baseado no salário atual:
// o salários até R$ 280,00 (incluindo) : aumento de 20%
// o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
// o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
// o salários de R$ 1500,00 em diante : aumento de 5% Após o 
// aumento ser realizado, informe na tela:
// o o salário antes do reajuste;
// o o percentual de aumento aplicado;
// o o valor do aumento;
// o o novo salário, após o aumento.

public class Exercicio11 {
    public static void main(String[] args) {
        double salario, percentual, aumento, novoSalario;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário do colaborador: ");
        salario = scanner.nextDouble();
        scanner.close();

        if (salario <= 280) {
            percentual = 20;
            aumento = salario * 0.2;
            novoSalario = salario + aumento;
        } else if (salario > 280 && salario <= 700) {
            percentual = 15;
            aumento = salario * 0.15;
            novoSalario = salario + aumento;
        } else if (salario > 700 && salario <= 1500) {
            percentual = 10;
            aumento = salario * 0.1;
            novoSalario = salario + aumento;
        } else {
            percentual = 5;
            aumento = salario * 0.05;
            novoSalario = salario + aumento;
        }

        System.out.println("Salário antes do reajuste: R$ " + salario);
        System.out.println("Percentual de aumento aplicado: " + percentual + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário, após o aumento: R$ " + novoSalario);
    }
}
