package empresa;
import java.util.Objects;

import utilitarios.Data;

public abstract class Colaborador {
	private String nome;
	private String nif;
	private Data dataNascimento;
	private String morada;
	
	private static final String NOME_OMISSAO = "Não definido";
	private static final String NIF_OMISSAO = "000000000";
	private static final String MORADA_OMISSAO = "Não definida";
	
	public Colaborador() {
		this.nome = NOME_OMISSAO;
		this.nif = NIF_OMISSAO;
		this.dataNascimento = new Data();
		this.morada = MORADA_OMISSAO;
	}

	public Colaborador(String nome, String nif, Data dataNascimento, String morada) {
		this.nome = nome;
		this.nif = nif;
		this.dataNascimento = new Data(dataNascimento);
		this.morada = morada;
	}
	
	public Colaborador(Colaborador c) {
		this.nome = c.nome;
		this.nif = c.nif;
		this.dataNascimento = new Data(c.dataNascimento);
		this.morada = c.morada;
	}
	
	public String getNome() {
		return nome;
	}

	public String getNif() {
		return nif;
	}

	public Data getDataNascimento() {
		return new Data(dataNascimento);
	}

	public String getMorada() {
		return morada;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = new Data(dataNascimento);
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Colaborador other = (Colaborador) obj;
		return Objects.equals(morada, other.morada) && Objects.equals(nif, other.nif)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Colaborador [nome=" + nome + ", nif=" + nif + ", morada=" + morada + "]";
	}

	public abstract double calcularVencimento();
}
