package listaEstruturadeDados;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao;
		
		do {
            System.out.println("************************************************************");
            System.out.println("Menu");
            System.out.println("1 - Adicionar Cliente na Fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Retirar Cliente da Fila");
            System.out.println("0 - Finalizar Programa");
            System.out.println("************************************************************");
            System.out.print("Entre com a opção desejada: ");
		
		opcao = leia.nextInt();
        leia.nextLine(); // quebra de linha

        switch (opcao) {
            case 1:
                System.out.print("Digite o nome do Cliente: ");
                String nome = leia.nextLine();
                fila.add(nome);
                System.out.println("Cliente adicionado!");
                break;
                
            case 2:
                if (fila.isEmpty()) {
                    System.out.println("A fila está vazia!");
                } else {
                    System.out.println("Clientes na fila: " + fila);
                }
                break;
                
            case 3:
                String clienteChamado = fila.poll();
                if (clienteChamado == null) {
                    System.out.println("A fila está vazia!");
                } else {
                    System.out.println("Cliente chamado: " + clienteChamado);
                }
                break;

            case 0:
                System.out.println("Programa finalizado.");
                break;

            default:
                System.out.println("Opção inválida!");
        }

    } while (opcao != 0);

    leia.close();
}
}