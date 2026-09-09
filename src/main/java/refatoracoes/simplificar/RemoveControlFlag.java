package refatoracoes.simplificar;

import java.util.List;

public class RemoveControlFlag {

	public RemoveControlFlag(List<String> pessoas, String nome) {
		boolean achou = encontrou(pessoas, nome);
	}

	private boolean encontrou(List<String> pessoas, String nome) {
		for (String pessoa : pessoas) {
			if (pessoa.equals(nome)) {
				return true;
			}
		}
		return false;
	}
}