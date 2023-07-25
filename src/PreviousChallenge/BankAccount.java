package PreviousChallenge;

public class BankAccount {
    private String accountNumber;
    private double accountBalance = 1000;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void deposit(double money) {
        if (money < 0) {
            System.out.println("Deposit must be more than 0");
        }
        else {
            this.accountBalance += money;
            System.out.println("Deposit of " + money
                    + " was made. New balance is: " + this.accountBalance);
        }


    }

    public void withdraw(double money) {
        if (money < 0) {
            System.out.println("Withdraw must be more than 0");
        }
        else if (money > this.accountBalance) {
            System.out.println("Withdraw must smaller than account balance");
        }
        else {
            this.accountBalance -= money;
            System.out.println("Withdraw of " + money
                    + " was made. New balance is: " + this.accountBalance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
