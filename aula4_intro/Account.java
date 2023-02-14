package aula4_intro;

public class Account {
    private String nome;
    private Double saldoBancario;
    public Account(String nome){
        this.nome = nome;
    }
    

    public void setName(String nome){//void -> tipo de retorno do método, não retorna nada
        this.nome = nome;            // na próxima função fica mais claro   
    }

    public String getName() {
        return nome;
    }

    public void setSaldo(double saldo){
        if(saldo >= 0){
        saldoBancario = saldo;
        } else{
            saldoBancario = 0.0;
        }
    }

    public double getSaldo(){
        return saldoBancario;
    }

    public void setDeposito(double deposito){
        if(deposito > 0 ){
            saldoBancario = saldoBancario + deposito;
        } else {
            System.out.println("Valor de depósito inválido");
        }
        
    }
}



    


