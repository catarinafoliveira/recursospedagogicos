package ficha2;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int qtdGrandes=0, somaPequenos=0, qtdPequenos=0;
		while(n>0) {
			if(n<100) {
				somaPequenos+=n;
				qtdPequenos++;
			} else {
				qtdGrandes++;
			}
			n = ler.nextInt();
		}
		System.out.println("Percentagem +2 algarismos: " + qtdGrandes/(double)(qtdGrandes+qtdPequenos)*100 + "%; Média <100: " + somaPequenos/qtdPequenos);
	}

}
