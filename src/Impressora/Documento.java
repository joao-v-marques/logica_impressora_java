package Impressora;

public class Documento {
    String nome;
    Documento proximo;

    public Documento(String nome) {
        this.nome = nome;
        this.proximo = null;
    }
}
