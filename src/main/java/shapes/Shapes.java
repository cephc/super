package shapes;

public class Shapes {

    private String names;
    private int sides;
    //constructor
    public Shapes() {
    }
    public Shapes(String names, int sides) {
        this.names = names;
        this.sides = sides;
    }
    //method
    public String learn(){
        return "We learn all of the shapes in kindergarten.";
    }
    //setter
    public void setSides(int sides){
        this.sides = sides;
    }
    public void setNames(){
        this.names = names;
    }
    //getters
    public int getSides(){
        return this.sides;
    }
    public String getNames(){
        return this.names;
    }
    @Override
    public String toString() {
        return "shapes{" +
                "names='" + names + '\'' +
                ", sides=" + sides +
                '}';
    }
}
