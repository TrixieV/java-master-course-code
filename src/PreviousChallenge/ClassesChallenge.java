package PreviousChallenge;

public class ClassesChallenge {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountNumber("12222223");
        account.setEmail("titi@gmail.com");
        account.setCustomerName("Ti");
        account.setPhoneNumber("017623619981");

        account.deposit(3000);
        account.withdraw(500);
    }
}
