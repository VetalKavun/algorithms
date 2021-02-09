package algorithms.stackarray;

public class Main {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);

        arrayStack.push(new Employee("Tom", "Jackson", 23));
        arrayStack.push(new Employee("Danny", "Mythack", 245));
        arrayStack.push(new Employee("Ally", "Mayson", 224));
        arrayStack.push(new Employee("Jennifer", "Satclif", 37));
        arrayStack.push(new Employee("End", "End", 28));

        arrayStack.printStack();
        System.out.println("-----------------");
        System.out.println(arrayStack.peek());
        System.out.println("-----------------");
        System.out.println("Popped: " + arrayStack.pop());
        System.out.println(arrayStack.peek());
    }
}
