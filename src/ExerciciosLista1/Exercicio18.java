package ExerciciosLista1;

import java.util.Scanner;

// Faça um programa que peça o tamanho de um arquivo para download 
// (em MB) e a velocidade de um link de Internet (em Mbps), calcule e 
// informe o tempo aproximado de download do arquivo usando este link 
// (em minutos).

public class Exercicio18 {
    public static void main(String[] args) {
        float tamanhoArquivo, velocidadeLink, tempoDownload;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tamanho do arquivo em MB: ");
        tamanhoArquivo = entrada.nextFloat();
        System.out.println("Digite a velocidade do link de Internet em Mbps: ");
        velocidadeLink = entrada.nextFloat();
        entrada.close();
        tempoDownload = tamanhoArquivo / velocidadeLink;
        System.out.printf("O tempo aproximado de download do arquivo é de %.2f minutos.\n", tempoDownload);
    }
}
