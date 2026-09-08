package refatoracoes.generalizacao;

public class PushDownMethod extends SuperClass {

	private String status;

	public void publicMethod() {
		System.out.println("PushDownMethod");
	}

	public String getStatus() {
		return this.status;
	}

}
