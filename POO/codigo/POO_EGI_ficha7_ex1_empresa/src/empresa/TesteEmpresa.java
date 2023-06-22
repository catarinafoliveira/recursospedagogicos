package empresa;

import utilitarios.Data;

public class TesteEmpresa {
	public static void main(String[] args) {
		Empresa e = new Empresa("Nome da empresa","999999999");
		
		ColaboradorComissao cc1 = new ColaboradorComissao("Ana", "111111111", new Data(2001,1,1), "Rua A nº 1", 1000, 100);
		ColaboradorComissao cc2 = new ColaboradorComissao("Bruno", "222222222", new Data(2002,2,2), "Rua B nº 2", 2000, 200);
		ColaboradorHora ch1 = new ColaboradorHora("Carla", "333333333", new Data(2003,3,3), "Rua C nº 3", 160);
		ColaboradorHora ch2 = new ColaboradorHora("Diogo", "444444444", new Data(2004,4,4), "Rua D nº 4", 80);
		
		e.adicionarColaborador(cc1);
		e.adicionarColaborador(cc2);
		e.adicionarColaborador(ch1);
		e.adicionarColaborador(ch2);
		
		System.out.println("Colaboradores e vencimentos:");
		System.out.println(e.mostrarColaboradoresEVencimentos());
		
		System.out.println("\nColaboradores à hora:");
		System.out.println(e.mostrarColaboradoresHora());
		
		System.out.println("\nColaboradores à comissão:");
		System.out.println(e.mostrarColaboradoresComissao());
	}
}
