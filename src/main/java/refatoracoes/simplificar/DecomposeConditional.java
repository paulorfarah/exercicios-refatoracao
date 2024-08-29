package refatoracoes.simplificar;

import java.util.Date;

public class DecomposeConditional {
	private static final Date SUMMER_START = null;
	private static final Date SUMMER_END = null;

	public DecomposeConditional(Date date, int quantity, float winterRate, float winterServiceCharge, int summerRate) {
		float charge;
		if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
			charge = quantity * winterRate + winterServiceCharge;
		}
		else {
			charge = quantity * summerRate;
		}
	}
}
