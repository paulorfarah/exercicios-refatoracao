package refatoracoes.mover;

public class ExtractClass {
	public int health;
	private Weapon weapon;

	public int getDamage() {
		return weapon.getDamage();
	}

	public void attack() {
	   weapon.attack();
	}
}
