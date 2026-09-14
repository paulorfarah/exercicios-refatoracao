package refatoracoes.simplificar;

import java.util.Date;

public class DecomposeConditional {

    private static final Date SUMMER_START = null;

    private static final Date SUMMER_END = null;

    public DecomposeConditional(Date date, int quantity, float winterRate,
                                float winterServiceCharge, int summerRate) {

        float charge;

        if (isWinter(date)) {
            charge = calculateWinterCharge(quantity, winterRate, winterServiceCharge);
        } else {
            charge = calculateSummerCharge(quantity, summerRate);
        }

    }

    private boolean isWinter(Date date) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }

    private float calculateWinterCharge(int quantity, float winterRate,
                                        float winterServiceCharge) {
        return quantity * winterRate + winterServiceCharge;
    }

    private float calculateSummerCharge(int quantity, int summerRate) {
        return quantity * summerRate;
    }

}