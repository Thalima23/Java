import java.util.Scanner;

public class numero4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//Declarar variáveis
		float n1, n2, n3, n4, media;
		
		System.out.print("n1: ");
        n1= leia.nextFloat();
        
        System.out.print("n2: ");
        n2= leia.nextFloat();
        
        System.out.print("n3: ");
        n3= leia.nextFloat();
        
        System.out.print("n4: ");
        n4= leia.nextFloat();
        
    
        //Calcular a média
        
        media= (n1*n2)-(n3*n4);
        
        //Saída com uma casa decimal
        
System.out.printf("cálculo: %.1f%n", media);
        
        leia.close();

	}

}
