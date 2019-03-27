package shapes;

public class Main {
    public static void main(String[] args) {
        Shapes heart = new Shapes("Heart", 0);
        System.out.println(heart);
        System.out.println(heart.learn());
        Square idk = new Square("Square", 4, true);
        System.out.println(idk);
        System.out.println(idk.learn());
        Rectangle whoKnows = new Rectangle("Rectangle", 4, 90);
        System.out.println(whoKnows);
        System.out.println(whoKnows.learn());

    }
}
