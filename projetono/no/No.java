package projetono.no;

public class No<T> { //T = classe generica
    private T conteudo;
    private No<T> proximoNo;

    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
