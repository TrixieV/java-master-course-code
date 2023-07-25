package PreviousChallenge;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    private static int employeeCount = 1;

    public Employee(String name, String birthDate,
                    String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeCount++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "PreviousChallenge.Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
