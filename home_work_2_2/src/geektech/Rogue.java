package geektech;

public class Rogue extends Transformer {
    private String grid;

    public void setGrid(String grid){
        this.grid = grid;
    }

    public Rogue(String name, int health, String grid){
        super.setName(name);
        super.setHealth(health);
        this.grid = grid;
    }

    @Override
    public String print() {
        return super.print() + "Grid: " + grid;
    }

}
