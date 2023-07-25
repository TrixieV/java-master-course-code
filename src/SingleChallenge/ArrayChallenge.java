package SingleChallenge;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] basicArray = getRandomArray(10);
        System.out.println(Arrays.toString(basicArray));

        int[] coppiedArray = Arrays.copyOf(basicArray, basicArray.length);
        Arrays.sort(coppiedArray);

        int[] sortedArray = new int[10];
        for (int i = 0; i < coppiedArray.length; i++) {
            sortedArray[i] = coppiedArray[coppiedArray.length - i -1];
        }
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] getRandomArray(int len) {
        Random randomNumber = new Random();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = randomNumber.nextInt(100);
        }
        return array;
    }
}
