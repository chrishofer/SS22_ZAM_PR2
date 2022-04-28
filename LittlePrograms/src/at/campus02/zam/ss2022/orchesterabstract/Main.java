package at.campus02.zam.ss2022.orchesterabstract;

public class Main {
    public static void main(String[] args) {
        Gitarre g = new Gitarre("Roberto", 10);
        Floete f = new Floete("Hansi", 8);
        Orgel o = new Orgel("Orgelito", 14);
        // does not work because abstract
        //Instrument i = new Instrument("Instru",2);

        //upcasting works
        Instrument i = o;


        Orchester or = new Orchester();
        or.addInstrument(g);
        or.addInstrument(f);
        or.addInstrument(o);
        or.playAll();
    }
}
