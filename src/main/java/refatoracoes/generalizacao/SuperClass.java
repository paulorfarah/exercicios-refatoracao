// Vehicle
package refatoracoes.generalizacao;

public interface Vehicle {
    void publicMethod();
    float getFuel();
}


// SuperClass
package refatoracoes.generalizacao;

public abstract class SuperClass implements Vehicle {

    private float fuel;

    public abstract void publicMethod();

    public float getFuel() {
        return this.fuel;
    }
}
