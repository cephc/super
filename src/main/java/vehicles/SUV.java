package vehicles;

public class SUV extends Car {

    public SUV(int doors, int wheels, boolean steeringWheel){
        super(doors, wheels, steeringWheel);
    }
    @Override
    public String iCan(){
        return "I can transport you and your 6 kids to school and work! (I can have up to 8 seats!)";
    }
    @Override
    public String toString() {
        return "SUV{}" +
                " doors = " + getDoors() +
                ", steeringWheel = " + getSteeringWheel() +
                ", wheels = " + getWheels() +
                '}';
    }
}

