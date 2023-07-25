package PreviousChallenge;

public class WhileLoop {
    public static void main(String[] args) {
        int number = 4, oddCount = 0, evenCount = 0;

        while (number <= 20) {
            number++;
            if (isEvenNumber(number)) {
                System.out.println(number);
                evenCount++;
                continue;
            }
            oddCount++;
        }
        System.out.println("evenCount = " + evenCount);
        System.out.println("oddCount = " + oddCount);
    }

    public static boolean isEvenNumber(int number) {
        if ((number <= 0) || (number % 2 != 0)) return false;
        return true;
    }

}
