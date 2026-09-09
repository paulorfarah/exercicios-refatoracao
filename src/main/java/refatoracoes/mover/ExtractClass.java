package refatoracoes.mover;

public class ExtractClass {
	public int health;
	private Weapon weapon = new Weapon();

	public int getDamage() {
		return weapon.getDamage();
	}

	public void attack() {
		// ...
	}
}

class Weapon {
	public int damage;
	public int weaponStatus;

	public int getDamage() {
		return damage;
	}
}