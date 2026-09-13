package refatoracoes.generalizacao;

public abstract class SuperClass {
	private float health;
	
	public abstract void publicMethod();

	public float getHealth() {
		return this.health;
	}
}
