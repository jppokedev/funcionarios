package funcionarios;

public abstract interface Autenticacao {
	
	public void setSenha(int senha);
	
	public Boolean autentica ( int senha );
	
}
