package listaEstruturadeDados;

import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Stack<String> pilha = new Stack<String>(); 
        int opcao;

        do {
            System.out.println("************************************************************");
            System.out.println("Menu");
            System.out.println("1 - Adicionar Livro na Pilha");
            System.out.println("2 - Listar todos os Livros");
            System.out.println("3 - Retirar Livro da Pilha");
            System.out.println("0 - Finalizar Programa");
            System.out.println("************************************************************");
            System.out.print("Entre com a opção desejada: ");

            opcao = leia.nextInt();
            leia.nextLine(); // quebra de linha

            switch (opcao) {
                case 1: // Adicionar livro
                    System.out.print("Digite o nome do Livro: ");
                    String livro = leia.nextLine();
                    pilha.push(livro); // push adiciona no topo
                    System.out.println("Livro adicionado!");
                    break;

                case 2: // Listar livros
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        System.out.println("Livros na pilha:");
                        for (int i = pilha.size() - 1; i >= 0; i--) {
                            System.out.println("- " + pilha.get(i));
                        }
                    }
                    break;

                case 3: // Retirar livro
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        String livroRetirado = pilha.pop(); // pop retira do topo
                        System.out.println("Livro retirado: " + livroRetirado);
                    }
                    break;

                case 0: // Finalizar
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        leia.close();
    }
}