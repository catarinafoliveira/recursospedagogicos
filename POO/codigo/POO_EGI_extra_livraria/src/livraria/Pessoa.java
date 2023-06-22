package livraria;

import java.util.Objects;

public class Pessoa {
	private String nome;
	private Data dataNascimento;
	
	private static String NOME_OMISSAO = "Não definido";
	
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

	public int calcularIdade(Data hoje) {
		if(this.dataNascimento.getMes() < hoje.getMes() || (this.dataNascimento.getMes() == hoje.getMes() && this.dataNascimento.getDia() < hoje.getDia())) {
			return hoje.getAno() - this.dataNascimento.getAno() - 1;
		} else {
			return hoje.getAno() - this.dataNascimento.getAno();
		}
	}

}
