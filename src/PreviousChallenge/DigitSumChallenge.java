package PreviousChallenge;

public class DigitSumChallenge {
    public static void main(String[] args) {
        int number = 2048;
        System.out.println(sumDigits(number));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }
        sum += number;
        return sum;
    }
}
