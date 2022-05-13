package at.campus02.iwi;

public class Window extends RoomOpening {
    private boolean canBeOpened;
    public Window(double x, double y, double w, double h, boolean opened) {
        super(x, y, w, h);
        canBeOpened = opened;
    }

}