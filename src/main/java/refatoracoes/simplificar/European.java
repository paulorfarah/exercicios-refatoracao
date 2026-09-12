package refatoracoes.simplificar;

public class European extends Region {

    public European() {}

    @Override
    public double getSpeed(int numberCoconuts, boolean isNailed) {
        return this.getBaseSpeed();
    }

    @Override 
    public double getBaseSpeed() {
        return 0;
    }
}