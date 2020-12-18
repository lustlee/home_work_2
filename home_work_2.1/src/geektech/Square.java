package geektech;

public class Square extends Figure {

    private int a;

    public Square(String name, int a) {
        super.setName(name);
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public int perimetr() {
        return 4*a;
    }

    @Override
    public String draw() {
        return "🔳";
    }
}
