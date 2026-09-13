package refatoracoes.mover;

public class ExtractClass {
	public int health;
	  public int getDamage() {
		Arma arma = new Arma();
		return arma.getDamage();
	  }
	  public void attack() {
	   // ...
	  }
}

public class Arma {
	private int damage;
	private int weaponStatus;
	private int getDamage() {
		return damage;
	}
}
