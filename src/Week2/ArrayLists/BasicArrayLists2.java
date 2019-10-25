package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        Random num = new Random();
        ArrayList<Integer>  intArrayList = new ArrayList<Integer>();

        for(int i = 0; i < 10 ; i++) {
            intArrayList.add(num.nextInt(100));
        }

        System.out.println("ArrayList: " + intArrayList);
    }
}
