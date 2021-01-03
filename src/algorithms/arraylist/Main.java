package algorithms.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jack", "Sparrow", 123));
        employeeList.add(new Employee("Mary", "King", 234));
        employeeList.add(new Employee("Harry", "Potter", 456));
        employeeList.add(new Employee("James", "Bond", 567));

        System.out.println(employeeList.get(1));
        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("Mary", "Lin", 6565));
        System.out.println(employeeList.size());

        employeeList.add(2, new Employee("John", "Dow", 2323));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("--------------------");
        Employee [] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for(Employee emp : employeeArray){
            System.out.println(emp);
        }

        System.out.println(employeeList.contains(new Employee("James", "Bond", 567)));
        System.out.println(employeeList.indexOf(new Employee("James", "Bond", 567)));
    }
}
