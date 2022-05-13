package at.campus02.iwi;

public class GiroKonto extends Konto {
    protected double limit;
    public GiroKonto(String inhaber, double limit) {

        super(inhaber);
        this.limit = limit;
    }
    @Override
    public void einzahlen(double wert) {

        if (wert < 0 )
        {
            return;
        }
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if (wert < 0 )
        {
            return 0;
        }
        if (wert > (kontostand + limit))
        {
            wert = kontostand + limit;
            kontostand = -limit;
            return wert;
        }
        return super.auszahlen(wert);

    }

}