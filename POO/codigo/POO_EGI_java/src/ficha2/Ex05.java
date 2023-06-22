package ficha2;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome1 = ler.next();
		int idade1 = ler.nextInt();
		String nome2 = ler.next();
		int idade2 = ler.nextInt();
		double media = (idade1+idade2)/2.0;
		System.out.println("Média de idades: " + media);
		if(idade1==idade2)
			System.out.println("Gémeos");
		else if(idade1>idade2)
			System.out.println("Mais velho:" + nome1);
		else
			System.out.println(nome2 + " é o mais velho");
		System.out.println("A diferença de idades é " + Math.abs(idade1-idade2));
	}

}
