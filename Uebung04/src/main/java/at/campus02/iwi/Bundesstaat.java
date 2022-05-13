package at.campus02.iwi;

import java.util.ArrayList;

public class Bundesstaat extends Land {
    private ArrayList<Land> laender;

    public Bundesstaat()
    {
        laender = new ArrayList<Land>();
    }
    public void addLand(Land l)
    {
        laender.add(l);

    }
    @Override
    public double getBruttoSozialProdukt() {
        double sum = 0;

        for(Land l : laender)
        {
            sum += l.getBruttoSozialProdukt();
        }

        return sum;
    }
}
