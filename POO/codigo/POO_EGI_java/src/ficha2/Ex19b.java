package ficha2;

import java.util.Scanner;

public class Ex19b {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int menor = 999999999;
		int maior = 0;
		int valor;
		int i=0;
		while(i<n) {
			valor = ler.nextInt();
			if(valor>maior)
				maior=valor;
			if(valor<menor)
				menor=valor;
			i++;
		}
		System.out.println("Menor: " + menor + "; Maior:" + maior);
	}

}
