package refatoracoes.generalizacao;
public abstract class SuperClass {
	private float saldo;

	public abstract void publicMethod();

	public float getSaldo() {
		return this.saldo;
	}
}

public class PushDownMethod extends SuperClass {

	public void publicMethod() {
		System.out.println("PushDownMethod");
	}

	public void consertarMoto() {
		System.out.println("Vrum vrum");
	}
}
