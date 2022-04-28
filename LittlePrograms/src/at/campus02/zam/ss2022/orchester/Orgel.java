package at.campus02.zam.ss2022.orchester;

public class Orgel extends Instrument {
    public Orgel(String n, int l) {
        super(n, l);
    }

    @Override
    public int play() {
        System.out.println("Die Orgel " + name + " pfeift durch die leeren Hallen");
        return lautstaerke;
    }
}
