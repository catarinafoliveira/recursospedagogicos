package mercearia;

public class ProdutoVolume extends Produto {
	private double precoL;
	private String tipoVasilhame;
		
	private static double precoVasilhamePlastico = 0.5;
	private static double precoVasilhameVidro = 1.0;
	
	private static final double PRECOL_OMISSAO = 0.0;
	private static final String VASILHAME_OMISSAO = "Vidro";
	
	public ProdutoVolume() {
		super();
		this.precoL = PRECOL_OMISSAO;
		this.tipoVasilhame = VASILHAME_OMISSAO;
	}

	public ProdutoVolume(String nome, double precoL, String tipoVasilhame) {
		super(nome);
		this.precoL = precoL;
		this.tipoVasilhame = tipoVasilhame;
	}

	public ProdutoVolume(ProdutoVolume pv) {
		super(pv);
		this.precoL = pv.precoL;
		this.tipoVasilhame = pv.tipoVasilhame;
	}

	public ProdutoVolume clone() {
		return new ProdutoVolume(this);
	}
	
	public double getPrecoL() {
		return precoL;
	}

	public String getTipoVasilhame() {
		return tipoVasilhame;
	}

	public static double getPrecoVasilhamePlastico() {
		return precoVasilhamePlastico;
	}

	public static double getPrecoVasilhameVidro() {
		return precoVasilhameVidro;
	}

	public void setPrecoL(double precoL) {
		this.precoL = precoL;
	}

	public void setTipoVasilhame(String tipoVasilhame) {
		this.tipoVasilhame = tipoVasilhame;
	}

	public static void setPrecoVasilhamePlastico(double precoVasilhamePlastico) {
		ProdutoVolume.precoVasilhamePlastico = precoVasilhamePlastico;
	}

	public static void setPrecoVasilhameVidro(double precoVasilhameVidro) {
		ProdutoVolume.precoVasilhameVidro = precoVasilhameVidro;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		ProdutoVolume other = (ProdutoVolume) obj;
		return this.precoL == other.precoL
				&& this.tipoVasilhame.equals(other.tipoVasilhame);
	}
	
	@Override
	public String toString() {
		return super.toString() + " - ProdutoVolume [precoL=" + precoL + ", tipoVasilhame=" + tipoVasilhame + "]";
	}

	@Override
	public double calcularPreco(double quantidade) {
		double precoIntermedio = this.precoL * quantidade;
		if(tipoVasilhame.equalsIgnoreCase("Plastico")) {
			return precoIntermedio + precoVasilhamePlastico;
		} else {
			return precoIntermedio + precoVasilhameVidro;
		}
	}

}
