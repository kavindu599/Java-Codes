package Lab7;

class StandardRoom extends Room {
    String wifi;
    StandardRoom(){
        super();
        wifi = "No";
    }
    StandardRoom(int roomNum, String guestName, int numNight, String wifi) {
        super(roomNum, guestName, numNight);
        this.wifi = wifi;
    }
    double calculateRoomCost(){
        return numNight * 100;
    }
    void displayRoomDetails(){
        System.out.println("\n--- Standard Room ---");
        super.displayRoomDetails();
        System.out.println("Wi-Fi Included: " + wifi);
        System.out.println("Total Cost: "+calculateRoomCost());
        System.out.println("Discounted Cost (per night $10 off): $" + calculateRoomCost(10));
    }
}
