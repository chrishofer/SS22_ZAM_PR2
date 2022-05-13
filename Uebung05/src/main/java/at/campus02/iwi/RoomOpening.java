package at.campus02.iwi;

public abstract class RoomOpening {
    private double posx, posy, width, height;

    public RoomOpening(double x, double y, double w, double h) {
        posx = x;
        posy = y;
        width = w;
        height = h;
    }


    public double getPosx() {
        return posx;
    }


    public void setPosx(double posx) {
        this.posx = posx;
    }


    public double getPosy() {
        return posy;
    }


    public void setPosy(double posy) {
        this.posy = posy;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }


}