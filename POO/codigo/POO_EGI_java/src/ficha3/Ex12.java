package ficha3;

public class Ex12 {
	
	public static double area(double raio) {
		return Math.PI * Math.pow(raio, 2);
	}
	
	public static void main(String[] args) {
		System.out.println(area(1));
		System.out.println(area(2));
	}
}
