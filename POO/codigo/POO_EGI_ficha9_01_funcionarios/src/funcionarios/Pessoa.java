package funcionarios;

public class Pessoa implements Comparable<Pessoa>{
	private String nome;
	private String nif;
	private int idade;

	public Pessoa() {
		this.nome = "Não definido";
		this.nif = "000000000";
		this.idade = 0;
	}

	public Pessoa(String nome, String nif, int idade) {
		this.nome = nome;
		this.nif = nif;
		this.idade = idade;
	}

	public Pessoa(Pessoa p) {
		this.nome = p.nome;
		this.nif = p.nif;
		this.idade = p.idade;
	}

	public String getNome() {
		return nome;
	}

	public String getNif() {
		return nif;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return this.nif.equals(other.nif) 
				&& this.nome.equals(other.nome)
				&& this.idade == other.idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nif=" + nif + ", idade=" + idade + "]";
	}

	@Override
	public int compareTo(Pessoa o) {		
		return this.nome.compareTo(o.nome);
	}
}
