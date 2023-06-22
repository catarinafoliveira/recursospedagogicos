package ficha2;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mes = ler.nextInt();
		switch(mes) {
			case 1: {
				System.out.println("unidade");
				break;
			}
			case 2: {
				System.out.println("dezena");
				break;
			}
			case 3: {
				System.out.println("centena");
				break;
			}
			default: System.out.println("Erro");
		}
	}

}
