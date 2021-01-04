package algorithms.linkedlistchallenge2;

public class IntegerNode {

    private Integer value;
    private IntegerNode next;

    public IntegerNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public String toString(){
        return value.toString();
    }
}
