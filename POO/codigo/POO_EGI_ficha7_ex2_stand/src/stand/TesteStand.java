package stand;

public class TesteStand {

	public static void main(String[] args) {
		AutomovelCombustivel ac1 = new AutomovelCombustivel("toyota", "yaris", "cinzento", 5, 10000, "gasolina", 5, 40, 2.0);
		AutomovelCombustivel ac2 = new AutomovelCombustivel("peugeot", "206", "vermelho", 5, 12000, "gasóleo", 7.5, 45, 2.8);
		AutomovelEletrico ae1 = new AutomovelEletrico("tesla", "x", "preto", 5, 30000, 400, 12);
		AutomovelEletrico ae2 = new AutomovelEletrico("tesla", "s", "amarelo", 2, 50000, 500, 20);
		
		Stand s = new Stand("satand 1", "rua daqui");
		s.adicionarAutomovel(ac1);
		s.adicionarAutomovel(ac2);
		s.adicionarAutomovel(ae1);
		s.adicionarAutomovel(ae2);
		
		System.out.println(s.mostrarAutomoveisEAutonomias());
		System.out.println(s.mostrarAutomoveisCombustivel());
		System.out.println(s.mostrarAutomoveisEletricos());
	}

}
