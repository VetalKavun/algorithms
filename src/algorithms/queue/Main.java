package algorithms.queue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(10);

        arrayQueue.add(new Employee("Tom", "Jackson", 23));
        arrayQueue.add(new Employee("Danny", "Mythack", 245));
        arrayQueue.add(new Employee("Ally", "Mayson", 224));
        arrayQueue.add(new Employee("Jennifer", "Satclif", 37));
        arrayQueue.add(new Employee("End", "End", 28));

        arrayQueue.printQueue();
        System.out.println("-----------------");
        System.out.println(arrayQueue.remove());
        System.out.println("-----------------");
        System.out.println("Peeked: " + arrayQueue.peek());
    }
}
