package Lab7;
class Meal {
    String orderID;
    String customerName;
    int quantity;
    Meal() {
        orderID = "000";
        customerName = "Guest";
        quantity = 0;
    }
    Meal(String orderID, String customerName, int quantity) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.quantity = quantity;
    }
    void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: $" + calculateBill());
    }
    double calculateBill() {
        return 12.00 * quantity;
    }
    double calculateBill(int couponAmount) {
        return calculateBill() - couponAmount;
    }
}