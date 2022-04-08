package at.campus02.zam.ss2022;

public class TuerApp {
    public static void main(String[] args) {
        Tuer t = new Tuer(100,210, Himmelsrichtung.NORDEN);
        t.setOeffnungsRichtung(Himmelsrichtung.SUEDEN);
        System.out.println(t.getOeffnungsRichtung());
        System.out.println(t);
    }
}
