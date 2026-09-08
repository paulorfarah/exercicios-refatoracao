package refatoracoes.mover;

public class ExtractClass {
    public int health;
    private final Weapon weapon = new Weapon();

    public int getDamage() {
        return weapon.getDamage();
    }

    public void attack() {
        weapon.attack();
    }

    public static class Weapon {
        private int damage;
        private int weaponStatus;

        public int getDamage() {
            return damage;
        }

        public int getWeaponStatus() {
            return weaponStatus;
        }

        public void attack() {
            // ...
        }
    }
}
