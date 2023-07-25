package SingleChallenge;

public class Challenge1 {
    public static void main(String[] args) {
        double var1 = 20.00d, var2 = 80.00d;
        double add2Vars = (var1 + var2) * 100.00d;
        System.out.println("Total is: " + add2Vars);
        double remain = add2Vars % 40.00d;
        System.out.println("Remain is: " + remain);
        boolean isZero = (remain == 0) ? true : false;
        String t = (isZero == true) ? "It is true" : "It is false";
        System.out.println(t);
        if (!isZero) {
            System.out.println("got some remainder");
        }
    }
}
