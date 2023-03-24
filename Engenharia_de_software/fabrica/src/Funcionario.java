
public class Funcionario {

	private String nome;
	private int idade;
	private String registro;
	private Endereco endereco;

	public Funcionario(String nome, String registro) {
		this.nome = nome;
		this.registro = registro;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getRegistro() {
		return registro;
	}
	
}
