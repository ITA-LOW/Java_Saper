package aula7_aninhamento_de_condicionais;

import java.util.Scanner;

public class Casos {
    public void funcao_switch(){
        Scanner input = new Scanner(System.in);
        System.out.println("|Cód  |Pagamento                  |");
        System.out.println("|---------------------------------|");
        System.out.println("|1    |Dinheiro: 10% de desconto  |");
        System.out.println("|---------------------------------|");
        System.out.println("|2    |1x cartão: 5% de desconto  |");
        System.out.println("|---------------------------------|");
        System.out.println("|3    |2x cartão: sem desconto    |");
        System.out.println("|---------------------------------|");
        System.out.println("|4    |3x cartão: 5% de juros     |");
        System.out.println("|---------------------------------|");

        System.out.print("Digite um número: ");
        int num = input.nextInt();
        
        System.out.print("Digite o valor do produto: ");
        Double price = input.nextDouble();

        switch(num){
            case 1:
                System.out.printf("Com 10% de desconto seu produto sairá por %.2f", price*0.9);
                break;
            case 2:
                System.out.printf("Com 5% de desconto seu produto sairá por %.2f", price*0.95);
                break;
            case 3:
                System.out.printf("O produto sairá por %.2f", price);
                break;
            case 4:
                System.out.printf("Com juros de 5% sairá por %.2f",price*1.05);
                break;
            default:
                System.out.println("Número digitado inválido");

        
            }

    }
}
