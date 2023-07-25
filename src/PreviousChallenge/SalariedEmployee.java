package PreviousChallenge;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate,
                            String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire() {
        terminate("12/12/2023");
        isRetired = true;
    }

    @Override
    public double collectPay() {
        double payCheck = annualSalary / 26;
        double realPay = isRetired ? 0.9 * payCheck : payCheck;
        return (int) realPay;
    }
}
