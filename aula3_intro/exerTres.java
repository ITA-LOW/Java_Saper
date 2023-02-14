package aula3_intro;

import java.util.Scanner;


public class exerTres {
    public void menorNum(){
        Scanner input = new Scanner(System.in);

        System.out.println("Regras:");
        System.out.println("1 - numeros naturais apenas");

        System.out.print("Digite o primeiro numero: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = input.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int num3 = input.nextInt();

        int menorNum = 0;

        if(num1 < num2 && num1 < num3){
            menorNum = num1;
        }else if(num2< num1 && num2 < num3){
            menorNum = num2;
        }else{
            menorNum = num3;
        }
           
            
           
        
        System.out.printf("O menor numero é %d", menorNum);


    }
}

