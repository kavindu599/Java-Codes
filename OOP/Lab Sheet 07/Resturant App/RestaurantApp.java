package Lab7;
class RestaurantApp {
    public static void main(String[] args) {
        RegularMeal regularMeal = new RegularMeal();
        ComboMeal comboMeal = new ComboMeal("C102", "Alice Green", 2, true);

        regularMeal.displayOrderDetails();
        comboMeal.displayOrderDetails();
    }
}