package vehicles;

public class Vehicle {
    private int doors;
    private boolean steeringWheel;
    private int wheels;

    public Vehicle(){
    }
    public Vehicle(int doors, int wheels, boolean steeringWheel){
        this.doors = doors;
        this.steeringWheel = steeringWheel;
        this.wheels = wheels;
    }
    public String iCan(){
        return "I can get you from point A to point B";
    }
    public void setDoors(int doors){
        this.doors = doors;
    }
    public void setSteeringWheel(boolean steeringWheel){
        this.steeringWheel = steeringWheel;
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public int getDoors(){
        return this.doors;
    }
    public int getWheels(){
        return this.wheels;
    }
    public boolean getSteeringWheel(){
        return this.steeringWheel;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "doors=" + doors +
                ", steeringWheel=" + steeringWheel +
                ", wheels=" + wheels +
                '}';
    }
}
