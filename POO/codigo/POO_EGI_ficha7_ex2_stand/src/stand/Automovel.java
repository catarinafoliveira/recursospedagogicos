package stand;

import java.util.Objects;

public abstract class Automovel {
	private String marca;
	private String modelo;
	private String cor;
	private int nrPortas;
	private double preco;

	public static final String MARCA_OMISSAO = "Não definido";
	public static final String MODELO_OMISSAO = "Não definido";
	public static final String COR_OMISSAO = "Não definido";
	public static final int NR_PORTAS_OMISSAO = 0;
	public static final double PRECO_OMISSAO = 0;
	
	public Automovel() {
		this.marca = MARCA_OMISSAO;
		this.modelo = MODELO_OMISSAO;
		this.cor = COR_OMISSAO;
		this.nrPortas = NR_PORTAS_OMISSAO;
		this.preco = PRECO_OMISSAO;
	}

	public Automovel(String marca, String modelo, String cor, int nrPortas, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.nrPortas = nrPortas;
		this.preco = preco;
	}
	
	public Automovel(Automovel a) {
		this.marca = a.marca;
		this.modelo = a.modelo;
		this.cor = a.cor;
		this.nrPortas = a.nrPortas;
		this.preco = a.preco;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public int getNrPortas() {
		return nrPortas;
	}

	public double getPreco() {
		return preco;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setNrPortas(int nrPortas) {
		this.nrPortas = nrPortas;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Automovel other = (Automovel) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(marca, other.marca)
				&& Objects.equals(modelo, other.modelo) && nrPortas == other.nrPortas
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}

	@Override
	public String toString() {
		return "Automovel [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", nrPortas=" + nrPortas
				+ ", preco=" + preco + "]";
	}

	public abstract double calcularAutonomia();
}
