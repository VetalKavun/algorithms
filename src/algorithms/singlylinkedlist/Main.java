package algorithms.singlylinkedlist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee_1 = new Employee("Jack", "Sparrow", 123);
        Employee employee_2 = new Employee("Mary", "King", 234);
        Employee employee_3 = new Employee("Harry", "Potter", 456);
        Employee employee_4 = new Employee("James", "Bond", 567);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        System.out.println(employeeLinkedList.isEmpty());;
        employeeLinkedList.addToFront(employee_1);
        employeeLinkedList.addToFront(employee_2);
        employeeLinkedList.addToFront(employee_3);
        employeeLinkedList.addToFront(employee_4);
        System.out.println(employeeLinkedList.getSize());
        System.out.println(employeeLinkedList.isEmpty());

        employeeLinkedList.printList();

        employeeLinkedList.removeFromFront();
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.printList();


    }
}
