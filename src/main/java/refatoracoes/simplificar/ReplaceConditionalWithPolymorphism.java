package refatoracoes.simplificar;

public class ReplaceConditionalWithPolymorphism {
	private static final int EUROPEAN = 0;
	private static final int AFRICAN = 1;
	private static final int NORWEGIAN_BLUE = 2;

	abstract class Bird {
		public abstract double getSpeed();

		private double getBaseSpeed() {
			// TODO Auto-generated method stub
			return 0;
		}

		private double getBaseSpeed(Object voltage) {
			// TODO Auto-generated method stub
			return 0;
		}

		private int getLoadFactor() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	public class European extends Bird {
		public double getSpeed() { return super.getBaseSpeed(); }
	}

	public class African extends Bird {
		private int numberOfCoconuts;

		public double getSpeed() { return super.getBaseSpeed() - super.getLoadFactor() * numberOfCoconuts; }
	}

	public class Norwegian extends Bird {
		private Object voltage;
		private boolean isNailed;

		public double getSpeed() { return (isNailed) ? 0 : super.getBaseSpeed(voltage); }
	}

	// ...
	double getSpeed(Bird bird) { return bird.getSpeed(); }
}
