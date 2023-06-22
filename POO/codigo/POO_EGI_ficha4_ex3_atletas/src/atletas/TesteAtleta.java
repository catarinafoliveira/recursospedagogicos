package atletas;

public class TesteAtleta {
	public static void main(String[] args) {
		Atleta a1 = new Atleta("Zé", 32, 'M', 75, 1.79);
		Atleta a2 = new Atleta("Alice", 27, 'F', 66, 1.58);
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(a1.calcularIMC());
		
		System.out.println(a2.determinarObesidade());
		
		System.out.println(a1.isSaudavel());
		System.out.println(a2.isSaudavel());
	}
}
