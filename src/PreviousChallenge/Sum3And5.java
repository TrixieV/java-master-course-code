package PreviousChallenge;

public class Sum3And5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 5; i <= 120; i++) {
            if (canBeDividedBy3And5(i)) {
                System.out.println(i + " can be divided by 3 and 5");
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
    }

    public static boolean canBeDividedBy3And5(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return true;
        }
        return false;
    }

}
