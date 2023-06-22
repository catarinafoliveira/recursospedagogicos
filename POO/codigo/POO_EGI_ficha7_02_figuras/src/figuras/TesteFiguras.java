package figuras;

import java.util.ArrayList;

public class TesteFiguras {
	public static void main(String[] args) {
		Retangulo r1 = new Retangulo("azul",1,2);
		Circulo c1 = new Circulo("verde",1);
		
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(r1);
		figuras.add(c1);
		
		for(Figura f: figuras) {
			String frase = f + " de área: " + f.calcularArea();
			if(f instanceof Retangulo) {
				frase += ", porque ";
				frase += ((Retangulo)f).getBase();
				frase += " * " ;
				frase += ((Retangulo)f).getAltura();
				frase += " = ";
				frase += f.calcularArea();
			} else if(f instanceof Circulo) {
				frase += ", porque ";
				frase += Math.PI;
				frase += " * " ;
				frase += ((Circulo)f).getRaio();
				frase += " * " ;
				frase += ((Circulo)f).getRaio();
				frase += " = ";
				frase += f.calcularArea();
			}
			System.out.println(frase);
		}
	}
}
