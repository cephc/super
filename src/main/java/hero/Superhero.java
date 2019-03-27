package hero;

import java.util.Arrays;

public class Superhero {
    protected String name;
    private String[] powers;
    //constructors
    public Superhero(){
    }
    public Superhero(String name, String[] powers){
        this.name = name;
        this.powers = powers;
    }
    //method
    public String specialPowers(){
        String response = "";
        for(int i = 0; i < powers.length; i++) {
            response = response + powers[i] + " ";
        }
        return name + "'s powers are: " + response;
    }
    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setPowers(String[] powers){
        this.powers = powers;
    }
    //getters
    public String getName(){
        return this.name;
    }
    public String[] getPowers() {
        return this.powers;
    }
    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", powers=" + Arrays.toString(powers) +
                '}';
    }
}
