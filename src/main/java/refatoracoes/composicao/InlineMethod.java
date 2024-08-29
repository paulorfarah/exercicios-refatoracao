package refatoracoes.composicao;

public class InlineMethod {
	// ...
	  int getRating(int numberOfLateDeliveries) {
	    return moreThanFiveLateDeliveries(numberOfLateDeliveries) ? 2 : 1;
	  }
	  boolean moreThanFiveLateDeliveries(int numberOfLateDeliveries) {
	    return numberOfLateDeliveries > 5;
	  }
}
