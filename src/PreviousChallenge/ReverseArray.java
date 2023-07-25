package PreviousChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = readInteger();
        System.out.println("Array list: " + Arrays.toString(array));

        int[] reverse = reverse(array);
        System.out.println("Reverse: " + Arrays.toString(reverse));
    }

    public static int[] readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of number, separate by commas: ");
        String input = scanner.nextLine();
        String[] split = input.split(",");
        int[] values = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            values[i] = Integer.parseInt(split[i].trim());
        }
        return values;
    }

    public static int[] reverse(int[] array) {
        int[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);

        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = temp[temp.length - i - 1];
        }
        return reversedArray;
    }
}
