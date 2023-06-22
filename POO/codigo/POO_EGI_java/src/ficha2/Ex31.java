package ficha2;

import java.util.Scanner;

public class Ex31 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome = ler.next();
		int valor, soma = 0;
		while(!nome.equals("\"\"")) {
			soma = 0;
			valor = ler.nextInt();
			while(valor>0) {
				soma+= valor;
				valor = ler.nextInt();
			}
			System.out.println(nome + " = " + soma);
			nome = ler.next();
		}
	}
}
