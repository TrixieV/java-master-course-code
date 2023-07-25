package PreviousChallenge;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishwasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishwasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public void setKitchenWork (boolean coffeeFlag, boolean dishFlag,
                                boolean fridgeFlag) {
        brewMaster.setHasWorkToDo(coffeeFlag);
        dishwasher.setHasWorkToDo(dishFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        dishwasher.doDishes();
        iceBox.orderFood();
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing dishes");
            hasWorkToDo = false;
        }
    }
}