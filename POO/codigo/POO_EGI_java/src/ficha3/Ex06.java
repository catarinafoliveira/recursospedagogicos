package ficha3;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int[] frequencias = new int[21];
		int nota;
		for(int i=0; i<n; i++) {
			nota = ler.nextInt();
			frequencias[nota]++;
		}
		for(int i=0; i<21; i++) {
			if(frequencias[i]>0)
				System.out.println(i + ": " + frequencias[i]);
		}
	}
}
