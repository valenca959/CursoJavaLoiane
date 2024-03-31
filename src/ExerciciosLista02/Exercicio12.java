package ExerciciosLista02;

import java.util.Scanner;

// Faça um programa para o cálculo de uma folha de pagamento, 
// sabendo que os descontos são do Imposto de Renda, que depende do 
// salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o 
// FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é 
// a empresa que deposita). O Salário Líquido corresponde ao Salário 
// Bruto menos os descontos. O programa deverá pedir ao usuário o 
// valor da sua hora e a quantidade de horas trabalhadas no mês.
// o Desconto do IR:
// o Salário Bruto até 900 (inclusive) - isento
// o Salário Bruto até 1500 (inclusive) - desconto de 5%
// o Salário Bruto até 2500 (inclusive) - desconto de 10%
// o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela 
// as informações, dispostas conforme o exemplo abaixo. No 
// exemplo o valor da hora é 5 e a quantidade de hora é 220.
// Salário Bruto: (5 * 220) : R$ 1100,00 
// (-) IR (5%) : R$ 55,00 
// (-) INSS ( 10%) : R$ 110,00 
// FGTS (11%) : R$ 121,00 
// Total de descontos : R$ 165,00 
// Salário Liquido : R$ 935,00

public class Exercicio12 {
    public static void main(String[] args) {
        float valorHora;
        int horasTrabalhadas;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da hora trabalhada: ");
        valorHora = scanner.nextFloat();
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        horasTrabalhadas = scanner.nextInt();
        scanner.close();

        float salarioBruto = valorHora * horasTrabalhadas;
        float inss = (float) (salarioBruto * 0.1);
        float ir = (float) (salarioBruto * 0.05);
        float fgts = (float) (salarioBruto * 0.11);
        float totalDescontos = ir + inss;
        float salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("(-) IR: R$ " + ir);
        System.out.println("(-) INSS: R$ " + inss);
        System.out.println("FGTS: R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totalDescontos);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }
}
