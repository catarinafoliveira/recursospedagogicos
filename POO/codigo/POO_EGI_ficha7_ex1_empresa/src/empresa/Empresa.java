package empresa;
import java.util.ArrayList;
import java.util.Objects;

public class Empresa {
	private String nome;
	private String nif;
	private ArrayList<Colaborador> colaboradores;
	
	private static final String NOME_OMISSAO = "Não definido";
	private static final String NIF_OMISSAO = "000000000";
	
	public Empresa() {
		this.nome = NOME_OMISSAO;
		this.nif = NIF_OMISSAO;
		this.colaboradores = new ArrayList<>();
	}
	
	public Empresa(String nome, String nif) {
		this.nome = nome;
		this.nif = nif;
		this.colaboradores = new ArrayList<>();
	}
	
	public Empresa(Empresa e) {
		this.nome = e.nome;
		this.nif = e.nif;
		this.colaboradores = new ArrayList<>();
		for(Colaborador c: e.colaboradores) {
			if(c instanceof ColaboradorHora) {
				ColaboradorHora ch = (ColaboradorHora)c;
				this.colaboradores.add(new ColaboradorHora(ch));
			} else {
				ColaboradorComissao cc = (ColaboradorComissao)c;
				this.colaboradores.add(new ColaboradorComissao(cc));
			}
		}
	}
	
	public Empresa clone() {
		return new Empresa (this);
	}

	public String getNome() {
		return nome;
	}

	public String getNif() {
		return nif;
	}

	public ArrayList<Colaborador> getColaboradores() {
		return colaboradores;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public void setColaboradores(ArrayList<Colaborador> colaboradores) {
		this.colaboradores = colaboradores;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if(!this.nif.equals(other.nif) || !this.nome.equals(other.nif)) {
			return false;
		}
		for(Colaborador c: this.colaboradores) {
			if(!other.colaboradores.contains(c)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		String descricao =  "Empresa [nome=" + nome + ", nif=" + nif + "], com colaboradores:\n";
		for(Colaborador c: this.colaboradores) {
			descricao += c + "\n";
		}
		return descricao;
	}
	
	public void adicionarColaborador(Colaborador c) {
		this.colaboradores.add(c);
	}
	
	public String mostrarColaboradoresEVencimentos() {
		String resultado = "";
		for(Colaborador c: this.colaboradores) {
			resultado += c + " - vencimento: " + c.calcularVencimento() + "€\n";
		}
		return resultado;
	}
	
	public String mostrarColaboradoresComissao() {
		String resultado = "";
		for(Colaborador c: this.colaboradores) {
			if(c instanceof ColaboradorComissao) {
				resultado += c + "\n";
			}
		}
		return resultado;
	}
	
	public String mostrarColaboradoresHora() {
		String resultado = "";
		for(Colaborador c: this.colaboradores) {
			if(c instanceof ColaboradorHora) {
				resultado += c + "\n";
			}
		}
		return resultado;
	}
}
