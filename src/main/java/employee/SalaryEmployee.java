package employee;

public class SalaryEmployee extends Employee {

    private double weeklySalary;

    public SalaryEmployee(String firstName, String lastName, double employeeID, double weeklySalary){
        super(firstName, lastName, employeeID);
        this.weeklySalary = weeklySalary;
    }
    @Override
    public String paycheck(){
        String response = "";
        response = response + " The Salary employee's salary is " + weeklySalary;
        return response;
    }
    @Override
    public String fullName(){
        return super.fullName();
    }




}
