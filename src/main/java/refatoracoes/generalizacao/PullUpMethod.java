// SuperClass
package refatoracoes.generalizacao;

public class SuperClass {
    protected float health;

    public float getHealth() {
        return this.health;
    }
}

// PullUpMethod
package refatoracoes.generalizacao;

public class PullUpMethod extends SuperClass {

    public void publicMethod() {
        System.out.println("PullUpMethod");
    }
}
