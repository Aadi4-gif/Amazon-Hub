package hotelRoom;

public class Main {
    public static void main(String[] args){
Room room = new BasicRoom();
        System.out.println("Description: " + room.getDescription() + " Cost: " + room.getCost());
        room = new CouplesRoom(room);
        room = new ACRoom(room);
        room = new BreakfastService(room);
        System.out.println("Description: " + room.getDescription() + " Cost: " + room.getCost());
    }
    
}