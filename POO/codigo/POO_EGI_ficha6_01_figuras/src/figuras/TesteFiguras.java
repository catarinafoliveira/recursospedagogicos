package figuras;

public class TesteFiguras {
	public static void main(String[] args) {
		Ponto p1 = new Ponto(0,0);
		Ponto p2 = new Ponto(0,1);
		Ponto p3 = new Ponto(1,0);
		Ponto p4 = new Ponto(1,1);
		
		Figura quadrado = new Figura();
		quadrado.adicionarVertice(p1);
		quadrado.adicionarVertice(p2);
		quadrado.adicionarVertice(p3);
		quadrado.adicionarVertice(p4);
		System.out.println(quadrado);
		
		Figura t = new Figura("triangulo");
		t.adicionarVertice(p1);
		t.adicionarVertice(p2);
		t.adicionarVertice(p3);
		System.out.println(t);
	}
}
