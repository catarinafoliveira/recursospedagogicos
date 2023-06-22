package ficha3;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int[] valores = new int[n];
		for(int i=0; i<n; i++) {
			valores[i] = ler.nextInt();
		}
		// determinar maior
		int maior = valores[0];
		for(int i=1; i<n; i++) {
			if(valores[i]>maior)
				maior = valores[i];
		}
		System.out.println("Maior: " + maior);
		// determinar menor
		int menor = valores[0];
		for(int i=1; i<n; i++) {
			if(valores[i]<menor)
				menor = valores[i];
		}
		System.out.println("Menor: " + menor);
	}
}
