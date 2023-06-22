package ficha3;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int[] notas = new int[n];
		for(int i=0; i<n; i++) {
			notas[i] = ler.nextInt();
		}
		// calcular média
		int soma = 0;
		for(int i=0; i<n; i++) {
			soma += notas[i];
		}
		double media = soma/(double)n;
		
		// determinar quantos reprovaram
		int nrReprovados = 0;
		for(int i=0; i<n; i++) {
			if(notas[i] < 10) {
				nrReprovados++;
			}
		}
		
		System.out.println("Média: " + media + ". Reprovaram " + nrReprovados);
	}

}
