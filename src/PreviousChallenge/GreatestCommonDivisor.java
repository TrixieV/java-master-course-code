package PreviousChallenge;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) return -1;
        int greatestValue = 0;
        for (int i = 1; i <= first; i++) {
            if (first % i == 0) {
                if (second % i == 0) {
                    greatestValue = i;
                }
            }
        }
        return greatestValue;
    }
}
