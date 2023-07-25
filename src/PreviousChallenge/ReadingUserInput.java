package PreviousChallenge;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter < 6) {
            System.out.println("Enter number #" + counter + ": ");
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!");
            }
        }

        System.out.println("Sum = " + sum);
    }

}
