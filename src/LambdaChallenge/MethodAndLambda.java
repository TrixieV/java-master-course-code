package LambdaChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class MethodAndLambda {

    private static Random random = new Random();

    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Khoa", "Ro", "Thao", "Kellie",
                "Titi", "Amanda", "Trixie", "William"};

        List<UnaryOperator<String>> functions = new ArrayList<>(List.of(
                String::toUpperCase,
                s -> s += " " + getRandomMiddleName('A', 'H') + ".",
                s -> s += " " + reversedName(s, 0, s.indexOf(" "))
        ));

        applyChanges(names, functions);
    }

    public static void applyChanges(String[] names,
                                    List<UnaryOperator<String>> function) {
        List<String> backedByArray = Arrays.asList(names);
        for (var func : function) {
            backedByArray.replaceAll(func);
            System.out.println(Arrays.toString(names));
        }
    }

    public static char getRandomMiddleName(char start, char end) {
        return (char) random.nextInt((int) start, (int) end);
    }

    public static String reversedName(String name) {
        return reversedName(name, 0, name.length());
    }

    public static String reversedName(String name, int start, int end) {
        return new StringBuilder(name.substring(start, end)).reverse().toString();
    }
}
