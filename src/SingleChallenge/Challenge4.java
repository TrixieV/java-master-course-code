package SingleChallenge;

public class Challenge4 {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Not valid";
        }
        int minutes = seconds / 60;
        seconds %= 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Not valid";
        }
        int hours = minutes / 60;
        minutes %= 60;
        return (hours + "h " + minutes + "m " + seconds + "s");
    }
}
