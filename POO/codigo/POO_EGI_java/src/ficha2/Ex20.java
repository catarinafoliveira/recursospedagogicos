package ficha2;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma=0;
		double qtd=0.0;
		int n = ler.nextInt();
		while(n>0) {
			soma+=n;
			qtd++;
			n = ler.nextInt();
		} 
		System.out.println(soma/qtd);
	}

}
