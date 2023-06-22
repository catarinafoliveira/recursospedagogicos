package poo_egi_circulo;

/**
 * Representa um circulo
 * @author Catarina
 *
 */
public class Circulo {
	/**
	 * O centro do círculo
	 */
	private Ponto centro;
	/**
	 * O raio do círculo
	 */
	private double raio;
	
	/**
	 * Constroi um círculo a partir do seu centro e do seu raio
	 * @param centro Um objeto da classe Ponto, correspondente ao centro do círculo
	 * @param raio O raio do círculo
	 */
	public Circulo(Ponto centro, double raio) {
		this.centro = centro;
		this.raio = raio;
	}

	/**
	 * Constroi um círculo a partir das coordenadas do seu centro e do seu raio
	 * @param xCentro A abcissa do centro do círculo
	 * @param yCentro A ordenada do centro do círculo
	 * @param raio O raio do círculo
	 */
	public Circulo(int xCentro, int yCentro, double raio) {
		this.centro = new Ponto(xCentro,yCentro);
		this.raio = raio;
	}
	
	/**
	 * Constroi um círculo por cópia de outro círculo
	 * @param c o Circulo a copiar
	 */
	public Circulo(Circulo c) {
		this.centro = c.centro;
		this.raio = c.raio;
	}
	
	
	
	/** 
	 * Devolve o centro do Circulo
	 * @return O centro do Circulo
	 */
	public Ponto getCentro() {
		return centro;
	}

	/**
	 * Devolve o raio do Circulo
	 * @return O raio do Circulo
	 */
	public double getRaio() {
		return raio;
	}

	/**
	 * Redefine o centro do Circulo
	 * @param centro O novo centro
	 */
	public void setCentro(Ponto centro) {
		this.centro = centro;
	}

	/**
	 * Redefine o raio do Circulo
	 * @param raio o novo raio
	 */
	public void setRaio(double raio) {
		this.raio = raio;
	}

	/**
	 * Devolve a descrição textual de um círculo
	 * @return A descrição textual de um círculo
	 */
	public String toString() {
		return "Círculo com centro em " + this.centro + " e raio de " + this.raio + " cm";
	}

	@Override
	/**
	 * Determina se o círculo é igual a outro objeto
	 * @return true, caso sejam iguais e false caso contrário
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return this.centro.equals(other.centro) && this.raio == other.raio;
	}
	
	/**
	 * Redifine a abcissa do centro do círculo
	 * @param val O novo valor da abcissa do centro do círculo
	 */
	public void redefinirXCentro(double val) {
		this.centro.setX(val);
	}
	
	/**
	 * Redifine a ordenada do centro do círculo
	 * @param val O novo valor da ordenada do centro do círculo
	 */
	public void redefinirYCentro(double val) {
		this.centro.setY(val);
	}
}
