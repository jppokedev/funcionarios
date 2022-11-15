package funcionarios;

public class Program {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		Gerente g = new Gerente();
		Editor e = new Editor();
		Contador cont = new Contador();

		f.setNome("Fabricio");
		f.setSalario(2500.00);
		f.setCpf(2222222);
		
		g.setNome("Fonseca");
		g.setSalario(5000.00);
		g.setCpf(333333333);
		g.setSenha(2222);
				
		e.setNome("Malricio");
		e.setSalario(3000.00);
		e.setCpf(4444444);
		
		cont.registra(f);
		cont.registra(g);
		cont.registra(e);
		
		System.out.println(f.getNome());
		System.out.println(f.getSalario());
		System.out.println(f.getCpf());
		System.out.println();
		
		System.out.println(g.getNome());
		System.out.println(g.getSalario());
		System.out.println(g.getCpf());
		System.out.println(g.getSenha());
		System.out.println();
		
		System.out.println(e.getNome());
		System.out.println(e.getSalario());
		System.out.println(e.getCpf());
		System.out.println();
		
		System.out.println(cont.getSoma());
		
	}
	


}



