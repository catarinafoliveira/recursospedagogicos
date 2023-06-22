package livros;

import java.util.Objects;

import utilitarios.Data;

public class Pessoa {
	private String nome;
	private Data dataNascimento;
	
	public static final String NOME_OMISSAO = "Não definido";
	
	public Pessoa(String nome, Data dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public Pessoa() {
		this.nome = NOME_OMISSAO;
		this.dataNascimento = new Data();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Data getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String toString() {
		return this.nome + " nasceu em " + dataNascimento;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return this.dataNascimento.equals(other.dataNascimento) && this.nome.equals(other.nome);
	}

	public int calcularDiferenca(Pessoa p) {
		return this.dataNascimento.calcularDiferenca(p.dataNascimento);
	}

}
