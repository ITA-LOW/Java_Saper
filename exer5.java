

import java.util.Scanner;

public class exer5 {
    public void parImpar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero para saber se é par ou ímpar");
        int num = input.nextInt();

        if(num%2 == 0){
            System.out.printf("o numero %d é par", num);
    }else{
        System.out.printf("O numero %d é impar", num);
    }
    }
}
