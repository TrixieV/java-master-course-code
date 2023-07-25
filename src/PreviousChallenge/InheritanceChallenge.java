package PreviousChallenge;

public class InheritanceChallenge {
    public static void main(String[] args) {
        Employee ro = new Employee("Ro", "02/08/1996",
                "01/03/2019");
        System.out.println(ro);
        System.out.println("Age: " + ro.getAge());
        System.out.println("Salary: " + ro.collectPay());

        SalariedEmployee ti = new SalariedEmployee("Ti",
                "20/05/1996", "02/03/2020",
                60000);
        System.out.println(ti);
        System.out.println("Ti's Paycheck = $" + ti.collectPay());

        ti.retire();
        System.out.println("Ti's real pay: $" + ti.collectPay());

        HourlyEmployee man = new HourlyEmployee("Man",
                "21/03/1998", "01/01/2021", 20);
        System.out.println(man);
        System.out.println("Man's paycheck: $" + man.collectPay());
    }
}
