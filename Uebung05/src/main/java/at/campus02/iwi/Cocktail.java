package at.campus02.iwi;

import java.util.ArrayList;

public class Cocktail extends Getraenk {
    protected ArrayList<Fluessigkeit> bestandteile;
    public Cocktail(String n, ArrayList<Fluessigkeit> b) {
        super(n);
        bestandteile = b;
    }
    @Override
    public boolean beinhaltetAlkohol() {
        for(Fluessigkeit f : bestandteile)
        {
            if(f.getAlkoholProzent() > 0)
            {
                return true;
            }
        }
        return false;
    }
    @Override
    public int getAnzahlZutaten() {
        return bestandteile.size();
    }
    @Override
    public double mengeInMl() {
        double sum = 0;

        for(Fluessigkeit f : bestandteile)
        {
            sum += f.getMenge();
        }

        return sum;
    }

    @Override
    public boolean brennt() {
        for(Fluessigkeit f : bestandteile)
        {
            if(f.getAlkoholProzent() > 30)
            {
                return true;
            }
        }
        return false;
    }
}