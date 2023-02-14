package aula3_intro;

import java.util.Scanner;

public class exerDois {
    public void calc(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        Double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        Double num2 = input.nextDouble();

        Double prod = num1*num2;

        if(prod < 25 || prod > 50){
            System.out.printf("O produto é %.2f", prod);
        }else{
            System.out.print("O produto não corresponde a condição");
        }

    
    }

}
