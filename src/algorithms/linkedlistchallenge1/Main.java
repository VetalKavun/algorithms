package algorithms.linkedlistchallenge1;

public class Main {
    public static void main(String[] args) {

        Employee employee_1 = new Employee("Jack", "Sparrow", 123);
        Employee employee_2 = new Employee("Mary", "King", 234);
        Employee employee_3 = new Employee("Harry", "Potter", 456);
        Employee employee_4 = new Employee("James", "Bond", 567);
        Employee employee_5 = new Employee("Tim", "Miller", 98);
        Employee employee_6 = new Employee("Tomas", "Truman", 99);
        Employee employee_7 = new Employee("Daniel", "Liam", 65);
        Employee employee_8 = new Employee("Jessy", "Richards", 888);

        EmployeeDoublyLinkedList doublyLinkedList = new EmployeeDoublyLinkedList();
        doublyLinkedList.addToFront(employee_1);
        doublyLinkedList.addToFront(employee_2);
        doublyLinkedList.addToFront(employee_3);
        doublyLinkedList.addToFront(employee_4);
        doublyLinkedList.addToFront(employee_5);
        doublyLinkedList.addToFront(employee_6);
        doublyLinkedList.addToFront(employee_7);
        doublyLinkedList.addToFront(employee_8);

        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());

        Employee employee_9 = new Employee("Test", "test", 0);

        System.out.println(doublyLinkedList.addBefore(employee_9, employee_5));
        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());
    }
}
