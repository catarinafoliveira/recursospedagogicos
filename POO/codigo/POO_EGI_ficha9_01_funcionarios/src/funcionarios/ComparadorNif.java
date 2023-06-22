package funcionarios;

import java.util.Comparator;

public class ComparadorNif implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getNif().compareTo(o1.getNif());
	}

}
