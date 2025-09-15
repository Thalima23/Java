
	import java.util.Scanner;
	
	public class numero2 {
		
	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		// Declaração das variáveis
		float nota1, nota2, nota3, nota4, media;
		
		// Declaração das notas
		
		 System.out.print("Nota 1: ");
	        nota1 = leia.nextFloat();
	        
	        System.out.print("Nota 2: ");
	        nota2 = leia.nextFloat();
	        
	        System.out.print("Nota 3: ");
	        nota3 = leia.nextFloat();
	        
	        System.out.print("Nota 4: ");
	        nota4 = leia.nextFloat();
	        
	        // Cálculo das médias
	        
	        media= (nota1 +nota2 +nota3 +nota4)/4;
	        
	        // Saída com duas casas decimais
	        
	        System.out.printf("Média final do participante: %.1f%n", media);
	        
	        leia.close();

	}

}
	
