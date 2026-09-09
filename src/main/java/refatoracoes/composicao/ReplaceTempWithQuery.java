package refatoracoes.composicao;

public class ReplaceTempWithQuery {
	double calculateTotal(int quantity, double itemPrice) {
		  double basePrice = quantity * itemPrice;
                  return basePrice > 1000 ? basePrice * 0.95 : basePrice * 0.98;                  
		}
}
