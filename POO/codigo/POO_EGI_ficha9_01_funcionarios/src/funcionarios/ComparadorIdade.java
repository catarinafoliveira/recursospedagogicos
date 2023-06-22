package funcionarios;

import java.util.Comparator;

public class ComparadorIdade implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		if(o1.getIdade() > o2.getIdade())
			return 1;
		if(o1.getIdade() < o2.getIdade())
			return -1;
		return 0;
	}

}
