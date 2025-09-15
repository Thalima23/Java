package lista2;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro número: ");
        float numero1 = leia.nextFloat();

        System.out.print("Digite o segundo número: ");
        float numero2 = leia.nextFloat();

        // Menu de operações
        System.out.println("===========================");
        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("===========================");

        System.out.print("Digite o código da operação: ");
        int codigo = leia.nextInt();

        float resultado;

        // Estrutura condicional switch
        switch (codigo) {
            case 1:
                resultado = numero1 + numero2; // operador +
                System.out.println("Resultado da Soma: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2; // operador -
                System.out.println("Resultado da Subtração: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2; // operador *
                System.out.println("Resultado da Multiplicação: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2; // operador /
                    System.out.println("Resultado da Divisão: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida!");
                }
                break;
            default:
                System.out.println("Operação Inválida!");
        }

        leia.close();
    }
}
