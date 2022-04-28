package at.campus02.zam.ss2022.orchester;

public class Gitarre extends Instrument{
    public Gitarre(String n, int l) {
        super(n, l);
    }

    @Override
    public int play() {
        System.out.println("Gitarre " + name + " lässt ihre Saiten klingen");
        return lautstaerke;
    }
}
