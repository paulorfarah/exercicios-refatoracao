package refatoracoes.mover;

public class ExtractClass {

	public class Person {
		public int health;
		private Weapon weapon;

		public Person() {
			weapon = new Weapon();
		}

		public void attack() {
			weapon.attack();
		}

		public int getDamage() {
			return weapon.getDamage();
		}
	}

	public class Weapon {
		private int damage;
		private int weaponStatus;

		public int getDamage() {
			return damage;
		}

		public void attack() {
			// ...
		}
	}
}
