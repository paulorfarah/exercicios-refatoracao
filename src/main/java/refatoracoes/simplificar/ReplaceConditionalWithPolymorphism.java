package refatoracoes.simplificar;

public abstract class Bird {

    public abstract double getSpeed();

    protected double getBaseSpeed() {
        return 0;
    }

    protected double getBaseSpeed(Object voltage) {
        return 0;
    }

    protected int getLoadFactor() {
        return 0;
    }
}

class EuropeanBird extends Bird {
    public double getSpeed() {
        return getBaseSpeed();
    }
}

class AfricanBird extends Bird {
    private final int numberOfCoconuts;

    public AfricanBird(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public double getSpeed() {
        return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
    }
}

class NorwegianBlueBird extends Bird {
    private final Object voltage;
    private final boolean isNailed;

    public NorwegianBlueBird(Object voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        return isNailed ? 0 : getBaseSpeed(voltage);
    }
}
