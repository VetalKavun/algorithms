package algorithms.hashtablesarrayimpl;

public class Main {
    public static void main(String[] args) {

        Employee employee_1 = new Employee("Jack", "Sparrow", 123);
        Employee employee_2 = new Employee("Mary", "King", 234);
        Employee employee_3 = new Employee("Harry", "Potter", 456);
        Employee employee_4 = new Employee("James", "Bond", 567);
        Employee employee_5 = new Employee("wer", "yyyy", 567);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("Sparrow", employee_1);
        hashTable.put("King", employee_2);
        hashTable.put("Potter", employee_3);

        hashTable.put("yyyy", employee_5);
        hashTable.put("Bond", employee_4);

        hashTable.printHashTable();


        System.out.println(hashTable.get("Bond"));


    }
}
