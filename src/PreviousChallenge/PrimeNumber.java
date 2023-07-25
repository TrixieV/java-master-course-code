package PreviousChallenge;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 52;
        System.out.println(number + " is " + (isPrime(number) ? "" : "NOT")
                    + " a prime number");
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber < 2) {
            return false;
        }

        for (int div = 2; div < (wholeNumber/2 + 1); div++) {
            if ((wholeNumber % div) == 0) {
                return false;
            }
        }
        return true;
    }
}
