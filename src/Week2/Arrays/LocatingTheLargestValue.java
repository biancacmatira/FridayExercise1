package Week2.Arrays;

import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        Random num = new Random();
        int[] intArray = new int[10];
        int max = 0;
        int slot = 0;

        System.out.print("Array: ");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = num.nextInt(100);
            System.out.print(intArray[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
                slot = i;
            }
        }

        System.out.println();
        System.out.println("The largest value is " + max);
        System.out.println("It is in slot " + slot);
    }
}
