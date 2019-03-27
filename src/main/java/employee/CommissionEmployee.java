package employee;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(){
    }
    public CommissionEmployee(String firstName, String lastName, double employeeID, double grossSales, double commissionRate){
        super(firstName, lastName, employeeID);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    public double getGrossSales() {
        return grossSales;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    @Override
    public String paycheck(){
        double commission = grossSales * commissionRate;
        String response = "";
        response = response + " The commission employee's salary is " + commission;
        return response;
    }
    @Override
    public String fullName(){
        return super.fullName();
    }
}
