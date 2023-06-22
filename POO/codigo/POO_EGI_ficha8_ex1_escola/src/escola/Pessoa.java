package escola;

public class Pessoa {
	private String nome;
	private String nif;
	
	public Pessoa(String nome, String nif) {
		this.nome = nome;
		this.nif = nif;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nif=" + nif + "]";
	}
}
