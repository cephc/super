package hero;

public class Main {
    public static void main(String[] args) {
        Superman man = new Superman("Super Man,", new String[]{"Fly,","Strength,","X-ray Vision"});
        System.out.println(man.specialPowers());

        Wonderwoman woman = new Wonderwoman("Wonder Woman", new String[]{"Fly, ", "Deflecting, ", "Super speed,"});
        System.out.println(woman.specialPowers());




    }
}
