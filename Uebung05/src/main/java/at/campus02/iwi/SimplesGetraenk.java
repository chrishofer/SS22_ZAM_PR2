package at.campus02.iwi;

public class SimplesGetraenk extends Getraenk {
    protected Fluessigkeit bestandteil;
    public SimplesGetraenk(String n, Fluessigkeit b) {
        super(n);
        bestandteil = b;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        // TODO Auto-generated method stub
        if(bestandteil.getAlkoholProzent() > 0)
        {
            return true;
        }
        return false;
    }
    @Override
    public int getAnzahlZutaten() {
        return 1;
    }
    @Override
    public double mengeInMl() {
        return bestandteil.getMenge();
    }
    @Override
    public boolean brennt() {
        if(bestandteil.getAlkoholProzent() > 30)
        {
            return true;
        }
        return false;
    }
}
