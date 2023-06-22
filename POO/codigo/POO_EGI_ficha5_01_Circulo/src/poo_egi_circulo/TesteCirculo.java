package poo_egi_circulo;

public class TesteCirculo {
	public static void main(String[] args) {
		Ponto centro1 = new Ponto(2,3);
		
		Circulo c1 = new Circulo(centro1, 1);
		System.out.println(c1);
		
		Circulo c2 = new Circulo(new Ponto(7,8), 3);
		System.out.println(c2);
		c2.redefinirXCentro(10);
		c2.redefinirYCentro(20);
		System.out.println(c2);
		
		Circulo c3 = new Circulo(1, 4, 2);
		System.out.println(c3);
		
		
	}
}
