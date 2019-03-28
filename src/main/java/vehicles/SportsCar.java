package vehicles;

public class SportsCar extends Car {

    public SportsCar(int doors, int wheels, boolean steeringWheel){
        super(doors, wheels, steeringWheel);
    }
    @Override
    public String iCan(){
        return "I can be very fancy on the inside and the out! Ohhh la la.";
    }

    @Override
    public String toString() {
        return "SportsCar{}" +
                " doors = " + getDoors() +
                ", steeringWheel = " + getSteeringWheel() +
                ", wheels = " + getWheels() +
                '}';
    }
}
