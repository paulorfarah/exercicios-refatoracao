package refatoracoes.generalizacao;

public class PushDownMethod extends SuperClass {

	private float fuel;

	@Override 
	public void publicMethod() {
		System.out.println("PushDownMethod");	
	}

	public float getFuel() {
		return this.fuel;
	}

}
