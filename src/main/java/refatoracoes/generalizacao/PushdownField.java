package refatoracoes.generalizacao;

public class PushdownField extends SuperClass{
	protected float fuel;

	public void publicMethod() {
		System.out.println("PushdownField");
	}

	public float getFuel() {
		return this.fuel;
	}

}
