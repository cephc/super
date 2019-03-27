package employee;

public class Employee {
    private String firstName;
    private String lastName;
    private double employeeID;
    //constructor
    public Employee(){

    }
    public Employee(String firstName, String lastName, double employeeID){
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //method
    public String paycheck(){
        return "Happy Friday, You got paid!";
    }
    public String fullName(){
        return firstName + lastName;
    }
    //setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmployeeID(double employeeID){
        this.employeeID = employeeID;
    }
    //getters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public double getEmployeeID(){
        return this.employeeID;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeID=" + employeeID +
                '}';
    }
}
