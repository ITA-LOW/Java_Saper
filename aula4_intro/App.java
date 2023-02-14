package aula4_intro;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        //============
        /*
        Account minhaConta = new Account("italo");
        //System.out.printf("Nome da conta: %s%n", minhaConta.getName());
        //System.out.print("Entre com o nome do cliente: ");
        Scanner input = new Scanner(System.in);
        minhaConta.setName(input.nextLine());
        //System.out.printf("Nome da conta 1: %s%n", minhaConta.getName());
        minhaConta.setSaldo(1200.56);
        //System.out.printf("Saldo da conta 1: %s%n", minhaConta.getName());
        
        
        //============== 
        //Account minhaConta2 = minhaConta;// minhaconta2 ta recebendo minhaconta
        //System.out.printf("Nome da conta: %s%n", minhaConta2.getName());
        //Quando inicia uma variável como objeto essa variável aponta para
        //o mesmo endereço de memória que está o objeto.
        //==============
        
        //==============
        Account minhaConta2 = new Account("py");
        minhaConta2.setName(minhaConta.getName());
        minhaConta2.setSaldo(minhaConta.getSaldo());

        System.out.printf("Nome da conta 2: %s%n", minhaConta2.getName());
        System.out.printf("Saldo da conta 2: %s%n", minhaConta2.getSaldo());
        //==============

        minhaConta.setName("Python");
        minhaConta.setSaldo(minhaConta.getSaldo()*1.2);
        System.out.println("==========================");

        System.out.printf("Nome da conta 1: %s%n", minhaConta.getName());
        System.out.printf("Saldo da conta 1: %s%n", minhaConta.getSaldo());
        System.out.println("==========================");*/
        
        /*
        Account minhaConta = new Account("italo"); //um construtor que já passa um parâmetro
        minhaConta.setSaldo(1200.56);
        System.out.printf("Nome da conta 1: %s%n", minhaConta.getName());
        System.out.printf("Saldo da conta 1: %.2f", minhaConta.getSaldo());
         */

        Account Conta1 = new Account("italo");
        Conta1.setSaldo(-10.0);
        Conta1.getSaldo();
        Conta1.setDeposito(15.75);

        System.out.printf("nome e saldo : %s -> %.2f", Conta1.getName(), Conta1.getSaldo()); 

    }

}
