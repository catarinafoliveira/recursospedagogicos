package ficha1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Quantas canetas?");
		int canetas = ler.nextInt();
		System.out.println("Quanto custa cada caneta?");
		double unidade = ler.nextDouble();
		double preco = canetas*unidade;
		System.out.println("Vai pagar " + preco+"€");
	}
}