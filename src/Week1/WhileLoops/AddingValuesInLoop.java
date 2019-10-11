package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("I will add up the numbers you give me.\nNumber: ");
        int num = input.nextInt();
        int sum = 0;
        while (num != 0) {
            sum = sum + num;
            System.out.print("The total so far is " + sum +
                    "\nNumber: ");
            num = input.nextInt();
        }
        System.out.println();
        System.out.println("The total is " + sum + ".");
    }
}
