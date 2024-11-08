

public class AboutMe {
	public static void main(String[] args) {
		
		try {
			
		String nome = args[0];
		String sobrenome = args [1];
		int idade = Integer.valueOf(args[2]);
		
		System.out.println("Ola meu nome e "+ nome + " "+ sobrenome + " tenho " + idade + " anos de idade");
		
		
		}
		catch(NumberFormatException e) {
			System.out.println("O campo idade precisam ser numerico ");
		}
		
		
		
		
		
	}
		
}
