

import java.util.Scanner;

public class exer4 {
    public void modulo(){
        Scanner input = new Scanner(System.in);

        System.out.println("Descubra o módulo de um número");
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        int numero = 0;

        if (num < 0){
            numero = num*-1;
        }else{
            numero = num;
        }
        System.out.printf("O módulo de %d é %d", num, numero);
    }
}
