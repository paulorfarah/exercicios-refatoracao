package refatoracoes.generalizacao;

public abstract class SuperClass {
	private float fuel;
	
	public abstract void publicMethod();
	
	public float getFuel() {
		return this.fuel;
	}
}
