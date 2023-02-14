package aula7_aninhamento_de_condicionais;

import java.util.Scanner;



public class Triangulo {
    public void lados(){
    // recebe 3 valores (a,b,c) e define se eles podem formar 
    //um triângulo

        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor do primeiro segmento: ");
        int a = input.nextInt();

        System.out.print("Digite o valor do segundo segmento: ");
        int b = input.nextInt();

        System.out.print("Digite o valor do terceiro segmento: ");
        int c = input.nextInt();

        if((a + b) < c || ((a + c) < b) || ((b + c) < a)){
            System.out.println("Não pode formar triângulo");
        }else{
            System.out.println("Pode formar triângulo");
        }
        
        if((a == b) && (b == c)){
            System.out.println("Triângulo equilátero");
            if((a*a + b*b == c*c) || (b*b + c*c == a*a) || (a*a + c*c == b*b)){
                System.out.println("Triângulo retângulo");
            }else if(a==b || a==c || b==c){
                System.out.println("Triângulo isóceles");
            }else if((a != b || a != c || b != c)){
                System.out.println("Triângulo escaleno");
        }else{
            System.out.println("Os lados precisam ser reconfigurados");
        }
    }
}
}
