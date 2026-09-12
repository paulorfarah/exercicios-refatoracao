package refatoracoes.generalizacao;

public abstract class SuperClass {
	protected float health;
	
	public abstract void publicMethod();

	public float getHealth() {
		return this.health;
	}

}
