
class ResultadoEscolar {
	
		public static void main(String[]args) {
			
			int nota = 7 ;
			String resultado = 
							nota <=4 ? "reprovado" : nota >=7 ? "Aprovado" : nota>5 && nota<7 ? "Recuperaçao" : "";
							
			System.out.print(resultado);
			
		}
}
