package Week2.Arrays;

import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        Random num = new Random();
        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = num.nextInt(100);
            System.out.println("Slot " + i + " contains a " + intArray[i]);
        }
    }
}
