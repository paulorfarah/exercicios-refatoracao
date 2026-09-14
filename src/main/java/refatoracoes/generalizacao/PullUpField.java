package refatoracoes.generalizacao;

public class PullUpField extends SuperClass {

    public void publicMethod() {
        System.out.println("PullUpField");
    }

    public float getHealth() {
        return this.health;
    }
}