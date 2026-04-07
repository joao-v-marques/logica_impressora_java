package Impressora;

public class Main {
    public static void main(String[] args) {
        FilaDeImpressao fila1 = new FilaDeImpressao();

        fila1.adicionar("Doc1");
        fila1.adicionar("Doc2");
        fila1.adicionar("Doc3");
        fila1.adicionar("Doc4");
        fila1.adicionar("Doc5");
        fila1.adicionar("Doc6");

        fila1.imprimir();
        fila1.cancelar("Doc2");
        fila1.prioridade("Doc6");

        fila1.exibir();
        System.out.println("Tamanho da fila: " + fila1.tamanho());
    }
}