package refatoracoes.simplificar;

public class NORWEGIAN_BLUE extends BIRD{
    Object voltage;
    boolean isNailed;

    @Override
    double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    double getBaseSpeed(Object voltage) {
        return baseSpeed;
    }
}
