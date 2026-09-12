package refatoracoes.simplificar;

public class PreserveWholeObject {

    public PreserveWholeObject(DaysTempRange daysTempRange, Plan plan) {

        boolean withinPlan = plan.withinRange(daysTempRange);
    }
}