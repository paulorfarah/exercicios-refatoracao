package refatoracoes.simplificar;

public class ReplaceConditionalWithPolymorphism {

	double getSpeed(BIRD bird) {
		return bird.getSpeed();
	}
}