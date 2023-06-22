package ficha1;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual a temperatura em ºC?");
		double celsius = ler.nextDouble();
		double farenheit = (9.0/5)*celsius+32;
		System.out.println(celsius+"ºC = " + farenheit + "ºF");

	}

}
