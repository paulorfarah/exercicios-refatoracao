package refatoracoes.composicao;

public class ReplaceTempWithQuery {
	double calculateTotal(int quantity, double itemPrice) {
		if (getBasePrice(quantity, itemPrice) > 1000) {
			return getBasePrice(quantity, itemPrice) * 0.95;
		} else {
			return getBasePrice(quantity, itemPrice) * 0.98;
		}
	}
	private double getBasePrice(int quantity, double itemPrice) {
		return quantity * itemPrice;
	}
}
