package refatoracoes.simplificar;

import java.util.List;

public class RemoveControlFlag {

	public boolean RemoveControlFlag(List<String> pessoas, String nome) {
		for (String pessoa : pessoas) {
				if (pessoa.equals(nome)) {
					return true;
				}
		}
		return false;
	}
}
