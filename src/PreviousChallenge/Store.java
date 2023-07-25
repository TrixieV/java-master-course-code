package PreviousChallenge;

import java.util.ArrayList;

record OrderItem(ProductForSale product, int quantity) {}
public class Store {
    private static ArrayList<ProductForSale> listOfSaleProducts =
            new ArrayList<>();

    public static void main(String[] args) {
        listOfSaleProducts.add(new ProductA("Flowers", 5.5,
                "Beautiful red roses"));
        listOfSaleProducts.add(new ProductB("Blanket", 15,
                "White 200x220cm blanket"));
        listOfSaleProducts.add(new ProductC("Tables", 30,
                "Brown wood dinning table"));
        listProducts();

        System.out.println("\nOrder 1:");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 4);
        addItemToOrder(order1, 2, 2);
        printOrder(order1);
    }

    public static void listProducts() {
        for (var item : listOfSaleProducts) {
            System.out.println("-".repeat(30));
            item.showDetail();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> orders,
                                      int orderIndex, int quantity) {
        orders.add(new OrderItem(listOfSaleProducts.get(orderIndex), quantity));
    }

    public static void printOrder(ArrayList<OrderItem> orders) {
        double totalPrice = 0;
        for (var item : orders) {
            item.product().printPricedLine(item.quantity());
            totalPrice += item.product().getSalesPrice(item.quantity());
        }
        System.out.println("Sales Total: " + totalPrice);
    }
}
