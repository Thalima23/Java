package listaCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteExe3 {

			public static void main(String[] args) {
					
				
				Scanner leia = new Scanner(System.in);
				
				String cor = "";

				ArrayList<String> corList = new ArrayList<String>();
				for(int i = 1; i<=5 ; i++) {
					
					System.out.printf("Insira a %dª cor: ", i);
					cor = leia.nextLine();
					corList.add(cor);
				}
				
				System.out.printf("Listar todas as cores: ");
				System.out.println(corList);
				System.out.printf("Ordenar as cores: ");
				corList.sort(null);
				System.out.println(corList);
				leia.close();
				
				
				
			}

		}

