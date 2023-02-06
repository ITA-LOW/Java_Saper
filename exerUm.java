

import java.util.Scanner;

public class exerUm {
    public void notas(){
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite a primeira nota: ");
        Double nota1 = input.nextDouble();

        System.out.printf("Digite a segunda nota: ");
        Double nota2 = input.nextDouble();

        Double media = (nota1+nota2)/2;

        if(media >= 7){
            System.out.printf("Aluno aprovado com média %.2f%n", media);
        }else{
            System.out.printf("Aluno reprovado com média %.2f%n", media);
        }

        System.out.println("Fim do programa");

    }
}
