package turisticas;

import java.util.ArrayList;

public class TesteAtracoesTuristicas {

	public static void main(String[] args) {
		Museu m1 = new Museu("Soares dos Reis", "Porto", 7.5);
		Museu m2 = new Museu("Ferreira Borges", "Porto", 9.0);
		Parque p1 = new Parque("Parque da Cidade", "Porto", 1000);
		Parque p2 = new Parque("Virtudes", "Porto", 300);
		ParqueDiversoes pd1 = new ParqueDiversoes("Natal Rotunda Boavista", "Boavista", 200, 20);

		ArrayList<Atracao> atracoes = new ArrayList<>();
		atracoes.add(m1);
		atracoes.add(m2);
		atracoes.add(p1);
		atracoes.add(p2);
		atracoes.add(pd1);

		System.out.println("=== Atrações ===");
		for(Atracao a: atracoes) {
			if(a instanceof Faturavel) {
				System.out.println(a + " => " + ((Faturavel)a).calcularPrecoBilhete(15));
			} else {
				System.out.println(a);
			}
		}
		
		System.out.println("=== Museus ===");
		for(Atracao a: atracoes) {
			if(a instanceof Museu) {
				System.out.println(a);
			} 
		}
		
		System.out.println("=== Parques ===");
		for(Atracao a: atracoes) {
			if(a.getClass() == Parque.class) {
				System.out.println(a);
			} 
		}
		
		System.out.println("=== Parques de diversoes ===");
		for(Atracao a: atracoes) {
			if(a instanceof ParqueDiversoes) {
				System.out.println(a);
			} 
		}

	}

}
