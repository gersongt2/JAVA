package escola;

public class Escola {

	public static void main(String[] args) {
		
		Aluno felipe = new Aluno("222222","rua y");
		felipe.setNome("felipe");
		felipe.setIdade(18);
		
		
		System.out.print("O aluno "+ felipe.getNome() + " " + "tem "+ felipe.getIdade() + " cpf: " + felipe.getCpf() + " endereço:"+ felipe.getEndereco() ); 

	}

}
