package refatoracoes.generalizacao;

public class PushDownMethod extends SuperClass {
	protected float fuel;

	public void publicMethod() {System.out.println("PushDownMethod");}

	public float getFuel() {
		return this.fuel;
	}

}
