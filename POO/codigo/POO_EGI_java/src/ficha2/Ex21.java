package ficha2;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int d, soma=0;
		while(n>0) {
			d = n%10;
			soma+=d;
			n = n/10;
		}
		System.out.println(soma);
	}

}
