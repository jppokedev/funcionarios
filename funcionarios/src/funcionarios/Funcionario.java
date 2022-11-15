package funcionarios;

public abstract class Funcionario {

	private String nome;
	private Double salario;
	private int Cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public int getCpf() {
		return Cpf;
	}
	public void setCpf(int cpf) {
		Cpf = cpf;
	}
	
	public abstract Double getBonificacao();
	
}
