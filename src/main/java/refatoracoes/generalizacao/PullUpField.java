package refatoracoes.generalizacao;

public class PullUpField extends SuperClass {
	
	private float health;

	public void publicMethod() {
		System.out.println("PullUpField");	
	}
	
	public float getHealth() {
		return this.health;
	}

}
