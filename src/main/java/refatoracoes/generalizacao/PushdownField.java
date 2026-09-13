package refatoracoes.generalizacao;

public class PushdownField extends SuperClass{

	public void publicMethod() {
		System.out.println("PushdownField");
	}

	private float fuel;
	
	public float getFuel() {
		return this.fuel;
	}

}
