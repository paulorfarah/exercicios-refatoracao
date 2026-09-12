package refatoracoes.simplificar;

public class ReplaceConditionalWithPolymorphism {

	public double getSpeed(Region type, int numberOfCoconuts, Object voltage, boolean isNailed) {
	    return type.getSpeed(numberOfCoconuts, isNailed);
	}
}
