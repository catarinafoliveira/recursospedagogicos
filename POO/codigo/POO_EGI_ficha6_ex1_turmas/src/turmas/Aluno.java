package turmas;

import java.util.Objects;

import utilitarios.Data;

public class Aluno {
	private String nome;
	private int nrAluno;
	private Data dtNasc;
	private String telefone;
	private String freguesia;
	
	private static final String NOME_OMISSAO = "Não definido";
	private static final String TEL_OMISSAO = "Não definido";
	private static final String FREGUESIA_OMISSAO = "Não definido";
	
	private static int nrAlunos = 0;
	
	public Aluno() {
		nrAlunos++;
		this.nrAluno = nrAlunos;
		this.nome = NOME_OMISSAO;
		this.dtNasc = new Data();
		this.telefone = TEL_OMISSAO;
		this.freguesia = FREGUESIA_OMISSAO;
	}
	
	public Aluno(String nome, Data dtNasc, String telefone, String freguesia) {
		nrAlunos++;
		this.nrAluno = nrAlunos;
		this.nome = nome;
		this.dtNasc = dtNasc;
		this.telefone = telefone;
		this.freguesia = freguesia;
	}
	
	public Aluno(Aluno a) {
		this.nome = a.nome;
		this.nrAluno = a.nrAluno;
		this.dtNasc = new Data(a.dtNasc);
		this.telefone = a.telefone;
		this.freguesia = a.freguesia;
	}
	
	public Aluno clone() {
		return new Aluno(this);
	}

	public String getNome() {
		return nome;
	}

	public int getNrAluno() {
		return nrAluno;
	}

	public Data getDtNasc() {
		return new Data(dtNasc);
	}

	public String getTelefone() {
		return telefone;
	}

	public String getFreguesia() {
		return freguesia;
	}

	public static int getNrAlunos() {
		return nrAlunos;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDtNasc(Data dtNasc) {
		this.dtNasc = new Data(dtNasc);
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setFreguesia(String freguesia) {
		this.freguesia = freguesia;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return freguesia.equals(other.freguesia) 
				&& nome.equals(other.nome)
				&& nrAluno == other.nrAluno 
				&& telefone.equals(other.telefone);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nrAluno=" + nrAluno + ", telefone=" + telefone + ", freguesia=" + freguesia
				+ "]";
	}
	
	public void alterarNrTelefone(String novoTel) {
		setTelefone(novoTel);
	}
	
	public boolean hasNr(int n) {
		return this.nrAluno == n;
	}
	
	public boolean hasFreguesia(String freguesia) {
		return this.freguesia.equals(freguesia);
	}
}
