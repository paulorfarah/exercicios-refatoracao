package refatoracoes.simplificar;

public class ReplaceParameterWithExplicitMethod {

    void setHeight(int value, int height) {
        height = value;
    }

    void setWidth(int value, int width) {
        width = value;
    }

    public class Assert {

        public void shouldNeverReachHere() {
            System.out.println("não deveria entrar aqui...");
        }
    }
}