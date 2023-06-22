package turmas;

import java.util.ArrayList;
import java.util.Scanner;

import utilitarios.Data;

public class TesteTurmas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ano?");
		int ano = sc.nextInt();
		System.out.println("letra?");
		String letra = sc.next();
		Turma t = new Turma(ano,letra);
		System.out.println(t);
		
//		Aluno a1 = new Aluno("Ze",new Data(2000,1,1),"912345678","Paranhos");
//		Aluno a2 = new Aluno("Ana",new Data(2000,5,3),"987654321","Campanhã");
//		Aluno a3 = new Aluno("Rui",new Data(2000,3,2),"936541235","Paranhos");
//		Aluno a4 = new Aluno("Nelo",new Data(2000,12,31),"444444444","Ramalde");
//		Aluno a5 = new Aluno("Paula",new Data(2000,11,15),"555555555","Ramalde");
//		
////		Turma t = new Turma(12,"A");
//		t.adicionarAluno(a1);
//		t.adicionarAluno(a2);
//		t.adicionarAluno(a3);
//		t.adicionarAluno(a4);
//		t.adicionarAluno(a5);
//		System.out.println(t);
//		
//		t.alterarNrTelefone(a1, "222222222");
//		System.out.println(t);
//		
//		t.alterarNrTelefone(1, "333333333");
//		System.out.println(t);
//		
//		t.removerAluno(a4);
//		System.out.println(t);
//		
//		t.removerAluno(5);
//		System.out.println(t);
//		
//		System.out.println("\nAlunos de Paranhos:");
//		ArrayList<Aluno> alunosParanhos = t.obterAlunos("Paranhos");
//		for(Aluno a: alunosParanhos) {
//			System.out.println(a);
//		}
	}

}
