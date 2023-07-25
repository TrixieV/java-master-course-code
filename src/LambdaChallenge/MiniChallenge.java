package LambdaChallenge;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MiniChallenge {

    public static void main(String[] args) {
        Consumer<String> printTheParts = sentence ->
                Arrays.asList(sentence.split(" "))
                        .forEach(s -> System.out.println(s));

        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i ++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        Supplier<String> iLoveJava = () -> "I love Java";

        System.out.println(everySecondChar.apply("1234567890"));
        System.out.println("----------");
        System.out.println(everySecondCharacter(everySecondChar,
                "1234567890"));
        System.out.println(iLoveJava.get());
    }

    public static String everySecondCharacter(UnaryOperator<String> funct,
                                              String s) {
        return funct.apply(s);
    }
}

