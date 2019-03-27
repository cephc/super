package shapes;

public class Square extends Shapes {

    private boolean equilateral;
    //constructor
    public Square(){
    }
    public Square(String names, int sides, boolean equilateral){
        super(names, sides);
        this.equilateral = equilateral;
    }
    //method
    @Override
    public String learn(){
        return super.learn();
    }

    @Override
    public String toString() {
        return "Square{" +
                "names='" + super.getNames() + '\'' +
                ", sides=" + super.getSides() +
                ", equilateral=" + equilateral +
                "}";
    }
}
