package refatoracoes.generalizacao;

public class PullUpMethod extends SuperClass {

	private float health;
	
	public void publicMethod() {
		System.out.println("PullUpMethod");		
	}
	
	public float getHealth() {
		return this.health;
	}

}
