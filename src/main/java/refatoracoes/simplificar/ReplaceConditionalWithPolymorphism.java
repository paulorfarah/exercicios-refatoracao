package refatoracoes.simplificar;

public class ReplaceConditionalWithPolymorphism {

	//fazer uma classe base para que as outras descendam dela, usando o polimorfismo
	public abstract class Bird {

		protected int numberOfCoconuts;
		protected Object voltage;
		protected boolean isNailed;

		public abstract double getSpeed();

		protected double getBaseSpeed() {
			// TODO Auto-generated method stub
			return 0;
		}

		protected double getBaseSpeed(Object voltage) {
			// TODO Auto-generated method stub
			return 0;
		}

		protected int getLoadFactor() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	public class European extends Bird {

		@Override
		public double getSpeed() {
			return getBaseSpeed();
		}
	}

	public class African extends Bird {

		@Override
		public double getSpeed() {
			return getBaseSpeed()
					- getLoadFactor() * numberOfCoconuts;
		}
	}

	public class NorwegianBlue extends Bird {

		@Override
		public double getSpeed() {
			return isNailed ? 0 : getBaseSpeed(voltage);
		}
	}
}
