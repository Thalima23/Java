package lista2; 

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		// Exibindo o Cardápio
		
		    System.out.println("====================================");
	        System.out.println("       Cardápio de Produtos   ");
	        System.out.println("====================================");
			System.out.println("      1-  Cachorro Quente           ");
			System.out.println("      2-  X-Salada                  ");
			System.out.println("      3-  X-Bacon                   ");
			System.out.println("      4-  Bauru                     ");
			System.out.println("      5-  Refrigerante              ");
			System.out.println("      6-  Suco de laranja           ");
			System.out.println("====================================");
			
			// Entrada do código
	        System.out.print("Digite o código do produto: ");
	        int produto = leia.nextInt();
	        
	        // Entrada de quantidade
	        System.out.print("Digite a quantidade: ");
	        int quantidade = leia.nextInt();
	        
	        String nomeProduto = "";
	        double precoUnitario = 0;
	        
	        //Escolha do produto
			
			switch(produto) {
			
			
	            case 1:
	                nomeProduto = "Cachorro Quente";
	                precoUnitario = 10.0;
	                break;
	            case 2:
	                nomeProduto = "X-Salada";
	                precoUnitario = 15.0;
	                break;
	            case 3:
	                nomeProduto = "X-Bacon";
	                precoUnitario = 18.0;
	                break;
	            case 4:
	                nomeProduto = "Bauru";
	                precoUnitario = 12.0;
	                break;
	            case 5:
	                nomeProduto = "Refrigerante";
	                precoUnitario = 8.0;
	                break;
	            case 6:
	                nomeProduto = "Suco de Laranja";
	                precoUnitario = 13.0;
	                break;
	            default:
	                System.out.println("Opção Inválida!");
	                leia.close();
	                return; // Sai do programa
	        }

	        // Calculando o valor total
	        double total = quantidade * precoUnitario;

	        // Saída formatada
	        System.out.println("\nProduto: " + nomeProduto);
	        System.out.printf("Valor total: R$ %.2f%n", total);

	        leia.close();
	    }
	}
