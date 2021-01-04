package algorithms.linkedlistchallenge2;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer addValue) {
        IntegerNode addNode = new IntegerNode(addValue);
        addNode.setNext(head);
        head = addNode;
        size++;
    }

    public boolean insertSorted(Integer addValue) {
        IntegerNode node = new IntegerNode(addValue);
        IntegerNode prev = null;
        IntegerNode current = head;

        if (head == null) {
            head = node;
            return true;
        }


        while (current != null && node.getValue() > current.getValue()) {
            prev = current;
            current = current.getNext();
        }

        if(prev == null){
            head = node;
        }else{
            prev.setNext(node);
        }
        node.setNext(current);


        size++;
        return true;
    }

    public void printList() {
        IntegerNode currentNode = head;

        System.out.println("HEAD -> ");
        while (currentNode != null) {
            System.out.print(currentNode);
            System.out.print(" -> ");
            currentNode = currentNode.getNext();
        }
        System.out.println("null");
    }

    public IntegerNode getHead() {
        return head;
    }

    public void setHead(IntegerNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
