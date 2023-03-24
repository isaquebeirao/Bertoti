import java.util.LinkedList;
import java.util.List;

public class Fabrica { //adiciona funcionarios para a lista da fabrica.

	private List<Funcionario> funcionarios = new LinkedList<Funcionario>();
	
	public void addFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
		
	}
	
	public List<Funcionario> buscarFuncionarioPorRegistro(String registro){
		List<Funcionario> encontrados = new LinkedList<Funcionario>();
		for(Funcionario funcionario: funcionarios) {
			if(funcionario.getRegistro().equals(registro))
				encontrados.add(funcionario);	
		}
		return encontrados;
		
	}
}