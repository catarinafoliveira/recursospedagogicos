package ficha2;

import java.util.Scanner;

public class Ex19c {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int menor = 999999999;
		int maior = 0;
		int valor;
		int i=0;
		do {
			valor = ler.nextInt();
			if(valor>maior)
				maior=valor;
			if(valor<menor)
				menor=valor;
			i++;
		} while(i<n);
		System.out.println("Menor: " + menor + "; Maior:" + maior);
	}

}
