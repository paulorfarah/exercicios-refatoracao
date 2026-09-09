package refatoracoes.composicao;

public class ReplaceTempWithQuery {

    double calculateTotal(int quantity, double itemPrice) {

        if (calculateBasePrice(quantity, itemPrice) > 1000) {
            return calculateBasePrice(quantity, itemPrice) * 0.95;
        } else {
            return calculateBasePrice(quantity, itemPrice) * 0.98;
        }
    }

    private double calculateBasePrice(int quantity, double itemPrice) {
        return quantity * itemPrice;
    }
}
