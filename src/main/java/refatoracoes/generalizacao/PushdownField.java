package refatoracoes.generalizacao;

public class PushdownField extends SuperClass{

	private float fuel;

	@Override
	public void publicMethod() {
		System.out.println("PushdownField");
	}

	public float getFuel() {
		return this.fuel;
	}

}
