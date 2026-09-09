package refatoracoes.generalizacao;

public abstract class SuperClass {
	private float fuel;
	protected float energia;

	public abstract void publicMethod();

	public float getFuel() {
		return this.fuel;
	}

	public float getEnergia() {
		return this.energia;
	}
}

class PullUpMethod extends SuperClass {

	public void publicMethod() {
		System.out.println("PullUpMethod");
	}
}