package vehicles;

public class Main {
    public static void main(String[] args) {
        Car hyundai = new Car(4, 4, true);
        System.out.println(hyundai);
        System.out.println(hyundai.iCan() + "\n");

        Motorcycle yamaha = new Motorcycle(0, 2, false, " To drive me, you need a helmet!");
        System.out.println(yamaha);
        System.out.println(yamaha.iCan() + "\n");

        Truck freight = new Truck(2, 18, true, "I am a very big Vehicle!");
        System.out.println(freight);
        System.out.println(freight.iCan() + "\n");

        SportsCar porsche = new SportsCar(2, 4, true);
        System.out.println(porsche);
        System.out.println(porsche.iCan() + "\n");

        SUV jeep = new SUV(4, 4, true);
        System.out.println(jeep);
        System.out.println(jeep.iCan() + "\n");

    }
}
