package refatoracoes.simplificar;

import java.util.List;

public class RemoveControlFlag {

	public RemoveControlFlag(List<String> pessoas, String nome) {
		boolean achou = false;
		
		for (String pessoa : pessoas) {
			if (!achou) {
				if (pessoa.equals(nome)) {
					achou = true;
				}
			}
		}
	}
}
