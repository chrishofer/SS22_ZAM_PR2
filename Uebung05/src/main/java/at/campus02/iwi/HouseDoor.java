package at.campus02.iwi;

public class HouseDoor extends Door {
    private boolean securityDoor;

    public HouseDoor(double x, double y, double w, double h, Room r1, boolean s)
    {
        super(x, y, w, h, r1, null);
        securityDoor = s;

    }
}