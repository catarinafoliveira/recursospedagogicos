package ficha2;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1 = ler.nextDouble();
		double nota2 = ler.nextDouble();
		double nota3 = ler.nextDouble();
		double media = (nota1+nota2+nota3)/3;
		if(media>9.5)
			System.out.print("Aprovado - ");
		else
			System.out.print("Reprovado - ");
		System.out.println(String.format("%.1f", media));
	}

}
