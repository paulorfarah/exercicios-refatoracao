package refatoracoes.simplificar;

public class ReplaceConditionalWithPolymorphism {
	public abstract class Bird {

		public abstract double getSpeed(
				int numberOfCoconuts,
				Object voltage,
				boolean isNailed
		);

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

	public class EuropeanBird extends Bird {

		@Override
		public double getSpeed(
				int numberOfCoconuts,
				Object voltage,
				boolean isNailed) {

			return getBaseSpeed();
		}
	}

	public class AfricanBird extends Bird {

		@Override
		public double getSpeed(
				int numberOfCoconuts,
				Object voltage,
				boolean isNailed) {

			return getBaseSpeed()
					- getLoadFactor() * numberOfCoconuts;
		}
	}

	public class NorwegianBlueBird extends Bird {

		@Override
		public double getSpeed(
				int numberOfCoconuts,
				Object voltage,
				boolean isNailed) {

			return isNailed ? 0 : getBaseSpeed(voltage);
		}
	}
}
