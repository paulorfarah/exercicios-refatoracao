package refatoracoes.generalizacao;

public abstract class SuperClass {
	private float fuel;
	private float health;
	
	public abstract void publicMethod();
	
	public float getFuel() {
		return this.fuel;
	}
	public float getHealth() {
		return this.health;
	}
}
