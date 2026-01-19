package Lab7;

class LuxurySuite extends Room{
    String breakPick;
    LuxurySuite() {
        super();
        breakPick="No";
    }
    public LuxurySuite(int roomNum, String guestName, int numNight, String breakPick) {
        super(roomNum, guestName, numNight);
        this.breakPick = breakPick;
    }
    double calculateRoomCost(){
        double cost = numNight * 200;
        if (breakPick.equalsIgnoreCase("Included")) {
            cost += 75;
        }
        return cost;
    }
    void displayRoomDetails(){
        System.out.println("\n--- Luxury Suite ---");
        super.displayRoomDetails();
        System.out.println("Breakfast & Airport Pickup: " + breakPick);
        System.out.println("Total Cost: "+calculateRoomCost());
        System.out.println("Discounted Cost (per night $15 off): $" + calculateRoomCost(15));
    }
}
