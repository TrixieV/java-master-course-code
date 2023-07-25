package PreviousChallenge;

public class ForLoopChallenge {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("There are " + count + " prime numbers");
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
