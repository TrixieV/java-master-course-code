package LambdaChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Khoa", "Ro", "Thao", "Kellie",
                        "Titi", "Amanda", "Trixie", "William"};

        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println("-> To upper case: ");
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);

        backedByArray.replaceAll(s -> s += " " +
                getRandom('A', 'F') + ".");
        System.out.println("-> Add random middle name:");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s += " "
                + reversedName(s.split(" ")[0]));
        System.out.println("-> Reversed:");
        Arrays.asList(names).forEach(s -> System.out.println(s));
    }

    public static char getRandom(char startWith, char endWith) {
        return (char) (random.nextInt((int) startWith, (int) endWith + 1));
    }

    public static String reversedName(String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
