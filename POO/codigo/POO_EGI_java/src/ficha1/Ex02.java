package ficha1;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Nome 1ª pessoa?");
		String nome1 = ler.next();
		System.out.println("Idade " + nome1+"?");
		int idade1 = ler.nextInt();
		System.out.println("Nome 2ª pessoa?");
		String nome2 = ler.next();
		System.out.println("Idade " + nome2+"?");
		int idade2 = ler.nextInt();

		double media  = (idade1+idade2)/2.0;
		System.out.println("Idade média: " + media);
	}
}