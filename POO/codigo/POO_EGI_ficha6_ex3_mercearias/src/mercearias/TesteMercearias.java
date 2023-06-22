package mercearias;

import java.util.ArrayList;

public class TesteMercearias {

	public static void main(String[] args) {
		//String nome, String tipo, int codBarras, double preco, int quantidade
		Produto p1 = new Produto("Couves","Legume",123,1.50,12);
		Produto p2 = new Produto("Alface","Legume",456,2.50,22);
		Produto p3 = new Produto("Bife","Carne",789,11.50,7);
		Produto p4 = new Produto("Coxas de frango","Carne",101,5.50,21);
		Produto p5 = new Produto("Feijão vermelho","Leguminosas",112,0.90,34);
		
		Mercearia m = new Mercearia("Mercearia 1", "Morada da mercearia");
		m.adicionarProduto(p1);
		m.adicionarProduto(p2);
		m.adicionarProduto(p3);
		m.adicionarProduto(p4);
		m.adicionarProduto(p5);
		System.out.println(m);
		System.out.println();

		m.removerProduto(p4);
		System.out.println();
		System.out.println(m);
		m.removerProduto(112);
		System.out.println();
		System.out.println(m);
		
		m.venderProduto(p1, 1);
		System.out.println();
		System.out.println(m);
		m.venderProduto(123, 1);
		System.out.println();
		System.out.println(m);
		
		m.comprarProduto(p2, 1);
		System.out.println();
		System.out.println(m);
		m.comprarProduto(456, 1);
		System.out.println();
		System.out.println(m);
		
		System.out.println("\nLegumes:");
		ArrayList<Produto> legumes = m.obterProdutos("Legume");
		for(Produto p: legumes) {
			System.out.println(p);
		}
		
	}

}
