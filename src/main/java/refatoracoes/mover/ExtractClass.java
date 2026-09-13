package refatoracoes.mover;

public class ExtractClass {
	public int health;
	public int damage;
	
	public int getDamage() {
	return damage;

	}
	public void attack() {
	// ...
	}

	public class Weapon {
    	public int weaponStatus;
	}
}
