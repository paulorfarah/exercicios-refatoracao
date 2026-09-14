package refatoracoes.simplificar;

public abstract class ReplaceConditionalWithPolymorphism {

	abstract double getSpeed(int numberOfCoconuts, Object voltage, boolean isNailed);

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

class European extends ReplaceConditionalWithPolymorphism {
	@Override
	double getSpeed(int numberOfCoconuts, Object voltage, boolean isNailed) {
		return getBaseSpeed();
	}
}

class African extends ReplaceConditionalWithPolymorphism {
	@Override
	double getSpeed(int numberOfCoconuts, Object voltage, boolean isNailed) {
		return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
	}
}

class NorwegianBlue extends ReplaceConditionalWithPolymorphism {
	@Override
	double getSpeed(int numberOfCoconuts, Object voltage, boolean isNailed) {
		return (isNailed) ? 0 : getBaseSpeed(voltage);
	}
}