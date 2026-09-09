package refatoracoes.generalizacao;

public abstract class SuperClass {
	private float fuel;

	public abstract void publicMethod();

	public float getFuel() {
		return this.fuel;
	}
}

class PushdownField extends SuperClass {

	private int quantidadeDeGalinhas;

	public void publicMethod() {
		System.out.println("PushdownField");
	}

	public int getQuantidadeDeGalinhas() {
		return this.quantidadeDeGalinhas;
	}
}