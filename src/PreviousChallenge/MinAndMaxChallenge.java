package PreviousChallenge;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double min = 0, max = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter a number or a character to exit");
            String nextNumber = scanner.nextLine();
            try {
                double validNumber = Double.parseDouble(nextNumber);
                if (count == 0 || validNumber < min) {
                    min = validNumber;
                }
                if (count == 0 || validNumber > max) {
                    max = validNumber;
                }
                count++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if (count > 0) {
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }
        else System.out.println("No valid data");
    }
}
