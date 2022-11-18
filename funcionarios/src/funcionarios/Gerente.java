package funcionarios;

public class Gerente extends Funcionario implements Autenticacao {
		
	private int senha;
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public Double getBonificacao() {
		return super.getSalario() + super.getSalario();
	}
	
	@Override
	public Boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
}
