package PreviousChallenge;

public class MealOrder {
    private Item drink;
    private Item side;
    private Burger burger;

    public MealOrder(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType, 4.0);
        this.drink = new Item(drinkType, "DRINK", 1.0);
        this.side = new Item(sideType, "SIDE", 2.0);
    }

    public MealOrder() {
        this("Regular PreviousChallenge.Burger", "Soda", "Fries");
    }

    public double getTotalPrice() {
        return burger.getAdjustedPrice() + drink.getAdjustedPrice()
                + side.getAdjustedPrice();
    }

    public void printItemList() {
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        System.out.println("TOTAL PRICE: " + getTotalPrice());
    }

    public void addBurgerTopping(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }


}



//public class PreviousChallenge.MealOrder {
//    private PreviousChallenge.Item drink;
//    private PreviousChallenge.Item side;
//    private PreviousChallenge.Burger burger;
//
//    public PreviousChallenge.MealOrder(String burgerType, String drinkType, String sideType) {
//        this.burger = new PreviousChallenge.Burger(burgerType, 4.0);
//        this.drink = new PreviousChallenge.Item(drinkType, "DRINK", 1.0);
//        this.side = new PreviousChallenge.Item(sideType, "SIDE", 1.5);
//    }
//
//    public PreviousChallenge.MealOrder() {
//        this("regular", "coke", "fries");
//    }
//
//    public double getTotalPrice() {
//        return side.getAdjustPrice() + drink.getAdjustPrice()
//                + burger.getAdjustPrice();
//    }
//
//    public void printItemizedList() {
//        burger.printItem();
//        drink.printItem();
//        side.printItem();
//        System.out.println("-".repeat(30));
//        PreviousChallenge.Item.printItem("TOTAL PRICE", getTotalPrice());
//    }
//
//    public void addBurgerToppings(String extra1, String extra2, String extra3) {
//        burger.addTopping(extra1, extra2, extra3);
//    }
//
//    public void setDrinkSize(String size) {
//        drink.setSize(size);
//    }
//}
//
//class PreviousChallenge.Item {
//    private String name;
//    private String type;
//    private double price;
//    private String size = "MEDIUM";
//
//    public PreviousChallenge.Item(String name, String type, double price) {
//        this.name = name;
//        this.type = type;
//        this.price = price;
//    }
//
//    public String getName() {
//        if (type.equals("SIDE") || type.equals("DRINK")) {
//            return size + " " + name;
//        }
//        return name;
//    }
//
//    public double getBasePrice() {
//        return price;
//    }
//
//    public void setSize(String size) {
//        this.size = size;
//    }
//
//    public double getAdjustPrice() {
//        return switch (size) {
//            case "SMALL" -> getBasePrice() - 0.5;
//            case "LARGE" -> getBasePrice() + 1;
//            default -> getBasePrice();
//        };
//    }
//
//    public String getSize() {
//        return size;
//    }
//
//    public static void printItem(String name, double price) {
//        System.out.printf("%20s:%6.2f%n", name.toUpperCase(), price);
//    }
//
//    public void printItem() {
//        printItem(getName(), getAdjustPrice());
//    }
//}
//
//class PreviousChallenge.Burger extends PreviousChallenge.Item {
//    private PreviousChallenge.Item extra1, extra2, extra3;
//
//    public PreviousChallenge.Burger(String name, double price) {
//        super(name, "PreviousChallenge.Burger", price);
//    }
//
//    @Override
//    public String getName() {
//        return super.getName();
//    }
//
//    @Override
//    public double getAdjustPrice() {
//        return getBasePrice()
//                + ((extra1 == null) ? 0 : extra1.getAdjustPrice())
//                + ((extra2 == null) ? 0 : extra2.getAdjustPrice())
//                + ((extra3 == null) ? 0 : extra3.getAdjustPrice());
//    }
//
//    public double getExtraPrice(String toppingName) {
//        return switch (toppingName.toUpperCase()) {
//            case "AVOCADO", "CHEESE" -> 1.0;
//            case "BACON", "HAM", "SALAMI" -> 1.5;
//            default -> 0.0;
//        };
//    }
//
//    public void addTopping(String extra1, String extra2, String extra3) {
//        this.extra1 = new PreviousChallenge.Item(extra1, "TOPPING", getExtraPrice(extra1));
//        this.extra2 = new PreviousChallenge.Item(extra2,"TOPPING", getExtraPrice(extra2));
//        this.extra3 = new PreviousChallenge.Item(extra3, "TOPPING", getExtraPrice(extra3));
//    }
//
//    public void printItemizedList() {
//        printItem("BASE BURGER", getBasePrice());
//        if (extra1 != null) {
//            extra1.printItem();
//        }
//        if (extra2 != null) {
//            extra1.printItem();
//        }
//        if (extra3 != null) {
//            extra1.printItem();
//        }
//    }
//
//    @Override
//    public void printItem() {
//        printItemizedList();
//        System.out.println("-".repeat(30));
//        super.printItem();
//    }
//}
//
