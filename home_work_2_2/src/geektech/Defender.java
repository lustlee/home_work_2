package geektech;

public class Defender extends Transformer {

    private String armor;

    public void setArmor(String armor){
        this.armor = armor;
    }

    public Defender(String name, int health, String armor) {
        super.setName(name);
        super.setHealth(health);
        this.armor = armor;
    }

    @Override
    public String print() {
        return super.print() + "Armor: " + armor;
    }
}
