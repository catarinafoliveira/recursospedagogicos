package ficha2;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int soma = 0;
		for(int i=1; i<=n; i++)
			soma+=i;
		System.out.println(soma);
	}

}
