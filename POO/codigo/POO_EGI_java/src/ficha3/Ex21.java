package ficha3;

import java.util.Scanner;

public class Ex21 {

	public static int lerNomesEVencimentos(String[] ns, int[] vs) {
		Scanner ler = new Scanner(System.in);
		String nome = ler.next();
		int idx = 0;
		while(!nome.equals("fim")) {
			ns[idx] = nome;
			vs[idx] = ler.nextInt();
			nome = ler.next();
			idx++;
		}
		return idx;
	}
	
	public static double media(int tamanho, int[] valores) {
		int soma = 0;
		for(int i=0; i<tamanho; i++) {
			soma += valores[i];
		}
		return soma/(double)tamanho;
	}
	
	public static void mostrarInferiorValor(String[] ns, int[] vs, double valor, int tamanho) {
		for(int i=0; i<tamanho; i++) {
			if(vs[i] < valor) {
				System.out.println(ns[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] nomes = new String[20];
		int[] vencimentos = new int[20];
		int tamanho = lerNomesEVencimentos(nomes, vencimentos);
		double mediaSalarios = media(tamanho, vencimentos);
		System.out.println("Média: " + String.format("%.1f", mediaSalarios));
		System.out.println("Funcionários com salário inferior à média:");
		mostrarInferiorValor(nomes, vencimentos, mediaSalarios, tamanho);
	}

}
