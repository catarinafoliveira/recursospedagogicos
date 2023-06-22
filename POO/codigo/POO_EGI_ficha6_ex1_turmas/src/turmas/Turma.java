package turmas;

import java.util.ArrayList;
import java.util.Objects;

import utilitarios.Data;

public class Turma {
	private int ano;
	private String id;
	private ArrayList<Aluno> alunos;

	private static final int ANO_OMISSAO = 0;
	private static final String ID_OMISSAO = "X";

	public Turma() {
		this.ano = ANO_OMISSAO;
		this.id = ID_OMISSAO;
		this.alunos = new ArrayList<>(); 
	}

	public Turma(int ano, String id) {
		this.ano = ano;
		this.id = id;
		this.alunos = new ArrayList<>(); 
	}

	public Turma(Turma t) {
		this.ano = t.ano;
		this.id = t.id;
		this.alunos = new ArrayList<>();
		for(Aluno a: t.alunos) {
			this.alunos.add(new Aluno(a));
		}
	}

	public int getAno() {
		return ano;
	}

	public String getId() {
		return id;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		if(ano != other.ano || !id.equals(other.id)) {
			return false;
		}
		for(Aluno a: this.alunos) {
			if(!other.alunos.contains(a)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		String descricao = "Turma " + ano + "º " + id + ", com alunos:";
		for(Aluno a: this.alunos) {
			descricao += "\n- " + a;
		}
		return descricao;
	}

	public void adicionarAluno(Aluno a) {
		this.alunos.add(a);
	}

	public void adicionarAluno(String nome, Data dtNascimento, String tel, String freguesia) {
		adicionarAluno(new Aluno(nome,dtNascimento,tel,freguesia));
	}

	public void adicionarAluno(String nome, int anoN, int mesN, int diaN, String tel, String freguesia) {
		adicionarAluno(new Aluno(nome,new Data(anoN,mesN,diaN),tel,freguesia));
	}

	public void removerAluno(Aluno a) {
		this.alunos.remove(a);
	}

	private Aluno procurarAluno(int n) {
		for(Aluno a: this.alunos) {
			if(a.hasNr(n)) {
				return a;
			}
		}
		return null;
	}

	public void removerAluno(int n) {
		removerAluno(procurarAluno(n));
	}

	public void alterarNrTelefone(Aluno a, String novoTel) {
		for(Aluno x: this.alunos) {
			if(x.equals(a)) {
				x.alterarNrTelefone(novoTel);
			}
		}
	}

	public void alterarNrTelefone(int n, String novoTel) {
		alterarNrTelefone(procurarAluno(n),novoTel);
	}

	public ArrayList<Aluno> obterAlunos(String freguesia){
		ArrayList<Aluno> lista = new ArrayList<>();
		for(Aluno a: this.alunos) {
			if(a.hasFreguesia(freguesia)) {
				lista.add(a);
			}
		}
		return lista;
	}
}
