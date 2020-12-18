package geektech;

public class Rectangle extends geektech.Figure implements Drawable {

    private int a;
    private int b;

    public Rectangle(String name, int a, int b) {
        super.setName(name);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int perimetr() {
        return 2*(a+b);
    }

    @Override
    public String draw() {
        return "🟥🟥";
    }
}
