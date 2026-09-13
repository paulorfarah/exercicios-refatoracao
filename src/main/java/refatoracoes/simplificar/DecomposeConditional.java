package refatoracoes.simplificar;

import java.util.Date;

public class DecomposeConditional {
	private static final Date SUMMER_START = null;
	private static final Date SUMMER_END = null;

	public DecomposeConditional(Date date, int quantity, float winterRate, float winterServiceCharge, int summerRate) {
		float charge;
		if (isSummer(date)) {
  			charge = summerCharge(quantity, winterRate, winterServiceCharge);
		}
		else {
  			charge = winterCharge(quantity, summerRate);
		}
	}

	public float summerCharge(int quantity, float winterRate, float winterServiceCharge){
		return quantity * winterRate + winterServiceCharge;
	}

	public float winterCharge(int quantity, int summerRate){
		return quantity * summerRate;
	}
}
