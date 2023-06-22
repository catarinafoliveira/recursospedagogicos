package ficha1;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Lado 1?");
		double c1 = ler.nextDouble();
		System.out.print("Lado 2?");
		double c2 = ler.nextDouble();
		double h = Math.sqrt(Math.pow(c1, 2)+Math.pow(c2, 2));
		System.out.println(String.format("Hipotenusa: %.1f cm", h));
	}

}
