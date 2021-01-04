package algorithms.doublylinkedlist;

public class Main {
    public static void main(String[] args) {

        Employee employee_1 = new Employee("Jack", "Sparrow", 123);
        Employee employee_2 = new Employee("Mary", "King", 234);
        Employee employee_3 = new Employee("Harry", "Potter", 456);
        Employee employee_4 = new Employee("James", "Bond", 567);

        EmployeeDoublyLinkedList doublyLinkedList = new EmployeeDoublyLinkedList();
        doublyLinkedList.addToFront(employee_1);
        doublyLinkedList.addToFront(employee_2);
        doublyLinkedList.addToFront(employee_3);
        doublyLinkedList.addToFront(employee_4);

        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());

        Employee employee_5 = new Employee("Bill", "Tail", 777);
        doublyLinkedList.addToTail(employee_5);

        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());

        doublyLinkedList.removeFromFront();

        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());

        doublyLinkedList.removeFromTail();

        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());


    }
}
