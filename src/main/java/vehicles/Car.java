package vehicles;

public class Car extends Vehicle {

    public Car(){
    }
    public Car(int doors, int wheels, boolean steeringWheel){
        super(doors, wheels, steeringWheel);
    }
    @Override
    public String iCan(){
        return super.iCan();
    }

    @Override
    public String toString() {
        return "Car{" +
                    " doors = " + getDoors() +
                    ", steeringWheel = " + getSteeringWheel() +
                    ", wheels = " + getWheels() +
                    '}';
    }
}