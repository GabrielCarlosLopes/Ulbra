package aula1;

import java.util.Scanner;

public class ProdutoComDesconto {

    public static void main(String[] args) {
        Scanner v1 = new Scanner(System.in);
        Scanner d1 = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valor = v1.nextFloat();

        System.out.println("Digite a porcentagem de desconto: ");
        int desconto = d1.nextInt();

        double ValorD = valor * desconto / 100;
        System.out.println("Valor do desconto: "+ValorD);
        System.out.println("Valor do produto: "+valor);
        System.out.println("Valor do produto com o desconto: "+ (valor-ValorD));
    }




}
