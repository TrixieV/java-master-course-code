package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        String challenge1 = "I want a bike";
        String reg = "I want a \\w+.";
        String challenge2 = "I want a ball";
        System.out.println(challenge1.matches(reg));
        System.out.println(challenge2.matches(reg));

        Pattern pattern1 = Pattern.compile(reg);
        Matcher matcher1 = pattern1.matcher(challenge1);
        Matcher matcher2 = pattern1.matcher(challenge2);

        System.out.println("Result: " + matcher1.matches());
        System.out.println("Result: " + matcher2.matches());

        String challenge4 = "Replace all blanks with underscores";
        System.out.println(challenge4.replaceAll(" ", "_"));

        String challenge5 = "aaabcccccccccccdddefffg";
        String reg5 = "[a-g]+";
        System.out.println(challenge5.matches(reg5));

        String challenge6 = "aaabccccccccccccdddefffg";
        String reg6 = "^a{3}bc{11}d{3}ef{3}g$";
        System.out.println(challenge5.matches(reg6));
        System.out.println(challenge6.matches(reg6));

        String challenge7 = "abcd.135";
        String reg7 = "^[a-zA-Z]+\\.\\d+$";
        System.out.println("7 " + challenge7.matches(reg7));

        String challenge8 = "abcd.123urt.8txig.999";
        String reg8 = "([a-zA-Z]+)(\\.)(\\d+)";
        Pattern pattern8 = Pattern.compile(reg8);
        Matcher matcher8 = pattern8.matcher(challenge8);
        while (matcher8.find()) {
            System.out.println("Result: " + matcher8.group(3));
        }

        String challenge9 = "abcd.123\turt.8\txig.999\n";
        String reg9 = "[a-zA-Z]+\\.(\\d+)\\s";
        Pattern pattern9 = Pattern.compile(reg9);
        Matcher matcher9 = pattern9.matcher(challenge9);
//        while (matcher9.find()) {
//            System.out.println("Result: " + matcher9.group(1));
//        }

        while (matcher9.find()) {
            System.out.println("Result: " + matcher9.start(1) + " to "
                    + matcher9.end(1));
        }

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern11 = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while (matcher11.find()){
            System.out.println("Occurrence: " + matcher11.group(1));
        }

        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));

        String challenge13 = "12345-1234";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));

        System.out.println(challenge12.matches("^\\d{5}(-\\d{4})?$"));
        System.out.println(challenge13.matches("^\\d{5}(-\\d{4})?$"));
    }
}
