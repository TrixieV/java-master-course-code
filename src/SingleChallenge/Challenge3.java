package SingleChallenge;

public class Challenge3 {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5,
                8) + " cm");

        System.out.println("68in = " + convertToCentimeters(68) +
                " cm");
    }

    public static double convertToCentimeters(int height) {
        double convertedHeight = (double) (height * 2.54);
        return convertedHeight;
    }

    public static double convertToCentimeters(int heightInFeet,
                                              int heightInInch) {
        int personHeight = (heightInFeet * 12) + heightInInch;
        return convertToCentimeters(personHeight);
    }
}
