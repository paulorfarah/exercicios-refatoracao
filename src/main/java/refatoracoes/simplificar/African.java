package refatoracoes.simplificar;

public class African extends Region {
    
    public African() {}

    @Override 
    public double getSpeed(int numberCoconuts, boolean isNailed) {
        return this.getBaseSpeed() - this.getLoadFactor() * numberCoconuts;   
    }

    @Override
    public double getBaseSpeed() {
        return 0;
    }

    public int getLoadFactor() {
        return 0;
    }
}