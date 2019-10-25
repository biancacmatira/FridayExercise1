package Week2.Arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        Random num = new Random();
        Scanner scan = new Scanner(System.in);
        int[] intArray = new int[10];
        int slot = 0;
        boolean found = false;

        System.out.print("Array: ");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = num.nextInt(50);
            System.out.print(intArray[i] + " ");
        }

        System.out.println();
        System.out.print("Value to find: ");
        int input = scan.nextInt();

        for (int j = 0;  j < intArray.length; j++) {
            if (intArray[j] == input) {
                slot = j;
                found = true;
            }
        }

        System.out.println();
        if (found) {
            System.out.print(input + " is in slot " + slot + ".");
        } else {
            System.out.println(input + " is not in the array.");
        }
    }
}
