package aulas;

public class AboutMe {
	public static void main(String[] args) {
		
		String nome = args [0];
		String sobrenome = args [1];
		int idade = Integer.valueOf(args[2]);
		
		System.out.println("Ola meu nome e "+ nome + " "+ sobrenome + " tenho " + idade + " anos de idade");
	}
}
