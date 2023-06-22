package ficha2;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Produto?");
		String nome = ler.next();
		double pagar = 1.0;
		System.out.println("Quantidade?");
		int qnt = ler.nextInt();
		if(qnt == 10) {
			pagar = 0.95;
		}
		double valor;
		if(nome.equals("lapis")) {
			valor = 0.25 * qnt * pagar;
		} else {
			valor = 0.5 * qnt * pagar;
		}
		System.out.println("Final: "+valor+"€");
	}
}
