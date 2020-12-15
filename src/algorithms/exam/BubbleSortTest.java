package algorithms.exam;

import java.util.Random;

public class BubbleSortTest {
    public static void main(String[] args) {
        int [] mas = new int[100];
        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for(int lastSortedIndex = mas.length - 1; lastSortedIndex > 0; lastSortedIndex--){
            for (int i = 0; i < lastSortedIndex; i++) {
                if(mas[i] > mas[i + 1]){
                    swapElements(mas, i, i + 1);
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

    }

    private static void swapElements(int mas[], int i, int j){
        if(i == j) {
            return;
        }
        int tmp = mas[i];
        mas[i] = mas[j];
        mas[j] = tmp;
    }
}
