package refatoracoes.simplificar;

public class ReplaceParameterWithExplicitMethod {

    private int height;
    private int width;

    public void setHeight(int value) {
        this.height = value;
    }

    public void setWidth(int value) {
        this.width = value;
    }

    public class Assert {
        public void shouldNeverReachHere() {
            System.out.println("não deveria entrar aqui...");
        }
    }
}
