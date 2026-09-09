package refatoracoes.generalizacao;

public abstract class SuperClass {
	private float fuel;
	protected float energia;

	public abstract void publicMethod();

	public float getFuel() {
		return this.fuel;
	}
}

class PullUpField extends SuperClass {

	public void publicMethod() {
		System.out.println("PullUpField");
	}

	public float getEnergia() {
		return this.energia;
	}
}
