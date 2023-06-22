package ficha2;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt(), idade, idadeMaisVelho=0;
		String nome, nomeMaisVelho = "";
		for(int i=0; i<n; i++) {
			nome = ler.next();
			idade = ler.nextInt();
			if(idade>idadeMaisVelho) {
				idadeMaisVelho = idade;
				nomeMaisVelho=nome;
			}
		}
		System.out.println(nomeMaisVelho + " " + idadeMaisVelho);
	}

}
