package employee;

public class Main {
    public static void main(String[] args) {
        SalaryEmployee one = new SalaryEmployee("Chatyra", " Cephas", 00345, 500);
        System.out.println(one.paycheck());
        System.out.println(one.fullName());

        CommissionEmployee two = new CommissionEmployee("T'shay", " Brooks", 00245, 2500, 20);
        System.out.println(two.paycheck());
        System.out.println(two.fullName());

        BasePlusEmployee three = new BasePlusEmployee("Taylor", " Brown", 00145, 3500, 20, 30000);
        System.out.println(three.paycheck());
        System.out.println(three.fullName());
    }
}
