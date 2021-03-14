package algorithms.hashtablesarrayimpl;

public class SimpleHashTable {

    private StoredEmployee[] employees;

    public SimpleHashTable() {
        employees = new StoredEmployee[10];
    }

    private int hashKey(String key) {
        return key.length() % employees.length;
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (isOccupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == employees.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % employees.length;
            }
        }
        if (isOccupied(hashedKey)) {
            System.out.println("Sorry, this array position is already taken");
        } else {
            employees[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    private boolean isOccupied(int hashedKey) {
        return employees[hashedKey] != null;
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) return null;
        else return employees[hashedKey].employee;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (employees[hashedKey] != null &&
                employees[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == employees.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex &&
                employees[hashedKey] != null &&
                !employees[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % employees.length;
        }

        if (hashedKey == stopIndex) return -1;
        else return hashedKey;

    }

    public void printHashTable() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                System.out.println("empty");
            } else {
                System.out.println("Position " + i + ": " + employees[i].employee);
            }
        }
    }
}
