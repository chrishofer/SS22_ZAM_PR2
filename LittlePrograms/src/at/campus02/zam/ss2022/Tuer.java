package at.campus02.zam.ss2022;

public class Tuer {
    private int breite;
    private int hoehe;
    private Himmelsrichtung oeffnungsRichtung;

    public Tuer(int breite, int hoehe, Himmelsrichtung oeffnungsRichtung) {
        this.breite = breite;
        this.hoehe = hoehe;
        this.oeffnungsRichtung = oeffnungsRichtung;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public Himmelsrichtung getOeffnungsRichtung() {
        return oeffnungsRichtung;
    }

    public void setOeffnungsRichtung(Himmelsrichtung oeffnungsRichtung) {
        this.oeffnungsRichtung = oeffnungsRichtung;
    }

    @Override
    public String toString() {
        return "Tuer{" +
                "breite=" + breite +
                ", hoehe=" + hoehe +
                ", oeffnungsRichtung=" + oeffnungsRichtung +
                '}';
    }
}
