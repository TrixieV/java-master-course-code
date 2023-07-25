package LocalAnonymousChallenge;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Thao", "Vo",
                "01/05/2019"));
        list.add(new Employee("Ro", "Vo",
                "03/08/2018"));
        list.add(new Employee("Man", "Nguyen",
                "25/12/2020"));
        list.add(new Employee("Khoa", "Keo",
                "03/11/2017"));
        list.add(new Employee("Ti", "Bui",
                "14/10/2021"));

        printOrderedList(list, "name");
        System.out.println();
        printOrderedList(list, "yearWorked");

    }

    public static void printOrderedList(List<Employee> eList, String sortField) {

        int currentYear = LocalDate.now().getYear();

        class MyEmployee {
            Employee containedEmployee;
            int yearWorked;
            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearWorked = currentYear - Integer.parseInt(
                        containedEmployee.hireDate().split("/")[2]);
                fullName = String.join(" ", containedEmployee.firstName(),
                        containedEmployee.lastName());
            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years".formatted(
                        fullName, yearWorked);
            }
        }

        List<MyEmployee> myEmployeeList = new ArrayList<>();
        for (Employee employee : eList) {
            myEmployeeList.add(new MyEmployee(employee));
        }

        var comparator = new Comparator<MyEmployee>() {

            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {

                if (sortField.equals("name")) {
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearWorked - o2.yearWorked;
            }
        };

        myEmployeeList.sort(comparator);
        for (MyEmployee employee : myEmployeeList) {
            System.out.println(employee);
        }
    }
}
