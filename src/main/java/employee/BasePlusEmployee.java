package employee;

public class BasePlusEmployee extends CommissionEmployee{

    private double baseSalary;

    public BasePlusEmployee(String firstName, String lastName, double employeeID, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, employeeID, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }
    @Override
    public String paycheck(){
        double basepay = (getCommissionRate() * getGrossSales()) + baseSalary;
        String response = "";
        response = response + " The Base Plus employee's salary is " + basepay;
        return response;
    }
    @Override
    public String fullName(){
        return super.fullName();
    }
}
