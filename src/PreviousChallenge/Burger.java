package PreviousChallenge;

public class Burger extends Item {
    private Item extra1, extra2, extra3;

    public Burger(String name, double price) {
        super(name, "BURGER", price);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice()
                + ((extra1 != null) ? extra1.getAdjustedPrice() : 0)
                + ((extra2 != null) ? extra2.getAdjustedPrice() : 0)
                + ((extra3 != null) ? extra3.getAdjustedPrice() : 0);
    }

    public double getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "OLIVE", "CHEESE" -> 1.0;
            case "SALAMI", "SAUSAGE", "BACON" -> 1.5;
            default -> 0.0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item(extra1, "TOPPING", getExtraPrice(extra1));
        this.extra2 = new Item(extra2, "TOPPING", getExtraPrice(extra2));
        this.extra3 = new Item(extra3, "TOPPING", getExtraPrice(extra3));
    }

    public void printItemList() {
        printItem("BASE BURGER", getBasePrice());
        if (extra1 != null) {
            extra1.printItem();
        }
        if (extra2 != null) {
            extra2.printItem();
        }
        if (extra3 != null) {
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
