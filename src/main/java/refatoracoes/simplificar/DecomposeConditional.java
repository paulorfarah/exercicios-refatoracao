package refatoracoes.simplificar;

import java.util.Date;

public class DecomposeConditional {
	private static final Date SUMMER_START = null;
	private static final Date SUMMER_END = null;

	public boolean isSummer(Date date) {
		return !date.before(SUMMER_START) && !date.after(SUMMER_END);
	}

	public DecomposeConditional(Date date, int quantity, float winterRate, float winterServiceCharge, int summerRate) {
		float charge;
		if (!(isSummer(date))) {
			charge = winterCharge(quantity,winterRate,winterServiceCharge);
		}
		else {
			charge = summerCharge(quantity,summerRate);
		}
	}

	public float winterCharge (int quantity, float winterRate, float winterServiceCharge) {
		return quantity * winterRate + winterServiceCharge;
	}

	public float summerCharge (int quantity, float summerRate) {
		return quantity * summerRate;
	}
}
