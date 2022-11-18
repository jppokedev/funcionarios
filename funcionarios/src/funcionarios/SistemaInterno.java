package funcionarios;

public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica (Autenticacao fa) {
		Boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("correto");
		} else {
			System.out.println(" errado ");
		}		
	}
	
}
