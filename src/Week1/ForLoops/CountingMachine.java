package Week1.ForLoops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Count to: ");
        int num = input.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
}
