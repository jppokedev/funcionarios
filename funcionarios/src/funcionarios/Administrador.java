package funcionarios;

public class Administrador extends Funcionario implements Autenticacao {

	private int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public Double getBonificacao() {
		return null;
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
