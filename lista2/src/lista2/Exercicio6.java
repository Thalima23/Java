package lista2;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
      //Entrada de Dados:
		
      		System.out.println ("Digite o seu nome completo: ");
      			String nome= leia.nextLine();
      			
      	    System.out.print("Digite o codigo do Cargo do Colaborador: ");
			    int codigo= leia.nextInt();
			    
			System.out.print("Digite o salário do colaborador: ");
		        float salario = leia.nextFloat();
		        
		        // Variáveis auxiliares
		        String cargo = "";
		        float percentual = 0;
		        
		        // Estrutura Switch
		        switch(codigo) {
		            case 1:
		                cargo = "Gerente";
		                percentual = 0.10f;
		                break;
		            case 2:
		                cargo = "Vendedor";
		                percentual = 0.07f;
		                break;
		            case 3:
		                cargo = "Supervisor";
		                percentual = 0.09f;
		                break;
		            case 4:
		                cargo = "Motorista";
		                percentual = 0.06f;
		                break;
		            case 5:
		                cargo = "Estoquista";
		                percentual = 0.05f;
		                break;
		            case 6:
		                cargo = "Técnico de TI";
		                percentual = 0.08f;
		                break;
		            default:
		                System.out.println("Código inválido!");
		                leia.close();
		                return; // encerra o programa
		        }
		        
		        // Cálculo do novo salário
		        float novoSalario = salario + (percentual * salario);
		        
		        // Saída de Dados
		        System.out.println("\nNome do Colaborador: " + nome);
		        System.out.println("Cargo: " + cargo);
		        System.out.printf("Novo Salário: R$ %.2f%n", novoSalario);
		        
		        leia.close();
		    }
		}
	
