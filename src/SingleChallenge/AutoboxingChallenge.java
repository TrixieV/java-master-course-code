package SingleChallenge;

import java.util.ArrayList;
import java.util.Scanner;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(),
                new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }

    @Override
    public String toString() {
        return ("SingleChallenge.Customer name: " + name + ", transactions: " + transactions);
    }
}
public class AutoboxingChallenge {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Customer Titi = new Customer("Titi", 200);
        System.out.println(Titi);

        Bank bank =new Bank("TPBank");
        bank.addNewCustomer("Ro", 4000.0);
        System.out.println(bank);

        bank.addTransaction("Ro", -200.0);
        bank.addTransaction("Ro", 400);
        bank.printStatement("Ro");
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(500);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SingleChallenge.Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName) {
        for (var customer: customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("SingleChallenge.Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New customer added: " + customer);
        }
    }

    public void addTransaction(String customerName, double transaction) {
        Customer customer = getCustomer(customerName);
        if (customer != null) {
            customer.transactions().add(transaction);
        }
    }

    public void printStatement(String customerName) {
        Customer customer = getCustomer(customerName);
        if (customer == null) {
            return;
        }
        double sum = 0;
        System.out.println("-".repeat(30));
        System.out.println("SingleChallenge.Customer name: " + customerName);
        System.out.println("Transactions: ");
        for (double tran: customer.transactions()) {
            System.out.printf("$%10.2f (%s)%n", tran, tran < 0 ? "debit" : "credit");
            sum += tran;
        }
        System.out.println("Account remain: " + sum);
    }
}

















