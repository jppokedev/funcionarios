package funcionarios;

public abstract class FuncionarioAutenticavel extends Funcionario {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public Boolean autentica ( int senha ) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public Double getBonificacao() {
		return null;
	}

}
