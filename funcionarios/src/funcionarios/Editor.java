package funcionarios;

public class Editor extends Funcionario {

	public Double getBonificacao() {
		return super.getSalario() + 200;
	}
	
}
