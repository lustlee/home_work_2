package geektech;

public class Main {

    public static void main(String[] args) {

        //Создать Интерфейс SoundProducable (метод callSound())
        //Реализовать класс Dog от Интерфейса SoundProducable
        //В Main классе также распечатать издаваемый звук


        Circle circle = new Circle("Круг",9);
        Square square = new Square("Квадрат",4);
        //System.out.println(circle.getClass().getSimpleName()+" "+circle.perimetr());
        //System.out.println(square.getClass().getSimpleName()+" "+square.perimetr());

        Figure[] figures = new Figure[] {circle, square,
                new Triangle("Треугольник", 4,8,9),
                new Rectangle("Прямоугольник", 5, 9),
                new Circle("Круг 2", 5),
                new Square("Квадрат 2", 8)};

        Dog dog = new Dog("Собака ");
        System.out.println(dog.getClass().getSimpleName()+ " " + dog.draw() + " " + dog.callSound());

        /*for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getName()+" "+figures[i].draw()+" "+
                    figures[i].perimetr());
        }*/

        for (Figure f: figures) {
            System.out.println(f.getName()+" "+f.draw()+" "+f.perimetr());
        }


    }
}
