package refatoracoes.composicao;

public class ReplaceTempWithQuery {

	double calculateTotal(int quantity, double itemPrice) {
		if (basePrice(quantity, itemPrice) > 1000) {
			return basePrice(quantity, itemPrice) * 0.95;
		}
		else {
			return basePrice(quantity, itemPrice) * 0.98;
		}
	}

	private double basePrice(int quantity, double itemPrice) {
		return quantity * itemPrice;
	}
}
