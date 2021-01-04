package algorithms.linkedlistchallenge1;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);

        if (head == null) {
            tail = employeeNode;
        } else {
            head.setPrevious(employeeNode);
        }

        head = employeeNode;
        size++;
    }

    public void addToTail(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);

        if (tail == null) {
            head = employeeNode;
        } else {
            tail.setNext(employeeNode);
            employeeNode.setPrevious(tail);
        }

        tail = employeeNode;
        size++;
    }

    public boolean addBefore(Employee employeeToAdd, Employee employeeBefore){
        if(head == null){
            return false;
        }

        EmployeeNode employeeNode = new EmployeeNode(employeeToAdd);

        EmployeeNode current = head;

        while(!current.getEmployee().equals(employeeBefore) && current != null){
                current = current.getNext();
        }

        if(current == null){
            return false;
        }

        employeeNode.setNext(current);
        employeeNode.setPrevious(current.getPrevious());
        current.setPrevious(employeeNode);

        if(current == head){
            head = employeeNode;
        }else{
            employeeNode.getPrevious().setNext(employeeNode);
        }

        size++;

        return true;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        removedNode.setPrevious(null);
        return removedNode;
    }

    public EmployeeNode removeFromTail(){
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;

        if(tail.getPrevious() == null){
            head = null;
        }else{
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setNext(null);
        removedNode.setPrevious(null);
        return removedNode;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.println("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.println(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
