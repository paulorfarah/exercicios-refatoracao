package refatoracoes.composicao;

public class ReplaceTempWithQuery {
	double calculateTotal(int quantity, double itemPrice) {
		  if (PrecoBase(quantity, itemPrice) > 1000) {
		    return PrecoBase(quantity, itemPrice) * 0.95;
		  }
		  else {
		    return PrecoBase(quantity, itemPrice) * 0.98;
		  }
		}
	double PrecoBase(int quantity, double itemPrice){
		return quantity * itemPrice;
	}
}
