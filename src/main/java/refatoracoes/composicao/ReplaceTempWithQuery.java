package refatoracoes.composicao;

public class ReplaceTempWithQuery {
	double calculateTotal(int quantity, double itemPrice) {
		  double basePrice = quantity * itemPrice;
		  if (basePrice > 1000) {
		    return basePrice * 0.95;
		  }
		  else {
		    return basePrice * 0.98;
		  }
		}
}
