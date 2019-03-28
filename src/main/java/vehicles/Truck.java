package vehicles;

public class Truck extends Car {

    private String size;

    public Truck(int doors, int wheels, boolean steeringWheel, String size){
        super(doors, wheels, steeringWheel);
        this.size = size;
    }
    @Override
    public String iCan(){
        return "I can be used to transport big items from point A to point B!";
    }

    @Override
    public String toString() {
        return "Truck{" +
                " size =' " + size + '\'' +
                " doors = " + getDoors() +
                ", steeringWheel = " + getSteeringWheel() +
                ", wheels = " + getWheels() +
                '}';
    }
}
