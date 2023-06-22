package ficha3;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nLinhas = ler.nextInt();
		int nColunas = ler.nextInt();
		int[][] arr = new int[nLinhas][nColunas];
		for(int i=0; i<nLinhas; i++) {
			for(int j=0; j<nColunas; j++) {
				arr[i][j] = ler.nextInt();
			}
		}
		//mostrar arr
		System.out.println("arr:");
		for(int i=0; i<nLinhas; i++) {
			for(int j=0; j<nColunas; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// somar linhas
		int[] arrSomaLinhas = new int[nLinhas];
		for(int i=0; i<nLinhas; i++) {
			for(int j=0; j<nColunas; j++) {
				arrSomaLinhas[i]+=arr[i][j];
			}
		}
		
		// mostrar somaLinhas
		System.out.println("arrSomaLinhas:");
		for(int i=0; i<nLinhas; i++) {
			System.out.println(arrSomaLinhas[i]);
		}
		
		// somar colunas
				int[] arrSomaColunas = new int[nColunas];
				for(int i=0; i<nLinhas; i++) {
					for(int j=0; j<nColunas; j++) {
						arrSomaColunas[j]+=arr[i][j];
					}
				}
				
		// mostrar SomaColunas
		System.out.println("arrSomaColunas:");
		for(int j=0; j<nColunas; j++) {
			System.out.print(arrSomaColunas[j] + " ");
		}
	}

}
