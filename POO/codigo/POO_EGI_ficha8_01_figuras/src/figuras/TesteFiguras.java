package figuras;

import java.util.ArrayList;

public class TesteFiguras {
	public static void main(String[] args) {
		Circulo c1 = new Circulo(1);
		Circulo c2 = new Circulo(2.5);
		Circulo c3 = new Circulo(10);
		Retangulo r1 = new Retangulo(1,1);
		Retangulo r2 = new Retangulo(2,5);
		Retangulo r3 = new Retangulo(10,3);
		
		ArrayList<CalculosGeometricos> figuras = new ArrayList<>();
		figuras.add(c1); figuras.add(c2); figuras.add(c3);
		figuras.add(r1); figuras.add(r2); figuras.add(r3);
		
		System.out.println("=== Figuras ===");
		for(CalculosGeometricos f: figuras) {
			System.out.println(f);
		}
		
		System.out.println("=== Circulos ===");
		for(CalculosGeometricos f: figuras) {
			if(f instanceof Circulo) {
				System.out.println(f);
			}
		}
		
		System.out.println("=== Retangulos ===");
		for(CalculosGeometricos f: figuras) {
			if(f instanceof Retangulo) {
				System.out.println(f);
			}
		}
	}
}
