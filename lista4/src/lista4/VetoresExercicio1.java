package lista4;

import java.util.Scanner;

public class VetoresExercicio1 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
     // definindo meus vetores
        
        int vetor[] = {3, 5, 1, 2, 4, 9, 6, 8, 10, 7};

        System.out.print("Digite o número que você deseja encontrar: ");
        int numeroProcurado = leia.nextInt();

        boolean encontrado = false;

        // busca com laço de repetição e laço condicional
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroProcurado) {
                System.out.println("O número " + numeroProcurado + " está localizado na posição: " + i);
                encontrado = true;
                break; //parar aqui
            }
        }

        if (!encontrado) {
            System.out.println("O número " + numeroProcurado + " não foi encontrado!");
        }

        leia.close();
        
   

        // Caso não encontre leia:

        if (!encontrado) {
            System.out.println("Não foi encontrado!");
        }

        leia.close();
    }
}
