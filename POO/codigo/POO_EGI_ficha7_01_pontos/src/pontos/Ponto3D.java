package pontos;

/**
 * Representa um ponto com 3 dimensões, que herda as propriedades de Ponto
 * @author Catarina
 *
 */
public class Ponto3D extends Ponto{
	/**
	 * A cota do ponto
	 */
	private double z;
	
	/**
	 * O valor usado para definir a cota de um ponto
	 */
	private static final double COTA_OMISSAO = 0.0;
	
	/**
	 * Constrói um ponto com 3 dimensões por omissão, chamando o construtor vazio de Ponto
	 */
	public Ponto3D() {
		super();
		this.z = COTA_OMISSAO;
	}
	
	/**
	 * Consroi um ponto 3D a partir dos valores recebidos por parâmetro, chamando o construtor completo de Ponto para inicialização dos atributos x e y
	 * @param x A abcissa do ponto
	 * @param y A ordenada do ponto
	 * @param z A cota do ponto
	 */
	public Ponto3D(double x, double y, double z) {
		super(x,y);
		this.z = z;
	}
	
	/**
	 * constroi um novo ponto, copiando o ponto passado por parâmetro, e chamando o construtor cópia de Ponto para copiar os atributos x e y
	 * @param p O ponto a copiar
	 */
	public Ponto3D(Ponto3D p) {
		super(p);
		this.z = p.z;
	}
	
	/**
	 * Clona um ponto
	 */
	public Ponto3D clone() {
		return new Ponto3D(this);
	}

	/**
	 * Devolve a cota do ponto
	 * @return A cota do ponto
	 */
	public double getZ() {
		return z;
	}

	/**
	 * Redefine a cota do ponto
	 * @param z A nova cota do ponto
	 */
	public void setZ(double z) {
		this.z = z;
	}

	/**
	 * Compara um ponto com outro objeto
	 * @return true caso os objetos sejam iguais e false caso contrário
	 */
	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj)) {
			return false;
		}
		Ponto3D other = (Ponto3D) obj;
		return this.z == other.z;
	}

	/**
	 * Retorna a descrição textual de um ponto 3D recorrendo ao toString da classe Ponto para mostrar a parte correspondente às coordenadas x e y
	 * @return A descrição textual de um ponto 3D
	 */
	@Override
	public String toString() {
		return "Ponto3D [z=" + z + "] (x, y)="+super.toString();
	}
	
	/**
	 * Calcula e devolve a distância euclideana entre o ponto e um outro ponto passado por parâmetro
	 * @param outro O ponto para o qual queremos calcular a distância
	 * @return A distância entre os pontos
	 */
	public double distanciaEuclideana(Ponto3D outro) {
        return Math.sqrt(
        		Math.pow(this.getX() - outro.getX(), 2) 
		        + Math.pow(this.getY() - outro.getY(), 2) 
		        + Math.pow(this.z - outro.z, 2));
    }
}
