package refatoracoes.generalizacao;

public class PushDownMethod extends SuperClass {

	private float health;

	public void publicMethod() {
		System.out.println("PushDownMethod");
		
	}

	public float getHealth() {
		return this.health;
	}
}
