package ficha3;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int nEntradas = 3, nAndares = 4;
		String[][] predio = new String[nAndares][nEntradas];
		Scanner ler = new Scanner(System.in);

		// leitura
		for(int andar=0; andar<nAndares; andar++) {
			for(int entrada=0; entrada<nEntradas; entrada++) {
				System.out.println("Andar " + andar + ", entrada " + entrada + "?");
				predio[andar][entrada] = ler.next();
			}
		}

		// determinar onde mora
		System.out.println("Que morador pretende verificar?");
		String nome = ler.next();
		boolean encontrado = false;

		tudo: for(int andar=0; andar<nAndares; andar++) {
			for(int entrada=0; entrada<nEntradas; entrada++) {
				if(predio[andar][entrada].equals(nome)) {
					System.out.println("Andar " + andar + ", entrada " + entrada);
					encontrado = true;
					break tudo;
				}
			}
		}
		
		if(!encontrado) {
			System.out.println("Não existe");
		}
		

	}

}
