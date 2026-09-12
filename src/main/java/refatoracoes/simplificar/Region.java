package refatoracoes.simplificar;

public abstract class Region {
    
    public Region() {}

    public abstract double getSpeed(int numberCoconuts, boolean isNailed);

    public abstract double getBaseSpeed();

}