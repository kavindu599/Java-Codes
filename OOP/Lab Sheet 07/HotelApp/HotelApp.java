package Lab7;

class HotelApp {
    public static void main(String[] args) {
        StandardRoom standardRoom = new StandardRoom();
        LuxurySuite luxurySuite = new LuxurySuite(305, "Alice Green", 3, "Included");
        standardRoom.displayRoomDetails();
        luxurySuite.displayRoomDetails();
    }
}
