package ExerciciosLista1;

import java.util.Scanner;

// Faça um Programa que pergunte quanto você ganha por hora e o 
// número de horas trabalhadas no mês. Calcule e mostre o total do seu 
// salário no referido mês, sabendo-se que são descontados 11% para o 
// Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um 
// programa que nos dê:
// . salário bruto.
// a. quanto pagou ao INSS.
// b. quanto pagou ao sindicato.
// c. o salário líquido.
// d. calcule os descontos e o salário líquido, conforme a tabela 
// abaixo:
// + Salário Bruto : R$ - IR (11%) : R$ - INSS 
// (8%) : R$ - Sindicato ( 5%) : R$ = Salário
// Liquido : R$
// Obs.: Salário Bruto - Descontos = Salário Líquido.

public class Exercicio15 {
    public static void main(String[] args) {
        float salarioHora, horasTrabalhadas, salarioBruto, ir, inss, sindicato, salarioLiquido;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do salário por hora: ");
        salarioHora = entrada.nextFloat();
        System.out.println("Digite o número de horas trabalhadas no mês: ");
        horasTrabalhadas = entrada.nextFloat();
        entrada.close();
        salarioBruto = salarioHora * horasTrabalhadas;
        ir = (float) (salarioBruto * 0.11);
        inss = (float) (salarioBruto * 0.08);
        sindicato = (float) (salarioBruto * 0.05);
        salarioLiquido = salarioBruto - ir - inss - sindicato;
        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("IR: " + ir);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.printf("Salário líquido: %.2f%n", salarioLiquido);
    }
}
