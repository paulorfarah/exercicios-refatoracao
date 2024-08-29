package refatoracoes.simplificar;

public class ReplaceParameterWithExplicitMethod {
	void setValue(String name, int value, int height, int width) {
		  if (name.equals("height")) {
		    height = value;
		    return;
		  }
		  if (name.equals("width")) {
		    width = value;
		    return;
		  }
		  Assert a = new Assert();
		  a.shouldNeverReachHere();
		}
	
	public class Assert {
		public void shouldNeverReachHere() {
			System.out.println("não deveria entrar aqui...");
		}
	}
}
