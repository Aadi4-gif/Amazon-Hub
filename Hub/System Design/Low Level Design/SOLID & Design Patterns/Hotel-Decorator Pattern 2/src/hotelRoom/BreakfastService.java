package hotelRoom;
import hotelRoom.Room;
import hotelRoom.RoomDecorator;

public class BreakfastService extends RoomDecorator {
    public BreakfastService(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + " With Breakfast";
    }

    @Override
    public int getCost() {
        return room.getCost() + 500;
    }
}
