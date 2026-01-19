package Lab7;
class RegularMeal extends Meal {
    boolean isVegetarian;
    RegularMeal() {
        super();
        isVegetarian = true;
    }
    RegularMeal(String orderID, String customerName, int quantity, boolean isVegetarian) {
        super(orderID, customerName, quantity);
        this.isVegetarian = isVegetarian;
    }
    double calculateBill(int couponAmount) {
        double totalBill = calculateBill() - couponAmount;
        return (totalBill < 0) ? 0.0 : totalBill;
    }

    void displayOrderDetails() {
        System.out.println("\nRegular Meal");
        super.displayOrderDetails();
        System.out.println("Meal Type: " + (isVegetarian ? "Vegetarian" : "Non-Vegetarian"));
        System.out.println("Bill with $2 coupon: $" + calculateBill(2));
    }
}