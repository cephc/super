package vehicles;

public class Motorcycle extends Vehicle {

    private String helmet;

    public Motorcycle(){
    }
    public Motorcycle(int doors, int wheels, boolean steeringWheel, String helmet){
        super(doors, wheels, steeringWheel);
        this.helmet = helmet;
    }
    @Override
    public String iCan(){
        return " I can get you where you need to go really fast! Vromm Vrom.";
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                " helmet =' " + helmet + '\'' +
                " doors = " + getDoors() +
                ", steeringWheel = " + getSteeringWheel() +
                ", wheels = " + getWheels() +
                '}';
    }
}
