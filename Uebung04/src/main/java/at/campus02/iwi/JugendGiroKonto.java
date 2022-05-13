package at.campus02.iwi;

public class JugendGiroKonto extends GiroKonto {
    protected double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {

        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public void einzahlen(double wert) {

        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {


        if (wert > buchungslimit) {
            return super.auszahlen(buchungslimit);
        }

        return super.auszahlen(wert);

        // alternative moeglichkeit
//		if (wert < buchungslimit)
//		{
//			return super.auszahlen(wert);
//		}
//		if(wert > (kontostand + limit))
//		{
//			wert = kontostand + limit;
//			kontostand = -limit;
//			return wert;
//		}
//		return super.auszahlen(buchungslimit);
    }
}