package escola;

import java.util.ArrayList;

public class TesteEscola {
	public static void main(String[] args) {
		Professor p1 = new Professor("Ze", "111111111", 1000, 5);
		Professor p2 = new Professor("Ana", "222222222", 900, 10);
		Aluno a1 = new Aluno("Paulo", "333333333", "EGI", 1);
		Aluno a2 = new Aluno("Luisa", "444444444", "EI", 3);
		AlunoBolseiro ab1 = new AlunoBolseiro("Miguel", "555555555", "EGI", 1, 300);
		AlunoBolseiro ab2 = new AlunoBolseiro("Maria", "666666666", "EI", 2, 150);
		
		ArrayList<Pessoa> pessoasDaEscola = new ArrayList<>();
		pessoasDaEscola.add(p1);
		pessoasDaEscola.add(p2);
		pessoasDaEscola.add(a1);
		pessoasDaEscola.add(a2);
		pessoasDaEscola.add(ab1);
		pessoasDaEscola.add(ab2);
		
		System.out.println("=== Pessoas da escola ===");
		for(Pessoa p: pessoasDaEscola) {
			if(p instanceof Pagavel) {
				System.out.println(p + " => " + ((Pagavel)p).calcularValorAPagar());
			} else {
				System.out.println(p);
			}
		}
		
		System.out.println("=== Professores ===");
		for(Pessoa p: pessoasDaEscola) {
			if(p instanceof Professor) {
				System.out.println(p);
			}
		}
		
		System.out.println("=== Alunos bolseiros ===");
		for(Pessoa p: pessoasDaEscola) {
			if(p instanceof AlunoBolseiro) {
				System.out.println(p);
			}
		}
		
		System.out.println("=== Alunos não bolseiros ===");
		for(Pessoa p: pessoasDaEscola) {
			if(p.getClass() == Aluno.class) {
				System.out.println(p);
			}
		}
	}

}
