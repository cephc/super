package hero;

public class Superman extends Superhero{

    public Superman(String name, String[] powers){
        super(name, powers);
    }
    @Override
    public String specialPowers() {
        return super.specialPowers();
    }

}
