package Lab7;
class Room {
    int roomNum;
    String guestName;
    int numNight;
    Room(){
        roomNum=000;
        guestName="Unknown";
        numNight=0;
    }
    Room(int roomNum, String guestName, int numNight) {
        this.roomNum = roomNum;
        this.guestName = guestName;
        this.numNight = numNight;
    }
    void displayRoomDetails(){
        System.out.println("Room Number: "+roomNum);
        System.out.println("Guest Name: "+guestName);
        System.out.println("Nights: "+numNight);
    }
    double calculateRoomCost(){
        return 150*numNight;
    }
    double calculateRoomCost(double discount){
        return (calculateRoomCost() - (discount * numNight));
    }
}
