package at.campus02.iwi;

public class Event {
    // could also be private (with getter/setter)
    protected String title;
    protected String ort;
    protected double eintrittspreis;

    public Event(String title, String ort, double eintrittspreis) {
        super();
        this.title = title;
        this.ort = ort;
        this.eintrittspreis = eintrittspreis;
    }
    @Override
    public String toString() {

        return title + " " + ort + " " + eintrittspreis;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getEintrittspreis() {
        return eintrittspreis;
    }

    public void setEintrittspreis(double eintrittspreis) {
        this.eintrittspreis = eintrittspreis;
    }



}