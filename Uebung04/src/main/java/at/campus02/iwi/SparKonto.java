package at.campus02.iwi;

public class SparKonto extends Konto {
    protected double limit;
    public SparKonto(String inhaber) {

        super(inhaber);
    }
    @Override
    public void einzahlen(double wert) {

        if (wert < 0)
        {
            return;
        }
        super.einzahlen(wert);
    }
    @Override
    public double auszahlen(double wert) {

        if (wert < 0)
        {
            return 0;
        }
        if(wert > kontostand)
        {
            wert = kontostand;
            kontostand = 0;
            return wert;
        }
        return super.auszahlen(wert);
    }
}