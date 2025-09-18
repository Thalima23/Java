package listaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exe1 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        ArrayList<String> corList = new ArrayList<String>();

        // Entrada das 5 cores usando o laço for
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Insira a %dª cor: ", i);
            String cor = leia.nextLine();
            corList.add(cor);
        }

        // Mostrando as cores digitadas
        System.out.println("\nListar as cores:");
        for (String cor : corList) {
            System.out.println(cor);
        }

        // Ordenando em ordem crescente
        Collections.sort(corList);

        // Mostrando as cores ordenadas
        System.out.println("\nOrdenar as cores:");
        for (String cor : corList) {
            System.out.println(cor);
        }

        leia.close();
    }
}