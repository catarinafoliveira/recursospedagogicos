package ficha2;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int soma = 0, idade;
		Scanner ler = new Scanner(System.in);
		System.out.println("Quantos?");
		int qtd = ler.nextInt();
		for(int i=1; i<=qtd; i++) {
			System.out.println("Idade?");
			idade = ler.nextInt();
			soma += idade;
		}
		double media = soma/(double)qtd;
		System.out.println("Média: " + media);
	}
}