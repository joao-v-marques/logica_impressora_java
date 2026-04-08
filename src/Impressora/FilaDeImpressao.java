package Impressora;

public class FilaDeImpressao {
    Documento primeiro;
    Documento ultimo;

    // Metodos
    public boolean vazia() {
        return primeiro == null;
    }

    public void adicionar(String nome) {
        Documento novo = new Documento(nome);

        if (vazia()) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.proximo = novo;
            ultimo = novo;
        }
    }

    public void imprimir() {
        if (vazia()) {
            System.out.println("Você não possui documentos para imprimir.");
            return;
        }

        if (primeiro == ultimo) {
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.proximo;
        }
    }

    public void cancelar(String nome) {
        if (vazia()) {
            System.out.println("Você não possui nenhum documento para cancelar.");
            return;
        }

        Documento atual = primeiro;
        Documento anterior = null;

        while (atual != null) {
            if(atual.nome.equals(nome)) {
                // Caso seja o primeiro valor
                if (atual == primeiro) {
                    primeiro = atual.proximo;

                    if (primeiro == null) {
                        ultimo = null;
                    }
                } else {
                    // Caso o valor esteja no meio ou no final
                    anterior.proximo = atual.proximo;

                    // Caso seja o último
                    if (atual == ultimo) {
                        ultimo = anterior;
                    }
                }
            }
            anterior = atual;
            atual = atual.proximo;
        }
    }

    public void exibir() {
        Documento atual = primeiro;
        if (vazia()) {
            System.out.println("Sua lista está vazia!");
            return;
        }

        while (atual != null) {
            System.out.println(atual.nome);
            atual = atual.proximo;
        }
    }

    public int tamanho() {
        Documento atual = primeiro;
        int quantidade = 0;

        while(atual != null) {
            quantidade++;
            atual = atual.proximo;
        }

        return quantidade;
    }



    public void prioridade(String nome) {
        if (vazia()) {
            System.out.println("A lista está vazia!");
            return;
        }

        // Remover o documento mencionado
        cancelar(nome);

        // Inserir o documento novamente no começo da fila
        inserirInicio(nome);
    }

    public void inserirInicio(String valor) {
        Documento novo = new Documento(valor);

        if (vazia()) {
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.proximo = primeiro;
            primeiro = novo;
        }
    }
}
