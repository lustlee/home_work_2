package geektech;

public class Main {

    public static void main(String[] args) {

        createObject("df");
        createObject("wr");
        createObject("rg");

    }

    public static Transformer createObject(String className) {
        switch (className) {
            case "Автобот-Защитник":
                Defender df = new Defender("Автобот-Защитник", 350, "Простой щит автобота");
                df.print();
                return df;
            case "Автобот-Воин":
                Warrior wr = new Warrior("Автобот-Воин", 350, "Простой щит автобота");
                wr.print();
                return wr;
            case "Автобот-Убийца":
                Rogue rg = new Rogue("Автобот-Убийца", 350, "Простой щит автобота");
                rg.print();
                return rg;
            default:
                return null;
        }
    }
}
