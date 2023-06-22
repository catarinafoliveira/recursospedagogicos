package ficha3;

public class Ex13 {

	public static int combinacoes(int n, int r) {
		return Ex10.fatorialSimples(n)/(Ex10.fatorialSimples(r)*Ex10.fatorialSimples(n-r));
	}
	
	public static void main(String[] args) {
		System.out.println(combinacoes(10, 4));

	}

}
