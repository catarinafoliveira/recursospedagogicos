package funcionarios;

import java.util.ArrayList;
import java.util.Collections;

public class TesteOrdenacao {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Zé","111111111",33);
		Pessoa p2 = new Pessoa("Carla","222222222",21);
		Pessoa p3 = new Pessoa("Daniel","333333333",47);
		Pessoa p4 = new Pessoa("Xavier","444444444",18);
		Pessoa p5 = new Pessoa("Edgar","555555555",22);
		Pessoa p6 = new Pessoa("Paulo","666666666",28);
		
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1); pessoas.add(p2); pessoas.add(p3);
		pessoas.add(p4); pessoas.add(p5); pessoas.add(p6);
		
		System.out.println("Pessoas (ordem de inserção):");
		for(Pessoa p: pessoas) {
			System.out.println(p);
		}
		
		System.out.println("\nPessoas (ordem alfabética):");
		Collections.sort(pessoas);
		for(Pessoa p: pessoas) {
			System.out.println(p);
		}
		
		System.out.println("\nPessoas (ordem alfabética inversa):");
		Collections.sort(pessoas,Collections.reverseOrder());
		for(Pessoa p: pessoas) {
			System.out.println(p);
		}
		
		ComparadorIdade ordemIdade = new ComparadorIdade();
		System.out.println("\nPessoas (ordem de idade crescente):");
		Collections.sort(pessoas,ordemIdade);
		for(Pessoa p: pessoas) {
			System.out.println(p);
		}
		
		System.out.println("\nPessoas (ordem de idade decrescente):");
		Collections.sort(pessoas,Collections.reverseOrder(ordemIdade));
		for(Pessoa p: pessoas) {
			System.out.println(p);
		}
		
		ComparadorNif ordemNIF = new ComparadorNif();
		System.out.println("\nPessoas (ordem de NIF crescente):");
		Collections.sort(pessoas,ordemNIF);
		for(Pessoa p: pessoas) {
			System.out.println(p);
		}
		
		System.out.println("\nPessoas (ordem de NIF decrescente):");
		Collections.sort(pessoas,Collections.reverseOrder(ordemNIF));
		for(Pessoa p: pessoas) {
			System.out.println(p);
		}
	}

}
