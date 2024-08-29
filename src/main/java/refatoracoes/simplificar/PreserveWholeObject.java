package refatoracoes.simplificar;

public class PreserveWholeObject {

	public PreserveWholeObject(DaysTempRange daysTempRange, Plan plan) {
		int low = daysTempRange.getLow();
		int high = daysTempRange.getHigh();
		boolean withinPlan = plan.withinRange(low, high);
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

		public boolean withinRange(int low, int high) {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
}
