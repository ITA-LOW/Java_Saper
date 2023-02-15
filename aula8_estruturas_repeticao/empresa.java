package aula8_estruturas_repeticao;

import java.util.Scanner;



public class empresa {
    public void funcionarios(){

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o numero de funcionarios: ");
        int quantidade_func = input.nextInt();

        while(quantidade_func <= 0){
            System.out.println("Quantidade inválida, segue o roteiro por favor");
            quantidade_func = input.nextInt();
        }


        int counter = 1;
        double salarios = 0;
        do {
            System.out.printf("Insira o %d° salario: ", counter);
            double salario = input.nextDouble();
            counter++;
            salarios+=salario;
        } while(counter <= quantidade_func);
        System.out.printf("A média é %.2f", salarios/quantidade_func);
    }

}
