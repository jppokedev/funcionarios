package funcionarios;

public class Gerente extends Funcionario {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public boolean autenticador(int senha) {
		if(senha == 2222) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public Double getBonificacao() {
		return super.getSalario() + super.getSalario();
	}
	
}
