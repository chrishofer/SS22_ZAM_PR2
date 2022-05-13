package at.campus02.iwi;

public class BalconyDoor extends Door {
    private boolean tiltable;

    public BalconyDoor(double x, double y, double w, double h, Room r1, Room r2, boolean t)
    {
        super(x, y, w, h, r1, null);
        tiltable = t;

    }
}