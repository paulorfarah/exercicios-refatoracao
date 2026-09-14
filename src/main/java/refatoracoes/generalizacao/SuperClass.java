package refatoracoes.generalizacao;

public abstract class SuperClass {

    private float fuel;
    protected float health;

    public abstract void publicMethod();

    public float getFuel() {
        return this.fuel;
    }
}