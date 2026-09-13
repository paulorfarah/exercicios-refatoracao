package refatoracoes.composicao;

public class InlineMethod {
	// ...
	int getRating(int numberOfLateDeliveries) {
		if(numberOfLateDeliveries > 5)
			return 2;
		else
			return 1; 
	}
}
