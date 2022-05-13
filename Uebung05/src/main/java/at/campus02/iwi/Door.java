package at.campus02.iwi;

public class Door extends RoomOpening {
    private Room room1, room2;
    public Door(double x, double y, double w, double h, Room r1, Room r2) {
        super(x, y, w, h);
        room1 = r1;
        room2 = r2;
    }
    public Room getRoom1() {
        return room1;
    }
    public Room getRoom2() {
        return room2;
    }
}