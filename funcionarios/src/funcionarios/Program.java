package funcionarios;

public class Program {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		Editor e = new Editor();
		Contador cont = new Contador();
		
		g.setNome("Fonseca");
		g.setSalario(5000.00);
		g.setCpf(333333333);
		
				
		e.setNome("Malricio");
		e.setSalario(3000.00);
		e.setCpf(4444444);
		
		cont.registra(g);
		cont.registra(e);
		
		System.out.println(g.getNome());
		System.out.println(g.getSalario());
		System.out.println(g.getCpf());
		System.out.println();
		
		System.out.println(e.getNome());
		System.out.println(e.getSalario());
		System.out.println(e.getCpf());
		System.out.println();
		
		System.out.println(cont.getSoma());
		
		Administrador adm = new Administrador();
		adm.setSenha(2222);
		g.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(adm);
		si.autentica(g);
		
		
	}
	
}



