package at.campus02.iwi;

import java.util.ArrayList;

public class WasserstandManager {
    private ArrayList<Wasserstand> wasser;

    public WasserstandManager() {
        wasser = new ArrayList<Wasserstand>();
    }


    public void add(Wasserstand w)
    {
        wasser.add(w);
    }
    public Wasserstand findById(int id)
    {
        for(Wasserstand w : wasser)
        {
            if(w.getId() == id)
            {
                return w;
            }
        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName)
    {
        ArrayList<Wasserstand> erg = new ArrayList<Wasserstand>();

        for(Wasserstand w : wasser)
        {
            if(w.getGewaesserName().equals(gewaesserName))
            {
                erg.add(w);
            }
        }
        return erg;
    }
    public Wasserstand findLastWasserstand(String gewaesserName)
    {
        Wasserstand erg = null;

        for(Wasserstand w : findAllByGewaesser(gewaesserName))
        {
            if(erg == null || erg.getZeitpunkt() < w.getZeitpunkt())
            {
                erg = w;
            }
        }

        return erg;
    }

    public ArrayList<Wasserstand> findForAlarmierung()
    {
        ArrayList<Wasserstand> erg = new ArrayList<Wasserstand>();

        for(Wasserstand w : wasser)
        {
            if(w.getMessWert() >= w.getMessWertFuerAlarmierung())
            {
                erg.add(w);
            }
        }
        return erg;
    }

    public double calcMittlererWasserstand(String gewaesserName, String ort)
    {
        double mw = 0;
        int anzahl = 0;

        for(Wasserstand w : wasser)
        {
            if(w.getGewaesserName().equals(gewaesserName) && w.getOrt().equals(ort))
            {
                mw += w.getMessWert();
                anzahl += 1;
            }
        }

        return mw / anzahl;

    }

    public ArrayList<Wasserstand> findByZeitpunkt(int von, int bis, String gewaesserName, String ort)
    {
        ArrayList<Wasserstand> erg = new ArrayList<Wasserstand>();

        for(Wasserstand w : wasser)
        {
            if(w.getGewaesserName().equals(gewaesserName) && w.getOrt().equals(ort) &&
                    w.getZeitpunkt() >= von && w.getZeitpunkt() <= bis)
            {
                erg.add(w);
            }
        }
        return erg;

    }



}