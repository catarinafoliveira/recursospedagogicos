package poo_egi_reta;

public class TesteReta {

	public static void main(String[] args) {
		Reta r1 = new Reta(new Ponto(1,2), new Ponto(3,4));
		System.out.println(r1);
		System.out.println("Comprimento da reta: " + r1.comprimento());
	}
}
