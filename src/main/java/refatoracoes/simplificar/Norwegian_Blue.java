package refatoracoes.simplificar;

public class Norwegian_Blue extends Region {
    
    public Norwegian_Blue() {}

    @Override 
    public double getSpeed(int numberCoconuts, boolean isNailed) {
        return isNailed ? 0 : this.getBaseSpeed();
    }

    @Override 
    public double getBaseSpeed() {
        return 0;
    }
}