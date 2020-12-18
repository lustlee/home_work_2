package geektech;

public class Transformer implements Printable {

    private String name;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    @Override
    public String print() {
        return "Name: " + name + ", Health: " + health + " ";
    }
}
