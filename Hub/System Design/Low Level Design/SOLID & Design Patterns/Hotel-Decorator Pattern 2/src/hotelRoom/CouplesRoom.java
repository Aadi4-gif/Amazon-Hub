package hotelRoom;

public class CouplesRoom extends RoomDecorator{
    public CouplesRoom(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + " With CoupleBed";
    }

    @Override
    public int getCost() {
        return room.getCost() + 2000;
    }
}
