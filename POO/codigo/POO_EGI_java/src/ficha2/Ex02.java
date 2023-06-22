package ficha2;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int soma = 0, qtd = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Idade?");
		int idade = ler.nextInt();
		while(idade != -1) {
			qtd++;
			soma+=idade;
			System.out.println("Idade?");
			idade = ler.nextInt();
		}
		double media = soma/(double)qtd;
		System.out.println("Média: "+media);
	}
}
