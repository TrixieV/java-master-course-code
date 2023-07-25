package PreviousChallenge;

public class Item {
    private String name;
    private String type;
    private double price;
    private String size = "MEDIUM";

    public Item(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        if (type.equals("DRINK") || type.equals("SIDE")) {
            return size + " " + name;
        }
        return name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size.toUpperCase()) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1.0;
            default -> getBasePrice();
        };
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name.toUpperCase(), price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}
