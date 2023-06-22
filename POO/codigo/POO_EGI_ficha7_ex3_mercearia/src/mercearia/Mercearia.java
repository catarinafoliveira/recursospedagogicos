package mercearia;

import java.util.ArrayList;

public class Mercearia {
	private String nome;
	private ArrayList<Produto> produtos;
	
	private static final String NOME_OMISSAO = "Não definido";
	
	public Mercearia() {
		this.nome = NOME_OMISSAO;
		this.produtos = new ArrayList<>();
	}
	
	public Mercearia(String nome) {
		this.nome = nome;
		this.produtos = new ArrayList<>();
	}
	
	public Mercearia(Mercearia m) {
		this.nome = m.nome;
		this.produtos = new ArrayList<>();
		for(Produto p: m.produtos) {
			this.adicionarProduto(p);
		}
	}

	public void adicionarProduto(Produto p) {
		this.produtos.add(p);
	}
	
	public String mostrarProdutosEPrecos() {
		String resultado = "Lista de produtos:\n";
		for(Produto p: this.produtos) {
			resultado += p + " -> " + p.calcularPreco(1) + "€\n";
		}
		return resultado;
	}
	
	public String mostrarProdutosUnidade() {
		String resultado = "Lista de produtos vendidos à unidade:\n";
		for(Produto p: this.produtos) {
			if(p instanceof ProdutoUnidade) {
				resultado += p + "\n";
			}
		}
		return resultado;
	}
	
	public String mostrarProdutosPeso() {
		String resultado = "Lista de produtos vendidos a peso:\n";
		for(Produto p: this.produtos) {
			if(p instanceof ProdutoPeso) {
				resultado += p + "\n";
			}
		}
		return resultado;
	}
	
	public String mostrarProdutosVolume() {
		String resultado = "Lista de produtos vendidos a volume:\n";
		for(Produto p: this.produtos) {
			if(p instanceof ProdutoVolume) {
				resultado += p + "\n";
			}
		}
		return resultado;
	}
}
