package refatoracoes.composicao;

public class ReplaceTempWithQuery {

	public double calculateTotal(int quantity, double itemPrice) {
		  
		double basePrice = quantity * itemPrice;
		if (basePrice > 1000) {
			return basePrice * 0.95;
		}
		return basePrice * 0.98;
	}
}
