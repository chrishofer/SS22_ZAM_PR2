package at.campus02.zam.ss2022.orchester;

public class Main {
    public static void main(String[] args) {
        Gitarre g = new Gitarre("Roberto", 10);
        Floete f = new Floete("Hansi", 8);
        Orgel o = new Orgel("Orgelito", 14);

        Orchester or = new Orchester();
        or.addInstrument(g);
        or.addInstrument(f);
        or.addInstrument(o);
        or.playAll();
    }
}
