package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        Random num = new Random();
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        int max = 0;
        int slot = 0;

        for (int i = 0; i < 10; i++) {
            intArrayList.add(num.nextInt(100));
        }

        System.out.println("ArrayList: " + intArrayList);

        System.out.println();
        for (int i = 0; i < intArrayList.size(); i++) {
            if (intArrayList.get(i) > max) {
                max = intArrayList.get(i);
                slot = i;
            }
        }

        System.out.println("The largest value is " + max + ", which is in slot " + slot);
    }
}
