package refatoracoes.generalizacao;

public class PushdownField extends SuperClass{

	private String name;

	public void publicMethod() {
		System.out.println("PushdownField");
	}

	public String getName() {
		return this.name;
	}

}
