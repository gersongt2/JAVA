import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class EstruturasdeRepetição {
		
	
	
		public static void main(String[]args) {
/*			
			String alunos [] = {"FELIPE","JONAS","JULIA","MARCOS"}; 
			
			for(int x=0;x < alunos.length;x++) {
				
				if(x == 3)
					break;
					
				System.out.println("O aluno no indice x = " + x + " e " + alunos[x]);
												}
			
			for(String aluno : alunos) {
				
				
				System.out.println("Nome do alunos e: " + aluno );
										}
			
			
			
			
			
			double mesada = 50.0;
			
			while(mesada > 0 ) {
						
				double valorDoce = valorAleatorio();	
				
				if(valorDoce > mesada)
					valorDoce = mesada;
				
				System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho" );
				mesada = mesada-valorDoce;
				
								}
			
				System.out.println("Mesada: " + mesada );
				
		
			
	*/			
			
			System.out.println("Discando...");
			
			do {
				
				System.out.println("Telefone tocando");
				
			}while(tocando());
			
			
			System.out.println("Alo !!!");
			
			
			
		}
		
		
		
		private static double valorAleatorio(){
			
			return ThreadLocalRandom.current().nextDouble(2,8);  
		}
		
		
		private static boolean tocando() {
			
			boolean atendeu = new Random().nextInt(3)==1;
			System.out.println("Atendeu ? " + atendeu);
			return !  atendeu;
		}
		
}
