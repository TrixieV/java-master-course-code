package PreviousChallenge;

public class BurgerChallengeMain {
    public static void main(String[] args) {
//        PreviousChallenge.MealOrder meal = new PreviousChallenge.MealOrder();
        MealOrder meal = new MealOrder("Star PreviousChallenge.Burger",
                "Coke", "Salad");
        meal.addBurgerTopping("avocado", "cheese", "salami");
        meal.setDrinkSize("large");
        meal.printItemList();
    }
}
