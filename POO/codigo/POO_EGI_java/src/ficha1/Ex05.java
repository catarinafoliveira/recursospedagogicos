package ficha1;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		final double ACELERACAO_GRAVIDADE = 9.8;
		Scanner ler = new Scanner(System.in);
		double tempo = ler.nextDouble();
		double distancia = ACELERACAO_GRAVIDADE * Math.pow(tempo, 2)/2;
		System.out.println(String.format("%.2f m", distancia));
	}

}
