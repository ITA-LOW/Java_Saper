package com.projeto.atribuicaoreferencia;

public class MeuObj {
     int num;

    public MeuObj(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "MeuObj{" +
                "num=" + num +
                '}';
    }
}
