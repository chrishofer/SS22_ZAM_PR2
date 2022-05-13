package at.campus02.iwi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Registrierkasse {
    private static int verkaufteGetraenke = 0;
    private ArrayList<Getraenk> getraenke;

    public Registrierkasse() {
        getraenke = new ArrayList<Getraenk>();
    }

    public void verkauft(Getraenk g)
    {
        getraenke.add(g);
        ++verkaufteGetraenke;
    }
    public static int getVerkaufteGetraenke() {
        return verkaufteGetraenke;
    }

    public void printGetraenkeSortiertNachAnzahlZutaten()
    {
        Collections.sort(getraenke, new AnzahlZutatenComparator());
        printHelper();
    }

    public void printGetraenkeSortiertNachMl()
    {
        Collections.sort(getraenke, new MlComparator());
        printHelper();
    }
    private void printHelper()
    {
        System.out.println("In Summe verkauft: " + verkaufteGetraenke);
        for(Getraenk g : getraenke)
        {
            System.out.println(g);
        }
    }
    public HashMap<Integer, ArrayList<Getraenk>> getGetraenkeAufgeteiltNachZutaten()
    {
        HashMap<Integer, ArrayList<Getraenk>> erg = new HashMap<Integer, ArrayList<Getraenk>>();
        ArrayList<Getraenk> al;

        for(Getraenk g : getraenke)
        {
            int anz = g.getAnzahlZutaten();
            if(erg.containsKey(anz))
            {
                // already present
                al = erg.get(anz);
                al.add(g);
            }
            else
            {
                al = new ArrayList<Getraenk>();
                al.add(g);
                erg.put(anz, al);
            }
        }

        return erg;
    }

}