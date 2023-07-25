package BillBurgerChallenge;

public class Store {
    public static void main(String[] args) {
        Meal regularMeal = new Meal();
        regularMeal.addToppings("Ketchup", "Avocado", "Bacon");
        System.out.println(regularMeal);

        Meal USMeal = new Meal(0.68);
        USMeal.addToppings("Cheese", "Mustard", "Cucumber");
        System.out.println(USMeal);
    }
}
