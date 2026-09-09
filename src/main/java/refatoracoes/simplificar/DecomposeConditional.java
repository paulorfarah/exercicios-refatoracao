package refatoracoes.simplificar;

import java.util.Date;

public class DecomposeConditional {
	private static final Date SUMMER_START = null;
	private static final Date SUMMER_END = null;

	public DecomposeConditional(Date date, int quantity, float winterRate, float winterServiceCharge, int summerRate) {
		float charge;
		if (isSummer(date)) {
			charge = quantity * summerRate;
		} else {
			charge = quantity * winterRate + winterServiceCharge;
		}
	}

	private boolean isSummer(Date date) {
		return !date.before(SUMMER_START) && !date.after(SUMMER_END);
	}
}
