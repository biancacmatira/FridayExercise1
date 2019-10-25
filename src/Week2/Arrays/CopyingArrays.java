package Week2.Arrays;

import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {
        Random num = new Random();
        int[] intArray1 = new int[10];
        int[] intArray2 = new int[10];

        for (int i = 0; i < intArray1.length; i++) {
            intArray1[i] = num.nextInt(100);
        }

        for (int j = 0; j < intArray2.length; j++) {
            intArray2[j] = intArray1[j];
        }

        intArray1[intArray1.length -1] = -7;

        System.out.print("Array 1: ");
        for (int i = 0; i < intArray1.length; i++) {
            System.out.print(intArray1[i] + " ");
        }
        System.out.println();
        System.out.print("Array 2: ");
        for (int j = 0; j <intArray2.length; j++) {
            System.out.print(intArray2[j] + " ");
        }
    }
}

// Got help from Mika Sato
