package poo_egi_circulo;

/**
 * Representa um ponto
 * 
 * @author Nome_do_autor
 *
 */
public class Ponto {
	
	/**
	 * A abcissa do ponto
	 */
    private double x;
    
    /**
     * A ordenada do ponto
     */
    private double y;

    /**
     * O numero de pontos criados
     */
    private static int nrPontos = 0;

    /**
     * A abcissa por omissao
     */
    private static final double ABCISSA_OMISSAO = 0.0;
    
    /**
     * A ordenada por omissao
     */
    private static final double ORDENADA_OMISSAO = 0.0;

    /**
     * Constroi uma instancia de Ponto por omissao
     */
    public Ponto() {
        this.x = ABCISSA_OMISSAO;
        this.y = ORDENADA_OMISSAO;
        nrPontos++;
    }

    /**
     * Constroi uma instancia de Ponto recebendo a abcissa e a ordenada
     * @param x A abcissa do ponto
     * @param y A ordenada do ponto
     */
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
        nrPontos++;
    }

    /**
     * Constroi uma instancia de Ponto recebendo a abcissa e preenchendo a ordenada por omissao
     * @param x A abcissa do ponto
     */
    public Ponto(double x) {
        this.x = x;
        this.y = ORDENADA_OMISSAO;
        nrPontos++;
    }

    /**
     * Constroi uma instancia de Ponto por cópia de outro ponto
     * @param p O Ponto a copiar
     */
    public Ponto(Ponto p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    /**
     * Devolve a abcissa do ponto
     * @return A abcissa do ponto
     */
    public double getX() {
        return this.x;
    }

    /**
     * Devolve a ordenada do ponto
     * @return A ordenada do ponto
     */
    public double getY() {
        return this.y;
    }

    /**
     * Devolve o numero de pontos criados
     * @return O numero de pontos criados
     */
    public static int getNrPontos() {
        return Ponto.nrPontos;
    }

    /**
     * Modifica a abcissa do ponto
     * @param x A nova abcissa do ponto
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Modifica a ordenada do ponto
     * @param y A nova ordenada do ponto
     */
    public void setY(double y) {
        this.y = y;
    }

    @Override
    /**
     * Determina se o ponto e igual ao ponto passado por parametro
     * 
     * @param O ponto com o qual comparar
     * @return true caso sejam iguais, false caso contrário
     */
    public boolean equals(Object outro) {
        if (this == outro)
            return true;
        if (outro == null || getClass() != outro.getClass())
            return false;
        Ponto outroPonto = (Ponto) outro;
        return x == outroPonto.x && y == outroPonto.y;
    }

    @Override
    /**
     * Devolve a descriçao textual legivel do ponto no formato (x,y)
     * 
     * @return A descriçao textual legivel do ponto no formato (x,y)
     */
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    /**
     * Devolve a distancia Euclidiana entre o ponto a partir do qual o metodo e chamado e o ponto passado por parametro
     * 
     * @param outro O ponto ate ao qual se pretende medir a distancia
     * 
     * @return A distancia Euclidiana entre o ponto a partir do qual o metodo e chamado e o ponto passado por parametro
     */
    public double distanciaEuclideana(Ponto outro) {
        return Math.sqrt(Math.pow(this.x - outro.x, 2) + Math.pow(this.y - outro.y, 2));
    }

    /**
     * Devolve a distancia Euclidiana entre o ponto a partir do qual o metodo e chamado e a origem do referencial
     * 
     * @return A distancia Euclidiana entre o ponto a partir do qual o metodo e chamado e a origem do referencial
     */
    public double distanciaOrigem() {
        return this.distanciaEuclideana(new Ponto());
    }

    /**
     * Devolve a distancia Euclidiana entre dois pontos, definidos pelas coordenadas passadas por parametro
     * 
     * @param x1 A abcissa do primeiro ponto
     * @param x2 A ordenada do primeiro ponto
     * @param y1 A abcissa do segundo ponto
     * @param y2 A ordenada do segundo ponto
     * 
     * @return A distancia Euclidiana entre os dois pontos
     */
    public static double distanciaEuclideana(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    /**
     * Devolve a distancia Euclidiana entre dois pontos passados por parametro
     * 
     * @param a O primeiro ponto
     * @param b O segundo ponto
     * 
     * @return A distancia Euclidiana entre os dois pontos
     */
    public static double distanciaEuclideana(Ponto a, Ponto b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
