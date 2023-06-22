package figuras;

import java.util.ArrayList;

/**
 * Representa uma figura
 * @author Catarina
 *
 */
public class Figura {
	/**
	 * O nome da figura
	 */
	private String nome;
	
	/**
	 * A lista de vértices da figura
	 */
	private ArrayList<Ponto> vertices;
	
	/**
	 * O nome de uma figura por omissão
	 */
	private static final String NOME_OMISSAO = "Não definido";
	
	/**
	 * Constroi uma figura com valor por omissão para o nome e cria uma nova lista de vértices vazia
	 */
	public Figura() {
		this.nome = NOME_OMISSAO;
		this.vertices = new ArrayList<Ponto>();
	}
	
	/**
	 * Constroi uma figura com um nome e cria uma nova lista de vértices vazia
	 * @param nome O nome da figura
	 */
	public Figura(String nome) {
		this.nome = nome;
		this.vertices = new ArrayList<Ponto>();
	}
	
	/**
	 * Constroi uma figura por cópia de outra figura
	 * @param f A figura a copiar
	 */
	public Figura(Figura f) {
		this.nome = f.nome;
		this.vertices = new ArrayList<Ponto>();
		for(Ponto v: f.vertices) {
			this.vertices.add(new Ponto(v));
		}
	}
	
	/**
	 * Clona uma figura
	 */
	public Figura clone() {
		return new Figura(this);
	}
	
	/** 
	 * Devolve o nome da figura
	 * @return O nome da figura
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Devolve uma lista de vértices da figura
	 * @return A lista de vértices da figura
	 */
	public ArrayList<Ponto> getVertices() {
		ArrayList<Ponto> novos = new ArrayList<>();
		for(Ponto v: this.vertices) {
			novos.add(new Ponto(v));
		}
		return novos;
	}

	/**
	 * Redefine o nome da figura
	 * @param nome O nome a ser definido
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Redefine a lista de vértices da figura
	 * @param vertices A lista de vértices a utilizar
	 */
	public void setVertices(ArrayList<Ponto> vertices) {
		this.vertices = new ArrayList<Ponto>();
		for(Ponto v: vertices) {
			this.vertices.add(new Ponto(v));
		}
	}

	@Override
	/**
	 * Determina se a figura é igual a outro objeto
	 * @return true caso sejam iguais e false caso contrário
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		if(!this.nome.equals(other.nome)) {
			return false;
		}
		for(Ponto p: this.vertices) {
			if(!other.vertices.contains(p)) {
				return false;
			}
		}
		return true;
	}

	@Override
	/**
	 * Retorna a descrição textual da figura
	 */
	public String toString() {
		String descricao = "Figura " + this.nome +" com vertices:";
		for(Ponto p: this.vertices) {
			descricao += "\n- " + p;
		}
		return descricao;
	}
	
	/**
	 * Adiciona um vértice à figura
	 * @param v O vértice a adicionar
	 */
	public void adicionarVertice(Ponto v) {
		this.vertices.add(new Ponto(v));
	}
}
