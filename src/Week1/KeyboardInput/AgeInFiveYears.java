package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hello.  What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi, " + name + "!  How old are you? ");
        int age = input.nextInt();
        int ageAfter = age + 5;
        int ageBefore = age - 5;
        System.out.println();
        System.out.println("Did you know that in five years you will be " + ageAfter + " years old?"
                + "\nAnd five years ago you were " + ageBefore+ "! Imagine that!");
    }
}
