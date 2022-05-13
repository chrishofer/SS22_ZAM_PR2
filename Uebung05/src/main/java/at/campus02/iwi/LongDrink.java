package at.campus02.iwi;

public class LongDrink extends Getraenk{
    protected Fluessigkeit spirituose;
    protected Fluessigkeit filler;
    public LongDrink(String n, Fluessigkeit spirituose, Fluessigkeit filler) {
        super(n);
        this.spirituose = spirituose;
        this.filler = filler;
    }
    @Override
    public boolean beinhaltetAlkohol() {
        if(spirituose.getAlkoholProzent() > 0 || filler.getAlkoholProzent() > 0)
        {
            return true;
        }
        return false;
    }
    @Override
    public int getAnzahlZutaten() {
        return 2;
    }
    @Override
    public double mengeInMl() {
        return spirituose.getMenge() + filler.getMenge();
    }

    @Override
    public boolean brennt() {
        if(spirituose.getAlkoholProzent() > 30 || filler.getAlkoholProzent() > 30)
        {
            return true;
        }
        return false;
    }

}
