package refatoracoes.simplificar;

public class ReplaceConditionalWithPolymorphism {
    double getSpeed(Bird bird) {
        return bird.getSpeed();
    }

    public abstract static class Bird {
        protected int numberOfCoconuts;
        protected Object voltage;
        protected boolean isNailed;

        public abstract double getSpeed();

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

    public static class EuropeanBird extends Bird {
        @Override
        public double getSpeed() {
            return getBaseSpeed();
        }
    }

    public static class AfricanBird extends Bird {
        @Override
        public double getSpeed() {
            return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
        }
    }

    public static class NorwegianBlueBird extends Bird {
        @Override
        public double getSpeed() {
            return isNailed ? 0 : getBaseSpeed(voltage);
        }
    }
}
