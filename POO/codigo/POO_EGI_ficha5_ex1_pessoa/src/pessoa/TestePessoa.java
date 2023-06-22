package pessoa;

import utilitarios.Data;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Zé", new Data(2006,3,21));
		System.out.println(p1);
		Pessoa p2 = new Pessoa("Ana", new Data(2005,8,2));
		System.out.println(p2);
		System.out.println(p1.calcularDiferenca(p2));
		Pessoa p3 = new Pessoa("Zé", new Data(2006,3,21));
		System.out.println(p1.equals(p3));
	}

}
