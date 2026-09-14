package refatoracoes.generalizacao;

public abstract class SuperClass {

	protected float health;
	protected float fuel;
	
	public abstract void publicMethod();

	public float getHealth() {
		return this.health;
	}

}
