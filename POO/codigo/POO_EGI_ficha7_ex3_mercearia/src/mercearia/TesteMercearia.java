package mercearia;

public class TesteMercearia {
	public static void main(String[] args) {
		ProdutoUnidade pu1 = new ProdutoUnidade("skip", 15);
		ProdutoUnidade pu2 = new ProdutoUnidade("sacos do lixo", 1.5);
		ProdutoPeso pp1 = new ProdutoPeso("laranjas", 1.99);
		ProdutoPeso pp2 = new ProdutoPeso("bifes", 11.99);
		ProdutoVolume pv1 = new ProdutoVolume("vinho tinto", 2.5, "Vidro");
		ProdutoVolume pv2 = new ProdutoVolume("agua", 0.55, "Plastico");
		
		Mercearia m = new Mercearia("mercearia 1");
		m.adicionarProduto(pu1);
		m.adicionarProduto(pu2);
		m.adicionarProduto(pp1);
		m.adicionarProduto(pp2);
		m.adicionarProduto(pv1);
		m.adicionarProduto(pv2);
		
		System.out.println(m.mostrarProdutosEPrecos());
		System.out.println(m.mostrarProdutosPeso());
		System.out.println(m.mostrarProdutosUnidade());
		System.out.println(m.mostrarProdutosVolume());
	}

}
