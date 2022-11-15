package funcionarios;

public class Contador {
	
	private Double soma = 0.0;
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return this.soma;
	}


	
}
