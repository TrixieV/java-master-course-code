package PreviousChallenge;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return (quantity * price);
    }

    public void printPricedLine(int quantity) {
        System.out.println("Product type: " + type
                + ". Description: " + description + ", price: "
                + price + ", quantity: " + quantity);
    }

    public abstract void showDetail();
}

class ProductA extends ProductForSale {

    public ProductA(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetail() {
        System.out.println(type + ": " + description);
        System.out.println("Price: " + price);
    }
}

class ProductB extends ProductForSale {

    public ProductB(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetail() {
        System.out.println(type + ": " + description);
        System.out.println("Price: " + price);
    }
}

class ProductC extends ProductForSale {

    public ProductC(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetail() {
        System.out.println(type + ": " + description);
        System.out.println("Price: " + price);
    }
}