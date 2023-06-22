package ficha2;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		int qtd=0;
		for(int i=a+1; i<b; i++) {
			System.out.println(i);
			qtd++;
		}
		System.out.println("total: " + qtd);
	}

}
