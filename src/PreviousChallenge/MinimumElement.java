package PreviousChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int[] newArray = readIntegers();
        System.out.println("Array: " + Arrays.toString(newArray));

        int min = findMin(newArray);
        System.out.println("Min is: " + min);
    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of Integer, separate by commas: ");
        String input = scanner.nextLine();
        String[] split = input.split(",");
        int[] values = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            values[i] = Integer.parseInt(split[i].trim());
        }
        return values;
    }

    public static int findMin(int[] list) {
        Arrays.sort(list);
        return list[0];
    }
}
