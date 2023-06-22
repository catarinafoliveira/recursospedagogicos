package mercearia;

import java.util.Objects;

public abstract class Produto {
	private String nome;
	
	private static final String NOME_OMISSAO = "Não definido";
	
	public Produto() {
		this.nome = NOME_OMISSAO;
	}
	
	public Produto(String nome) {
		this.nome = nome;
	}

	public Produto(Produto p) {
		this.nome = p.nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + "]";
	}

	public abstract double calcularPreco(double quantidade);
}
