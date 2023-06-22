package escola;

public class Aluno extends Pessoa{
	private String curso;
	private int ano;
	
	public Aluno(String nome, String nif, String curso, int ano) {
		super(nome, nif);
		this.curso = curso;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return super.toString() + " - Aluno [curso=" + curso + ", ano=" + ano + "]";
	}
	
	
}
