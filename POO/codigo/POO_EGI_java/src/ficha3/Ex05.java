package ficha3;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int[] valores = new int[n];
		for(int i=0; i<n; i++) {
			valores[i] = ler.nextInt();
		}
		for(int i=n-1; i>=0; i--) {
			System.out.print(valores[i] + " ");
		}
	}
}
