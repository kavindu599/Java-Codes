package Lab7;
class ComboMeal extends Meal {
    boolean includesDrinkAndDessert;
    ComboMeal() {
        super();
        includesDrinkAndDessert = false;
    }
    ComboMeal(String orderID, String customerName, int quantity, boolean includesDrinkAndDessert) {
        super(orderID, customerName, quantity);
        this.includesDrinkAndDessert = includesDrinkAndDessert;
    }
    double calculateBill() {
        double cost = quantity * 15.00;
        if (includesDrinkAndDessert) {
            cost += 5;
        }
        return cost;
    }
    void displayOrderDetails() {
        System.out.println("\nCombo Meal");
        super.displayOrderDetails();
        System.out.println("Includes Drink & Dessert: " + (includesDrinkAndDessert ? "Yes" : "No"));
        System.out.println("Bill with $3 coupon: $" + calculateBill(3));
    }
}
