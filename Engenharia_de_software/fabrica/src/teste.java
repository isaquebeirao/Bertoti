import java.util.List;

public class teste {

	public static void main(String[] args) {
		
		Fabrica lenovo = new Fabrica();
		
		lenovo.addFuncionario(new Funcionario("Isaque", "1"));
		lenovo.addFuncionario(new Funcionario("Thiago", "2"));
		
		List<Funcionario> funcionariosEncontrados = lenovo.buscarFuncionarioPorRegistro("1");
		
		for(Funcionario funcionarios: funcionariosEncontrados) {
			System.out.println(funcionarios.getRegistro() + " " + funcionarios.getNome());
		}
	}
	
}


//adicionar classe setor, onde vai ser criado os setores q os funcionarios vao ser alocados.