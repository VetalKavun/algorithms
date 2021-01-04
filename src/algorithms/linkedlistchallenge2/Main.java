package algorithms.linkedlistchallenge2;

public class Main {
    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();
        list.insertSorted(new Integer(111));
        list.insertSorted(new Integer(34));
        list.insertSorted(new Integer(2));
        list.insertSorted(new Integer(56));
        list.insertSorted(new Integer(1));
        list.insertSorted(new Integer(12));

        list.printList();
    }
}
