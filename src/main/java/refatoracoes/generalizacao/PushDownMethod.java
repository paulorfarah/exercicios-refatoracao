package refatoracoes.generalizacao;

public class PushDownMethod extends SuperClass {
	private float fuel;

	public void publicMethod() {
		System.out.println("PushDownMethod");
		
	}

	@Override
	public float getFuel() {
		return this.fuel;
	}

}
