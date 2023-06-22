package ficha1;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Moeda taxa quantia?");
		String nome = ler.next();
		double taxa = ler.nextDouble();
		double quantia = ler.nextDouble();
		double euros = quantia/taxa;
		System.out.println(String.format("%.2f", quantia) + " " + nome + " = " + String.format("%.2f", euros) + "€ (1 " + nome+ " = "+String.format("%.5f", taxa)+"€)");
	}

}
