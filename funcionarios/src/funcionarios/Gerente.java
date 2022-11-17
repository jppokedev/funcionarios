package funcionarios;

public class Gerente extends FuncionarioAutenticavel {
		
	public Double getBonificacao() {
		return super.getSalario() + super.getSalario();
	}
	
}
