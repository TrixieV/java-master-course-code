package PreviousChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ?
                tonerLevel : -1;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {

        System.out.println("Remaining toner level is " + tonerLevel);
        tonerLevel += tonerAmount;
        if ((tonerLevel > 100) || (tonerLevel < 0)) {
            System.out.println("Toner level added is not valid");
            return -1;
        }
        System.out.println("Toner level have been added. Remaining: " +
                tonerLevel);
        return tonerLevel;
    }

    public void printPages(int pages) {
        int printJob = (duplex) ? (pages / 2) + (pages % 2) : pages;

        pagesPrinted += printJob;
        System.out.println(printJob + " pages are printing. " +
                "Total pages printed: " + pagesPrinted);
    }
}
