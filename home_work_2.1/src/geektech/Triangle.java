package geektech;

public class Triangle extends geektech.Figure implements Drawable {

    private int a;
    private int b;
    private int c;

    public Triangle(String name, int a, int b, int c) {
        super.setName(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int perimetr(){
        return a+b+c;
    }

    @Override
    public String draw() {
        return "🔻";
    }
}
