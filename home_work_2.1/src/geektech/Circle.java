package geektech;

public class Circle extends geektech.Figure implements Drawable {

    private int radius;

    public Circle(String name, int radius) {
        super.setName(name);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public int perimetr() {
        return (int) (2*Math.PI* radius);
    }

    @Override
    public String draw() {
        return "🔵";
    }


}
