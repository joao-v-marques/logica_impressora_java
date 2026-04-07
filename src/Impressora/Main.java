package Impressora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        
        FilaDeImpressao fila1 = new FilaDeImpressao();

        while (opcao != 7) {
            System.out.println("\n== MENU DA IMPRESSORA ==");
            System.out.println("1. Adicionar documento");
            System.out.println("2. Imprimir documento");
            System.out.println("3. Cancelar documento por nome");
            System.out.println("4. Exibir fila de impressão");
            System.out.println("5. Exibir quantidade de documentos na fila");
            System.out.println("6. Dar prioridade a um documento");
            System.out.println("7. Sair");
            System.out.print("\nDigite uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do documento: ");
                    String nomeDoc = scanner.next();
                    fila1.adicionar(nomeDoc);
                    break;
                
                case 2:
                    fila1.imprimir();
                    break;

                case 3:
                    System.out.print("\nDigite o nome do documento a cancelar: ");
                    String nomeCancelar = scanner.next();
                    fila1.cancelar(nomeCancelar);
                    break;

                case 4:
                    System.out.println("\nFILA DE IMPRESSÃO");
                    fila1.exibir();
                    break;

                case 5:
                    System.out.println("\nTamanho da fila: " + fila1.tamanho());
                    break;

                case 6:
                    System.out.print("\nDigite o nome do documento a priorizar: ");
                    String nomePrioridade = scanner.next();
                    fila1.prioridade(nomePrioridade);
                    break;

                case 7:
                    System.out.println("\nSaindo...");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        }

        scanner.close();

        // fila1.adicionar("Doc1");
        // fila1.adicionar("Doc2");
        // fila1.adicionar("Doc3");
        // fila1.adicionar("Doc4");
        // fila1.adicionar("Doc5");
        // fila1.adicionar("Doc6");

        // fila1.imprimir();
        // fila1.cancelar("Doc2");
        // fila1.prioridade("Doc6");

        // fila1.exibir();
        // System.out.println("Tamanho da fila: " + fila1.tamanho());
    }
}