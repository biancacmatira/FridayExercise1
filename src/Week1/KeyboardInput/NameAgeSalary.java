package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        String name = input.nextLine();
        System.out.println();
        System.out.println("Hi, " + name + "!  How old are you?");
        int age = input.nextInt();
        System.out.println();
        System.out.println("So you're " + age + ", eh?  That's not old at all!\n" +
                "How much do you make, " + name + "?");
        float salary = input.nextFloat();
        System.out.println();
        System.out.println(salary + "!  I hope that's per hour and not per year! LOL!");
    }
}
