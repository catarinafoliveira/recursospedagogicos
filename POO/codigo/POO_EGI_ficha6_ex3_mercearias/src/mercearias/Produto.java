package mercearias;

import java.util.Objects;

public class Produto {
	private String nome;
	private String tipo;
	private int codBarras;
	private double preco;
	private int quantidade;
	
	private static final String NOME_OMISSAO = "Não definido";
	private static final String TIPO_OMISSAO = "Não definido";
	private static final int COD_BARRAS_OMISSAO = 0;
	private static final double PRECO_OMISSAO = 0.0;
	private static final int QUANTIDADE_OMISSAO = 0;
	
	public Produto() {
		this.nome = NOME_OMISSAO;
		this.tipo = TIPO_OMISSAO;
		this.codBarras = COD_BARRAS_OMISSAO;
		this.preco = PRECO_OMISSAO;
		this.quantidade = QUANTIDADE_OMISSAO;
	}
	
	public Produto(String nome, String tipo, int codBarras, double preco, int quantidade) {
		this.nome = nome;
		this.tipo = tipo;
		this.codBarras = codBarras;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produto(Produto p) {
		this.nome = p.nome;
		this.tipo = p.tipo;
		this.codBarras = p.codBarras;
		this.preco = p.preco;
		this.quantidade = p.quantidade;
	}
	
	public Produto clone() {
		return new Produto(this);
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public int getCodBarras() {
		return codBarras;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return this.codBarras == other.codBarras 
				&& this.nome.equals(other.nome)
				&& this.preco == other.preco
				&& this.quantidade == other.quantidade 
				&& this.tipo.equals(other.tipo);
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", tipo=" + tipo + ", codBarras=" + codBarras + ", preco=" + preco
				+ ", quantidade=" + quantidade + "]";
	}

	public double calcularPreco(int qtd) {
		return this.preco*qtd;
	}
	
	public void retirar(int qtd) {
		this.quantidade-=qtd;
	}
	
	public void adicionar(int qtd) {
		this.quantidade += qtd;
	}
	
	public boolean isTipo(String t) {
		return this.tipo.equals(t);
	}
	
	public boolean hasCod(int c) {
		return this.codBarras == c;
	}
}
