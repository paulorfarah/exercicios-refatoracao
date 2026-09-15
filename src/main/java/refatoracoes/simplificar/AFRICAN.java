package refatoracoes.simplificar;

public class AFRICAN extends BIRD{
    int loadFactor;
    int numberOfCoconuts;
    @Override
    double getSpeed() {
        return getBaseSpeed() - getLoadFactor()*getNumberOfCoconuts();
    }

    int getLoadFactor() {return 0;}
    int getNumberOfCoconuts() {return 0;}
}
