package aula3_intro;

import java.util.Scanner;

public class exer6 {
    public void salario(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salario do vendedor: ");
        Double salario = input.nextDouble();

        System.out.print("Digite as vendas do vendedor: ");
        Double vendas = input.nextDouble();

        if(salario < 1500 && vendas > 2000){
            salario *= 1.1;
            System.out.printf("O novo salario é: %.2f", salario);
        }else{
            System.out.println("Não houve aumento de salario");
        }
    }
}
