// Weapon
package refatoracoes.mover;

public class Weapon {

    private int damage;
    private int weaponStatus;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getWeaponStatus() {
        return weaponStatus;
    }

    public void setWeaponStatus(int weaponStatus) {
        this.weaponStatus = weaponStatus;
    }
}

// ExtractClass
package refatoracoes.mover;

public class ExtractClass {

    public int health;
    private Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void attack() {
        
    }
}
