package refatoracoes.simplificar;

public class ReplaceConditionalWithPolymorphism {
	private static final int EUROPEAN = 0;
	private static final int AFRICAN = 1;
	private static final int NORWEGIAN_BLUE = 2;

	// ...
	  double getSpeed(int type) {
	    switch (type) {
	      case EUROPEAN:
	        return European.getSpeed();
	      case AFRICAN:
	        return African.getSpeed();
	      case NORWEGIAN_BLUE:
			return NorwegianBlue.getSpeed();
	    }
	    throw new RuntimeException("Should be unreachable");
	  }

	//retirei (int numberOfCoconuts, Object voltage, boolean isNailed) porque nao parecia coerente

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

	class European extends Bird {
  		double getSpeed() {
    		return getBaseSpeed();
  		}
	}
	
	class African extends Bird {
  		double getSpeed() {
    		return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
  		}
	}
	
	class NorwegianBlue extends Bird {
  		double getSpeed() {
    		return (isNailed) ? 0 : getBaseSpeed(voltage);
  		}	
	}

}
