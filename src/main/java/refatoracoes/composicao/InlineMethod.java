package refatoracoes.composicao;

public class InlineMethod {
	
	public int getRating(int numberOfLateDeliveries) {
		return numberOfLateDeliveries > 5 ? 2 : 1;
	}
}
