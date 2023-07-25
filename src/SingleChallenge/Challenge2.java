package SingleChallenge;

public class Challenge2 {
    public static void main(String[] args) {

        displayHighScorePosition("Ti",
                calculateHighScorePosition(1500));

        displayHighScorePosition("Ro",
                calculateHighScorePosition(1000));

        displayHighScorePosition("Keo",
                calculateHighScorePosition(500));

        displayHighScorePosition("Man",
                calculateHighScorePosition(100));

        displayHighScorePosition("Ron",
                calculateHighScorePosition(50));
}

    public static void displayHighScorePosition(String playerName,
                                                int position) {

        System.out.println(playerName +
                " managed to get into position "
                + position + " on the high score list");

    }

    public static int calculateHighScorePosition (int playerScore) {
        if (playerScore >= 1000) return 1;

        else if (playerScore >= 500) {
            return 2;
        }

        else if (playerScore >= 100) {
            return 3;
        }

        else return 4;
    }
}