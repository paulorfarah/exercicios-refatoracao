package refatoracoes.generalizacao;

public class PushDownMethod extends SuperClass {

	public void publicMethod() {
		System.out.println("PushDownMethod");
		
	}

	private float fuel;
	
	public float getFuel() {
		return this.fuel;
	}

}
