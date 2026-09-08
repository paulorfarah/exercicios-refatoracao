package refatoracoes.simplificar;

public class PreserveWholeObject {
    public PreserveWholeObject(DaysTempRange daysTempRange, Plan plan) {
        boolean withinPlan = plan.withinRange(daysTempRange);
    }

    public class DaysTempRange {
        int daysMin = 0;
        int daysMax = 010;

        public int getLow() {
            return daysMin;
        }

        public int getHigh() {
            return daysMax;
        }
    }

    public class Plan {
        public boolean withinRange(DaysTempRange daysTempRange) {
            int low = daysTempRange.getLow();
            int high = daysTempRange.getHigh();
            return false;
        }
    }
}
