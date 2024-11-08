package escola;

public class Aluno {

	private String nome;
	private int idade ;
	private String cpf;
	private String endereco;


	
	public Aluno() {
		super();
	}


	public Aluno(String cpf, String endereco) {
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	
	public String getCpf() {
		return cpf;
	}	
	public String getEndereco() {
		return endereco;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int newIdade) {
		this.idade = newIdade;
	} 
}
