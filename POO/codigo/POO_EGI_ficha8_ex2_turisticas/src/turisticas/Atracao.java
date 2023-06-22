package turisticas;

public class Atracao {
	public String nome;
	public String local;
	
	public Atracao(String nome, String local) {
		this.nome = nome;
		this.local = local;
	}

	@Override
	public String toString() {
		return "Atracao [nome=" + nome + ", local=" + local + "]";
	}
	
}
