package refatoracoes.generalizacao;

public abstract class SuperClass {
	protected float health;
	private float fuel;
	protected String name;
	
	public abstract void publicMethod();
	
	public float getFuel() {
		return this.fuel;
	}

	public float getHealth() {
		return this.health;
	}

	public String getStatus() { return ""; }

}
