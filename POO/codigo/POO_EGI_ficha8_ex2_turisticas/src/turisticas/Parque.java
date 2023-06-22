package turisticas;

public class Parque extends Atracao{
	private double area;

	public Parque(String nome, String local, double area) {
		super(nome, local);
		this.area = area;
	}

	@Override
	public String toString() {
		return super.toString() + " - Parque [area=" + area + "]";
	}
	
	
}
