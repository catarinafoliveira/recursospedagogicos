package pontos;

import java.util.ArrayList;

public class TestePonto3D {
	public static void main(String[] args) {
		Ponto p1 = new Ponto(1,2);
		Ponto p2 = new Ponto(3,4);
		Ponto3D p3 = new Ponto3D(1,2,3);
		Ponto3D p4 = new Ponto3D(4,5,6);
		//
		//		System.out.println("p1="+p1);
		//		System.out.println("p2="+p2);
		//		System.out.println("p3="+p3);
		//		System.out.println("p4="+p4);
		//
		//		System.out.println(Ponto.distanciaEuclideana(p1, p2));
		//		System.out.println(Ponto.distanciaEuclideana(1, 2, 3, 4));

		ArrayList<Ponto> pontos = new ArrayList<>();
		pontos.add(p1); pontos.add(p2); pontos.add(p3);	pontos.add(p4);

		//		for(Ponto p: pontos) {
		//			System.out.println(p);
		//		}

		//		for(Ponto p: pontos) {
		//			if(p instanceof Ponto3D) {
		//				System.out.println(p);
		//			}
		//		}

		//		for(Ponto p: pontos) {
		//			if(p.getClass() == Ponto.class) {
		//				System.out.println(p);
		//			}
		//		}

		for(Ponto p: pontos) {
			if(p instanceof Ponto3D) {
				Ponto3D p3d = (Ponto3D)p;
				System.out.println(p3d.getZ());
			}
		}

		//		Ponto p = (Ponto)p3;
		//		System.out.println(p.getX());
	}
}
