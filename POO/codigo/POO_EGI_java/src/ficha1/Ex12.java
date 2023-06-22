package ficha1;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Sombra do prédio?");
		double S = ler.nextDouble();
		System.out.println("Sombra do poste?");
		double s = ler.nextDouble();
		System.out.println("Altura do poste?");
		double h = ler.nextDouble();
		double H = S*h/s;
		System.out.println(String.format("Altura: %.1f m",H));
	}

}
