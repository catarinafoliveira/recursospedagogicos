package stand;

import java.util.ArrayList;
import java.util.Objects;

public class Stand {
	private String nome;
	private String morada;
	private ArrayList<Automovel> automoveis;
	
	public static final String NOME_OMISSAO = "Não definido";
	public static final String MORADA_OMISSAO = "Não definido";
	
	public Stand() {
		this.nome = NOME_OMISSAO;
		this.morada = MORADA_OMISSAO;
		this.automoveis = new ArrayList<>();
	}
	
	public Stand(String nome, String morada) {
		this.nome = nome;
		this.morada = morada;
		this.automoveis = new ArrayList<>();
	}
	
	public Stand(Stand s) {
		this.nome = s.nome;
		this.morada = s.morada;
		this.automoveis = new ArrayList<>();
		for(Automovel a: s.automoveis) {
			this.adicionarAutomovel(a);
		}
	}
	
	public Stand clone() {
		return new Stand(this);
	}

	public String getNome() {
		return nome;
	}

	public String getMorada() {
		return morada;
	}

	public ArrayList<Automovel> getAutomoveis() {
		return automoveis;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public void setAutomoveis(ArrayList<Automovel> automoveis) {
		this.automoveis = automoveis;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Stand other = (Stand) obj;
		if(!this.morada.equals(other.morada) || !this.nome.equals(other.nome)) {
			return false;
		}
		for(Automovel a: this.automoveis) {
			if(!other.automoveis.contains(a)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		String descricao = "Stand [nome=" + nome + ", morada=" + morada + "], com automóveis:\n";
		for(Automovel a: this.automoveis) {
			descricao += a + "\n";
		}
		return descricao;
	}

	public void adicionarAutomovel(Automovel a) {
		this.automoveis.add(a);
	}
	
	public String mostrarAutomoveisEAutonomias() {
		String resultado = "\nAutomóveis e Autonomias\n";
		for(Automovel a: this.automoveis) {
			resultado += a + " - autonomia: " + a.calcularAutonomia() + "km\n";
		}
		return resultado;
	}
	
	public String mostrarAutomoveisEletricos() {
		String resultado = "\nAutomóveis Eletricos\n";
		for(Automovel a: this.automoveis) {
			if(a instanceof AutomovelEletrico) {
				resultado += a + "\n";
			}
		}
		return resultado;
	}
	
	public String mostrarAutomoveisCombustivel() {
		String resultado = "\nAutomóveis Combustível\n";
		for(Automovel a: this.automoveis) {
			if(a instanceof AutomovelCombustivel) {
				resultado += a + "\n";
			}
		}
		return resultado;
	}
}
