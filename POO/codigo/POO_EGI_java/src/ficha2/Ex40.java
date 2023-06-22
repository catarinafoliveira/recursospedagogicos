package ficha2;

import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final double IVA_LIVROS = 0.06, IVA_OUTROS = 0.23;
		String nome = ler.next(), artigo;
		double valorSemIva, ivaProduto, totalSemIva, totalComIva, compraTotal, ivaTotalCompra;
		int artigos;
		while(!nome.equals("FIM")) {
			totalSemIva=0;
			totalComIva=0;
			compraTotal=0;
			ivaTotalCompra=0;
			artigos=0;
			artigo = ler.next();
			
			while(!artigo.equals("NEXT")) {
				valorSemIva = ler.nextDouble();
				if(artigo.equals("livro")) {
					ivaProduto = IVA_LIVROS*valorSemIva;
				} else {
					ivaProduto = IVA_OUTROS*valorSemIva;
				}
				ivaTotalCompra+=ivaProduto;
				compraTotal+=valorSemIva+ivaProduto;
				artigos++;
				artigo = ler.next();
			}
			System.out.println(nome + " comprou "+ artigos +" artigos e paga "+String.format("%.2f", compraTotal)+"€ (IVA: "+String.format("%.2f", ivaTotalCompra)+"€)");
			nome = ler.next();
		}
	}

}
