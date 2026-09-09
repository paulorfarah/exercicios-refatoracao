package refatoracoes.simplificar;

public class PreserveWholeObject {

	public PreserveWholeObject(DaysTempRange daysTempRange, Plan plan) {
		boolean withinPlan = plan.withinRange(daysTempRange);
	}

	public class DaysTempRange {
		int daysMin = 0;
		int daysMax = 010;

		public int getLow() {
			return this.daysMin;
		}

		public int getHigh() {
			return this.daysMax;
		}
	}

	public class Plan {
		public boolean withinRange(DaysTempRange range) {
			return range.getLow() >= 0 && range.getHigh() <= 100;
		}
	}
}