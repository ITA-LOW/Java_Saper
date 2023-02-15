package aula8_estruturas_repeticao;

import java.util.Scanner;

public class loja {
    public void vendas(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a qtd de vendedores: ");
        int vendedores = input.nextInt();
        double totalVendas = 0;

        double maiorVenda = 0;

        int vendedorqmaisVendeu = 0;


        for (int i = 1; i <= vendedores; i++){
            System.out.printf("Digite a venda do %d° vendedor: ", i );
            double valor = input.nextDouble();
            totalVendas+=valor;
            if (valor > maiorVenda){
                maiorVenda = valor;
                vendedorqmaisVendeu = i;
            }
        }


        System.out.printf("Total vendas: %.2f. Média de %.2f por vendedor%n", totalVendas,totalVendas/vendedores );
        System.out.printf("O valor da maior venda é %.2f%n", maiorVenda);
        System.out.printf("O vendedor que mais vendeu foi %d", vendedorqmaisVendeu);




    }
}
