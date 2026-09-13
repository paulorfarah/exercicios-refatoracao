package refatoracoes.simplificar;

public class ReplaceConditionalWithPolymorphism {
	// ...
	public abstract class Bird {
		public abstract double getSpeed();
	}

	public class EuropeanBird extends Bird {
		@Override
		public double getSpeed() {
			return getBaseSpeed();
		}

		private double getBaseSpeed() {
			return 10;
		}
	}

	public class AfricanBird extends Bird {
		private int numberOfCoconuts;

		public AfricanBird(int numberOfCoconuts){
			this.numberOfCoconuts = numberOfCoconuts;
		}

		@Override
		public double getSpeed() {
			return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
		}

		private double getBaseSpeed(){
			return 10;
		}

		private int getLoadFactor(){
			return 2;
		}
	}

	public class NorwegianBlueBird extends Bird {

		private Object voltage;
		private boolean isNailed;

		public NorwegianBlueBird(Object voltage, boolean isNailed) {
			this.voltage = voltage;
			this.isNailed = isNailed;
		}

		@Override
		public double getSpeed() {
			if(isNailed)
				return 0;
			else
				return getBaseSpeed(voltage);
		}

		private double getBaseSpeed(Object voltage) {
			return 10;
		}
	}

}

