package ficha3;

import java.util.Scanner;

public class Ex20 {
	public static int maior(int[] array) {
		int maior = array[0];
		for(int i=1; i<array.length; i++) {
			if(array[i]>maior)
				maior = array[i];
		}
		return maior;
	}
	
	public static int menor(int[] array) {
		int menor = array[0];
		for(int i=1; i<array.length; i++) {
			if(array[i]<menor)
				menor = array[i];
		}
		return menor;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int[] valores = new int[n];
		for(int i=0; i<n; i++) {
			valores[i] = ler.nextInt();
		}
	
		System.out.println("Maior: " + maior(valores));
		System.out.println("Menor: " + menor(valores));
	}
}
