package geektech;

public class Warrior extends Transformer {
    private String weapon;

    public void setWeapon(String weapon){
        this.weapon = weapon;
    }

    public Warrior(String name, int health, String weapon){
        super.setName(name);
        super.setHealth(health);
        this.weapon = weapon;
    }

    @Override
    public String print(){
        return super.print() + "Weapon: " + weapon;
    }
}
