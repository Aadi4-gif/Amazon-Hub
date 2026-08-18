package hotelRoom;

public class ACRoom extends RoomDecorator{
    public ACRoom(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + " With AirConditioning";
    }

    @Override
    public int getCost() {
        return room.getCost() + 1000;
    }
}
