package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        Random num = new Random();
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        int slot = 0;
        boolean found = false;

        for(int i = 0; i < 10 ; i++) {
            intArrayList.add(num.nextInt(50));
        }

        System.out.println("ArrayList: " + intArrayList);
        System.out.print("Value to find: ");
        int input = scan.nextInt();

        for (int j = 0;  j < intArrayList.size(); j++) {
            if (intArrayList.get(j) == input) {
                slot = j;
                found = true;
            }
        }

        System.out.println();

        if (found) {
            System.out.println(input + " is in slot " + slot);
        } else {
            System.out.println(input + " is not in the ArrayList.");
        }
    }
}
