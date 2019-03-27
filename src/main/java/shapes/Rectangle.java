package shapes;

public class Rectangle extends Shapes {

    private int degrees;
    //constructors
    public Rectangle(){
    }
    public Rectangle(String names, int sides, int degrees){
        super(names, sides);
        this.degrees = degrees;
    }
    //methods
    @Override
    public String learn(){
        return "We learn about the shape " + getNames() + " in geometry class in high school.";
    }




}
