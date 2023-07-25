package PreviousChallenge;

public class SwitchChallenge {
    public static void main(String[] args) {
        String switchWord = traditionalSwitch('C') + " " +
                traditionalSwitch('A') + " " +
                traditionalSwitch('E');
        System.out.println(switchWord);
    }

    public static String traditionalSwitch(char c) {
        switch (c) {
            case 'A': return "Able";
            case 'B': return "Baker";
            case 'C': return "Charlie";
            case 'D': return "Dog";
            case 'E': return "Easy";
            default: return "Invalid character";
        }
    }
}
