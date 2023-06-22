package ficha3;

import java.util.Scanner;

public class Ex22 {

	public static int[] ler() {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int[] valores = new int[n];
		for(int i=0; i<n; i++) {
			valores[i] = ler.nextInt();
		}
		return valores;
	}
	
	public static boolean isCrescente(int[] array) {
		for(int i=1; i<array.length; i++) {
			if(array[i]<array[i-1])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] valores = ler();
		if(isCrescente(valores)) {
			System.out.println("É crescente");
		} else {
			System.out.println("Não é crescente");
		}

	}

}
