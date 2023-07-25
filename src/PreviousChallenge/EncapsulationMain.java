package PreviousChallenge;

public class EncapsulationMain {
    public static void main(String[] args) {
        Printer printer1 = new Printer(40, 20,
                true);
        Printer printer2 = new Printer(120, 10,
                false);

        printer2.addToner(30);
        printer2.printPages(10);
        System.out.println();
        printer1.addToner(50);
        printer1.printPages(15);
        printer1.printPages(10);
    }
}
