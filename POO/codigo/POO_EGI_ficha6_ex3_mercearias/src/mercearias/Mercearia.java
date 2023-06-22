package mercearias;

import java.util.ArrayList;
import java.util.Objects;

public class Mercearia {
	private String nome;
	private String morada;
	private ArrayList<Produto> produtos;
	
	private static final String NOME_OMISSAO = "Não definido";
	private static final String MORADA_OMISSAO = "Não definido";
	
	public Mercearia() {
		this.nome = NOME_OMISSAO;
		this.morada = MORADA_OMISSAO;
		this.produtos = new ArrayList<>();
	}
	
	public Mercearia(String nome, String morada) {
		this.nome = nome;
		this.morada = morada;
		this.produtos = new ArrayList<>();
	}
	
	public Mercearia(Mercearia m) {
		this.nome = m.nome;
		this.morada = m.morada;
		this.produtos = new ArrayList<>();
		for(Produto p: m.produtos) {
			this.produtos.add(new Produto(p));
		}
	}
	
	public Mercearia clone() {
		return new Mercearia(this);
	}

	public String getNome() {
		return nome;
	}

	public String getMorada() {
		return morada;
	}

	public ArrayList<Produto> getProdutos() {
		ArrayList<Produto> lista = new ArrayList<>();
		for(Produto p: this.produtos) {
			lista.add(new Produto(p));
		}
		return lista;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = new ArrayList<>();
		for(Produto p: produtos) {
			this.produtos.add(new Produto(p));
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(morada, nome, produtos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Mercearia other = (Mercearia) obj;
		if(!this.morada.equals(other.morada) || !this.nome.equals(other.nome)) {
			return false;
		}
		for(Produto p: this.produtos) {
			if(!other.produtos.contains(p)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		String descricao = "Mercearia [nome=" + nome + ", morada=" + morada + "], com produtos:";
		for(Produto p: this.produtos) {
			descricao += "\n- " + p;
		}
		return descricao;
	}
	
	public void adicionarProduto(Produto p) {
		this.produtos.add(p);
	}
	
	public void adicionarProduto(String nome, String tipo, int codBarras, double preco, int quantidade) {
		adicionarProduto(new Produto(nome, tipo, codBarras, preco, quantidade));
	}
	
	public void removerProduto(Produto p) {
		this.produtos.remove(p);
	}
	
	private Produto procurar(int cod) {
		for(Produto p: this.produtos) {
			if(p.hasCod(cod)) {
				return p;
			}
		}
		return null;
	}
	
	public void removerProduto(int cod) {
		removerProduto(procurar(cod));
	}
	
	public void venderProduto(Produto p, int qtd) {
		for(Produto x: this.produtos) {
			if(x.equals(p)) {
				x.retirar(qtd);
			}
		}
	}
	
	public void venderProduto(int cod, int qtd) {
		venderProduto(procurar(cod), qtd);
	}
	
	public void comprarProduto(Produto p, int qtd) {
		for(Produto x: this.produtos) {
			if(x.equals(p)) {
				x.adicionar(qtd);
			}
		}
	}
	
	public void comprarProduto(int cod, int qtd) {
		comprarProduto(procurar(cod), qtd);
	}
	
	public ArrayList<Produto> obterProdutos(String t) {
		ArrayList<Produto> lista = new ArrayList<>();
		for(Produto p: this.produtos) {
			if(p.isTipo(t)) {
				lista.add(p);
			}
		}
		return lista;
	}
}
