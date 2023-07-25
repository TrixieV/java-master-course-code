package PreviousChallenge;

public class CustomerChallenge {
    private String name;
    private double creditLimit;
    private String address;

    public CustomerChallenge(String name, double creditLimit, String address) {
        this.name = name;
        this.creditLimit = creditLimit;
        this. address = address;
    }

    public CustomerChallenge() {
        this("Ti", "titi@gmail.com");
    }

    public CustomerChallenge(String name, String address) {
        this(name, 1000, address);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getAddress() {
        return address;
    }
}
