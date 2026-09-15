package refatoracoes.composicao;

public class InlineMethod {

	int getRating(int numberOfLateDeliveries) {
		return numberOfLateDeliveries > 5 ? 2 : 1;
	}
}