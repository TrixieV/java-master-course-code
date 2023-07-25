package PreviousChallenge;

public class KitchenMain {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

        kitchen.setKitchenWork(false, true, true);
        kitchen.doKitchenWork();
    }
}
