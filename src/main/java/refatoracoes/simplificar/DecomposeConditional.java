package refatoracoes.simplificar;

import java.util.Date;

public class DecomposeConditional {

    private static final Date SUMMER_START = null;
    private static final Date SUMMER_END = null;

    public DecomposeConditional(Date date, int quantity, float winterRate, float winterServiceCharge, int summerRate) {

        float charge;

        if (isWinter(date)) {
            charge = winterCharge(quantity, winterRate, winterServiceCharge);
            return;
        }
        charge = summerCharge(quantity, summerRate);
    }

    private boolean isWinter(Date date) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }

    private float winterCharge(int quantity, float winterRate, float winterServiceCharge) {
        return quantity * winterRate + winterServiceCharge;
    }

    private float summerCharge(int quantity, int summerRate) {
        return quantity * summerRate;
    }
}