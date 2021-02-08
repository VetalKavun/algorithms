package algorithms.stackarray;

import java.util.ArrayList;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee){
        if(top == stack.length){
            Employee [] newEmployeeArr = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newEmployeeArr, 0, stack.length);
            stack = newEmployeeArr;
        }
    }
}
