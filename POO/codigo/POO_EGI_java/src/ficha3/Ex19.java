package ficha3;

import java.util.Scanner;

public class Ex19 {
	public static double media(int[] array) {
		int soma = 0;
		for(int i=0; i<array.length; i++) {
			soma += array[i];
		}
		return soma/(double)array.length;
	}
	
	public static int contarInferiores(int[] array, int valor) {
		int nrInferiores = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i] < 10) {
				nrInferiores++;
			}
		}
		return nrInferiores;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int[] notas = new int[n];
		for(int i=0; i<n; i++) {
			notas[i] = ler.nextInt();
		}

		System.out.println("Média: " + media(notas) + ". Reprovaram " + contarInferiores(notas, 10));
	}

}
