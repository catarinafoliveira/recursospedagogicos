package poo_egi_ponto;

/**
 * Uma classe de teste para o projeto
 * 
 * @author Catarina
 *
 */
public class TestePonto {
	
	/**
	 * A função main
	 * 
	 * @param args Os argumentos passados à função main
	 */
	public static void main(String[] args) {
		Ponto p1 = new Ponto(1.3,2.4);
		Ponto p2 = new Ponto(p1);
		Ponto p3 = new Ponto(3.5);
		
		System.out.println(p1);
		System.out.println(p1.getX());
		p1.setX(5);
		System.out.println(p1);
		
	}
}
