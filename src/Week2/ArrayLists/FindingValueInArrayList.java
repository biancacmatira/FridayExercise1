package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {
        Random num = new Random();
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for(int i = 0; i < 10 ; i++) {
            intArrayList.add(num.nextInt(50));
        }

        System.out.println("ArrayList: " + intArrayList);
        System.out.print("Value to find: ");
        int input = scan.nextInt();

        System.out.println();
        if (intArrayList.contains(input)) {
            System.out.println(input + " is in the ArrayList.");
        } else {
            System.out.println(input + " is not in the ArrayList.");
        }
    }
}
