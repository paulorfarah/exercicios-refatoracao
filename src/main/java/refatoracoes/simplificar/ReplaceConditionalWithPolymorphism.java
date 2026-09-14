package refatoracoes.simplificar;

public abstract class ReplaceConditionalWithPolymorphism {

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

    public static class European extends ReplaceConditionalWithPolymorphism {

        @Override
        public double getSpeed() {
            return getBaseSpeed();
        }
    }

    public static class African extends ReplaceConditionalWithPolymorphism {

        private int numberOfCoconuts;

        public African(int numberOfCoconuts) {
            this.numberOfCoconuts = numberOfCoconuts;
        }

        @Override
        public double getSpeed() {
            return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
        }
    }

    public static class NorwegianBlue extends ReplaceConditionalWithPolymorphism {

        private Object voltage;
        private boolean isNailed;

        public NorwegianBlue(Object voltage, boolean isNailed) {
            this.voltage = voltage;
            this.isNailed = isNailed;
        }

        @Override
        public double getSpeed() {
            return isNailed ? 0 : getBaseSpeed(voltage);
        }
    }
}