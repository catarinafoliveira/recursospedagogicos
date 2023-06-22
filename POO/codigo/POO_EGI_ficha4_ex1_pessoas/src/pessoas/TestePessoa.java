package pessoas;

import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Ana", 32);
		Pessoa p2 = new Pessoa("Beto", 40);
		Pessoa p3 = new Pessoa("Carla", 54);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p2.setIdade(p1.getIdade());
		System.out.println(p2);
		System.out.println(p3.idadeFutura(5));
		System.out.println(p2.idadePassada(10));
	}

}
